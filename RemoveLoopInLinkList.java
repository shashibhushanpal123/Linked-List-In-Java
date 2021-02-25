//Java Program to Detect and Remove Loop from a Link List

package Singly_Linked_List;

import java.util.Scanner;

public class RemoveLoopInLinkList{

	Node head;
	int count;
	
	static class Node
	{
	  int data;
	  Node next;
	  int visited=0; //Introduced new field inside every node of Link List
	  
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

	void checkloop(Node head)
	{	
		//current pointing to the head node
		Node current=head;
		
		//traversing whole list while "null" is not encountered
		while(current!=null)
		{
			System.out.print(current.data+"-> ");
			
			//incrementing visited field of every node, which is visited
			++current.visited;
			
			//Detection and Removal of Loop from Linl List
			if(current.visited==current.next.visited)
			{
				//here printing the data part of the nodes which are forming a loop
				System.out.println("\nThere is loop is linked list "+current.data+" is pointing back to "+current.next.data);
                
				//Here Removing loop from Link List
				System.out.println("\nRemoving loop from Link List");
				current.next=null;
				new RemoveLoopInLinkList().printinglist(head);
				return;
			}
			
			//incrementing the current pointer pointer to next node 		
			current=current.next;
			
		}
	}
	
	public static void main(String[]args)
	{
		RemoveLoopInLinkList first=new RemoveLoopInLinkList();
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
		
		//Here Loop Occurs 4th node pointing back to 1st
		sixth.next=first.head;
		
		first.head.visited=0;
		second.visited=0;
		third.visited=0;
		fourth.visited=0;
		fifth.visited=0; 
		sixth.visited=0;
		
		new RemoveLoopInLinkList().checkloop(first.head);
       
}	        
}	