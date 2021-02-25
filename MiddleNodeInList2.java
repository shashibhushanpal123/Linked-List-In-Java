//Java program for Finding Middle Node in a Linked List Using 1 Pointer Only
//So here we are traversing the List Twice-> Time comp->O(N)

package Singly_Linked_List;

import java.util.Scanner;

public class MiddleNodeInList2{

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
		int count=0;
		Node hopPtr=head;
		
		if(head==null) //iterating till "null" is encountered
		{
			System.out.println("List is Empty");
			return head;
		}
	
		while(hopPtr!=null)
		{
			hopPtr=hopPtr.next;
			count++;
		}
		
	   System.out.println("Total elements in list are "+count);
	   
	   //For holding middle node reference
	   Node middle=head;
	   
	   for(int i=0;i<count/2;i++) //runs half the length of list
	   {
		   middle=middle.next;
	   }
	   
	   return middle; //returning middle element
	 	  
	}		

	public static void main(String[]args)
	{
		MiddleNodeInList2 first=new MiddleNodeInList2();
		first.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(40);
		Node fifth=new Node(50);
		//Node sixth=new Node(60); 
		
		first.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		//fifth.next=sixth; 
		//sixth.next=null;
		
		new MiddleNodeInList2().printinglist(first.head);
        
		//Holding the reference of middle node into header pointer
		Node header=new MiddleNodeInList2().findmidnode(first.head);
        
		//printing middle node data of Linked List
		System.out.println("Middle element is "+header.data);
			
        
}	
		
}
