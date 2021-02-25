//Java program for Deletion At End of a Linked List

package Singly_Linked_List;

import java.util.Scanner;

public class DeletionAtEnd {

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
	
	void DelAtEnd(Node headref)
	{
		Node loopthrough=headref;
		
		if(headref==null)
		{
			System.out.println("List is Empty");
			return;
		}
		
		while(loopthrough.next.next!=null)
		{
			loopthrough=loopthrough.next;
		}
		
		//To hold the reference of the last node, so to make it eligible for GC
		Node temp=loopthrough.next;
		
	    loopthrough.next=null;
	    
		//For GC the last non usable node/ gone node
		temp.next=null;
	
        new DeletionAtEnd().printinglist(headref);
		
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
		
		new DeletionAtEnd().printinglist(head);
		
        new DeletionAtEnd().DelAtEnd(head);

		
		
		
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
