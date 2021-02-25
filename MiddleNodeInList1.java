//Java program for Finding Middle Node in a Linked List Using 2 Pointers(Fast and Slow Pointers)
// So here we are traversing list only once-> Time->O(N)

package Singly_Linked_List;

import java.util.Scanner;

public class MiddleNodeInList{

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
	
	Node findmidnode(Node head)
	{
		//maintaining Fast pointer
		Node fastPtr=head;
		
		//maintaining Slow pointer
		Node slowPtr=head;
		
		if(head==null) //iterating till "null" is encountered
		{
			System.out.println("List is Empty");
			return head;
		}
	
		while(fastPtr!=null && fastPtr.next!=null) //Checking both conditions that it is not null and it's next should have some value
		{
			//fastPtr hop forward 2 lists at a time
			fastPtr=fastPtr.next.next;
			
			//slowPtr hop forward 1 list at a time
			slowPtr=slowPtr.next;
		}
		
		return slowPtr; //returning reference of middle node
	}		

	public static void main(String[]args)
	{
		MiddleNodeInList first=new MiddleNodeInList();
		first.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(40);
		Node fifth=new Node(50);
		//Node sixth=new Node(60); --->>>> On Uncommenting it gives 40 as middle
		
		first.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		//fifth.next=sixth;  --->>>> On Uncommenting it gives 40 as middle
		//sixth.next=null;   --->>>> On Uncommenting it gives 40 as middle
		
		new MiddleNodeInList().printinglist(first.head);
        
		//Holding the reference of middle node into header pointer
		Node header=new MiddleNodeInList().findmidnode(first.head);
        
		//printing middle node in Linked List
		System.out.println("Middle Node is "+header.data);  //30 for ODD List(of size 5), and 40 for Even List(of size 6)
        
}	
		
}
