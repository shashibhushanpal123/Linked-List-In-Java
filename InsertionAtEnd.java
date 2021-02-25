//Java program for Inserting at End of a Linked List

package Singly_Linked_List;
public class InsertionAtEnd {

	int count;
	
	void printinglist(Node headreference)
	{
		//if head is null, that is no elements in List, then simply return
		if(headreference==null)
		{
			return;
		}
		
		//current pointing to the head node
		Node current=headreference;
		
		//traversing whole list while "null" is not encountered
		while(current!=null)
		{
			System.out.print(current.data+"-> ");
			count++;
			current=current.next;
		}
		
		//here current becomes null
		System.out.println(current);
		System.out.println("length of Linked List is "+count);
		
		}
	
	void InsertAtLast(Node ReferenceOfHead)
	{
		//if head is null, that is no elements in List, then simply return
		if(ReferenceOfHead==null)
		{
			return;
		}
		
		Node newly=new Node(70);
	    System.out.println("Now Inserting "+newly.data+" at end of existing List ");
		Node current1=ReferenceOfHead;
	    while(current1.next!=null)
	    {
	    	System.out.print(current1.data+"-> ");
	    	count++;
	    	current1=current1.next;
	    }
	   	 
	    System.out.print(current1.data+"-> ");
	    count++;
	    
	    //"next" of newly is pointing to previous node's next(which is null)
	    newly.next=current1.next;
	    
	    //curren1(which was last node previously) its next is pointing to newly node
	    current1.next=newly;
	    count++;
	    
	    //And newly node's next is pointing to (it's previous node's->next->next) which is "null"
	    System.out.println(newly.data+"-> "+current1.next.next);
	    
	    System.out.println("Length of Linked List now becomes "+count);
	    
	}

}

class Creation {
	
	public static void main(String[]args)
	{
		Node head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(40);
		Node fifth=new Node(50);
		Node sixth=new Node(60);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		sixth.next=null;
		
		//passing head node reference
		new InsertionAtEnd().printinglist(head);
		
		
		/* Below is Naive Approach(HARDCODED)
		 
		//newly node created
		Node newly=new Node(70);
		
		//newly node points to "null"
		newly.next=null;
		
		//sixth node(which islast node, previously) pointing to newly node
		sixth.next=newly;
		
		new InsertionAtBeginning().printinglist(head);

	    */
	
		//Below is good approach, iterating till we get last element's next pointing to null
		
		new InsertionAtEnd().InsertAtLast(head);
		
		
		
	}
	
}

class Node
{
  int data;
  Node next;
  
  Node(int data)
  {
	  this.data=data;
	  next=null;
  }
}
