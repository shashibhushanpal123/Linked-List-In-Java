//Java program for Insertion Between a Linked List

package Singly_Linked_List;
public class InsertionInBetween {

	int count;
	
	void printinglist(Node headreference)
	{
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
	
	void insertbetween(Node head,Node previousref)
	{
		if(previousref==null)
		{
			System.out.println("Previous Reference can't be null");
			return;
		}
		
		Node newly=new Node(70);
	    System.out.println("Now Inserting "+newly.data+" after "+previousref.data);
	   	 
	    //newly node's next is pointing to (it's previous node's->next)
	    newly.next=previousref.next;
	    
	    //previousref (which is third) its next is pointing to newly node
	    previousref.next=newly;
		
		Node current2=head;
		while(current2!=null)
		{
		  System.out.print(current2.data+"-> ");
		  count++;
		  current2=current2.next;
		}
		
		System.out.println(current2);
		
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
		
		new InsertionInBetween().printinglist(head);
		
		new InsertionInBetween().insertbetween(head,third);
		
		
		
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
