//Java program for illustrating Singly Linked List Traversal/Printing

package Singly_Linked_List;
public class Traversing {

	void printinglist(Node headreference)
	{
		//current pointing to the head node
		Node current=headreference;
		
		//traversing whole list while "null" is not encountered
		while(current!=null)
		{
			System.out.print(current.data+"-> ");
			current=current.next;
		}
		
		//Here current becomes "null"
		System.out.println(current);
		
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
		new Traversing().printinglist(head);
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
