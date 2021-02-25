**************************************APPROACH 2 USING VISITED as a Field inside every Node of Link List********************************

//Java program for Check, whether Link List has a Loop Using VISITED as a field in Link List
//So here we are traversing the List Once to check loop-> Time Comp(In Worst Case)->O(N)

package Singly_Linked_List;

import java.util.Scanner;

class CheckLoopInLinkList2{

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
			
			//Checking if current node is pointing back to the node, which is already visited, i.e, whose visited is "1"
			if(current.visited==current.next.visited)
			{
				//here printing the data part of the nodes which are forming a loop
				System.out.println("\nThere is loop is linked list "+current.data+" is pointing back to "+current.next.data);
                                return;
			}
			
			//incrementing the current pointer pointer to next node 		
			current=current.next;
			
		}
	}
	
	public static void main(String[]args)
	{
		CheckLoopInLinkList2 first=new CheckLoopInLinkList2();
		first.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(40);
		Node fifth=new Node(50);
		Node sixth=new Node(60); 
		
		first.head.next=second;
		second.next=third;
		third.next=fourth;
		
		//Here Loop Occurs 4th node pointing back to 2nd
		fourth.next=second;
		fifth.next=sixth; 
		sixth.next=null;
		
		first.head.visited=0;
		second.visited=0;
		third.visited=0;
		fourth.visited=0;
		fifth.visited=0; 
		sixth.visited=0;
		
		new CheckLoopInLinkList2().checkloop(first.head);
       
}	        
}	
