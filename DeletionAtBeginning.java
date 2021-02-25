//Java program for Deletion At Beginning of a Linked List

package Singly_Linked_List;

import java.util.Scanner;

public class DeletionAtBeginning {

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
	
	void DelAtBeg(Node headref)
	{
		//taking sample as a reference, pointing to headref,to keep track of remaining list, so that whole list won't be lost/gone
		Node sample=headref;
		
		if(headref==null)
		{
			System.out.println("List is Empty");
			return;
		}
		
		headref=headref.next;
		
		//For GC the first non usable node/ gone node
		sample.next=null;
	
        new DeletionAtBeginning().printinglist(headref);
		
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
		
		new DeletionAtBeginning().printinglist(head);
		
        new DeletionAtBeginning().DelAtBeg(head);

		
		
		
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
