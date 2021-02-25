//java program for Singly LinkedList Creation

package Singly_Linked_List;

public class Creation {
	
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
