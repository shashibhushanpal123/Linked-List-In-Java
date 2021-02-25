//Java program for Inserting at Beginning of a Linked List

package Singly_Linked_List;
public class InsertionAtBeginning {

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
		new InsertionAtBeginning().printinglist(head);
		
		System.out.println("Now inserting at Beginning of LInked List");
		
		//newly node created
		Node newly=new Node(70);
		
		//newly node points to head node
		newly.next=head;
		
		//head node's reference pointing to newly node
		head=newly;
		
		new InsertionAtBeginning().printinglist(head);
		
		
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
