***************************************APPROACH 3 USING Using 2 Pointers(Fast and Slow)**************************************************

//Java program for Check, whether Link List has a Loop Using 2 Pointers, Slow Pointer and Fast pointer
//So here we are traversing the List Once to check loop-> Time Comp(In Worst Case)->O(N)

package Singly_Linked_List;

import java.util.Scanner;

public class CheckLoopInLinkList3{

	Node head;
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

	void checkloop(Node head)
	{	
		//both slow and fast pointers pointing to the head node
		Node slowptr=head;
		Node fastptr=head;
		
		//traversing whole list while "null" is not encountered
		while(fastptr!=null)
		{
			System.out.print(slowptr.data+"-> ");
			fastptr=fastptr.next.next;
			slowptr=slowptr.next;
		
			//loop checking condition, if both pointers ae pointing to same node
			if(fastptr==slowptr)
			{
				System.out.println("There is a loop in Link List, slowptr is pointing to "+slowptr.data+" as well as fastptr is pointing to "+fastptr.data);
				return;
			}
	  	}
		
	}
	
	public static void main(String[]args)
	{
		CheckLoopInLinkList3 first=new CheckLoopInLinkList3();
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
		
		//Here Loop Occurs 5th node pointing back to 1st
		fifth.next=first.head; 
		sixth.next=null;
		
      	new CheckLoopInLinkList3().checkloop(first.head);
       
}	        
}	
