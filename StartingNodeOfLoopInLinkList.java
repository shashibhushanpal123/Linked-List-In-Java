//Java program for finding starting node of loop in Linked List
//So here we are traversing the List Once to check loop-> Time Comp(In Worst Case)->O(N)

package Singly_Linked_List;

import java.util.Scanner;

class StartingNodeOfLoopInLinkList{

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
		
		//to check whether loop exist or not
		int loopexist=0;
		
		//traversing whole list while "null" is not encountered
                while(fastptr!=null)
		{
			System.out.print(slowptr.data+"-> ");
			fastptr=fastptr.next.next;
			slowptr=slowptr.next;
		
			//loop checking condition, if both pointers ae pointing to same node
			if(fastptr==slowptr)
			{
				System.out.println("\nThere is a loop in Link List");
				
				//here loopexist becomes 1 since loop exist
			    loopexist=1;
			    break;
			}
				
	  	}
		
		if(loopexist==1)
		{
			//assigning slowptr points to headreference
		slowptr=head;
		while(slowptr!=fastptr)
		{
			//incrementing both of them in steps of 1
			slowptr=slowptr.next;
			fastptr=fastptr.next;
		}

		//first node of the loop in Link List
		System.out.println("First node of loop is "+slowptr.data);
		
		}
	}
	
	public static void main(String[]args)
	{
		StartingNodeOfLoopInLinkList first=new StartingNodeOfLoopInLinkList();
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
		
		//Here Loop Occurs 5th node pointing back to 2nd so 1st node of loop is "2"
		fifth.next=second; 
		sixth.next=null;
		
      	new StartingNodeOfLoopInLinkList().checkloop(first.head);
       
}	        
}	
