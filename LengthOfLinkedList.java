//Java Program for illustrating Length of LinkedList

package Singly_Linked_List;
public class LengthOfLinkedList {

	int count;
	
	void printinglist(Node headreference)
	{
		//current pointing to the head node
		Node current=headreference;
		
		//traversing whole list while "null" is not encountered
		while(current!=null)
		{
			System.out.print(current.data+"-> ");
			count++;
			current=current.next;
		}
		
		//Here count becomes "null"
		System.out.println(count);
		
		System.out.println("\n"+"length of Linked List is "+count);
		
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
		new LengthOfLinkedList().printinglist(head);
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
