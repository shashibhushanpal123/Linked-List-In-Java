//Java program for Reversing a Linked List

package Singly_Linked_List;

import java.util.Scanner;

public class ReverseList{

	Node head; 
	
    //maintaining previous pointer(i.e, pointing to previous node)
	Node previous=null;
	
	int count;
	
	static class Node
	{
	  int data;
	  Node next;
	  
	  Node(int data)
	  {
		  this.data=data;
		  next=null;
	  }
	}

	
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
	
	Node reverse(Node head)
	{
		//maintaining current pointer
		Node current=head;
		
		//maintaining next pointer
		Node next=null;
		
		if(head==null) //iterating till "null" is encountered
		{
			System.out.println("List is Empty");
			return head;
		}
	
		while(current!=null)
		{
	       next=current.next; //next pointer, points to curren node's next node
	       current.next=previous; //current pointer, pointing to current node
	       previous=current; //previous pointer pointing to previous of curren's node
	       current=next;
		}
		
		return previous; //returning reference of previous node
	}		

	public static void main(String[]args)
	{
		ReverseList first=new ReverseList();
		first.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(40);
		Node fifth=new Node(50);
		Node sixth=new Node(60);
		
		first.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		sixth.next=null;
		
		new ReverseList().printinglist(first.head);
        
		//Holding the reference of previous node into header pointer
		Node header=new ReverseList().reverse(first.head);
        
		//printing list in reverse order
		new ReverseList().printinglist(header); 
        
}	
		
}
