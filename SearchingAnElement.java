//Java program for Searching An Element In a Linked List

package Singly_Linked_List;

import java.util.Scanner;

public class SearchingAnElement {

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
	
	void search(Node headref,int datapart)
	{
		int count=1; //to keep track of the position where element found
		Node loopthrough=headref;
		if(headref==null)
		{
			System.out.println("List is Empty");
			return;
		}
		
		
		while(loopthrough!=null)
		{
			if(loopthrough.data==datapart)
			{
				System.out.println("Element Found at position "+count);
				return;
			}
			
			count++;
			loopthrough=loopthrough.next;
			
		}
		
		System.out.println("Element Not Found");
		
				
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
		
		new SearchingAnElement().printinglist(head);
		
		System.out.println("Which node you want to Search, Enter Data Part ");
		Scanner sc=new Scanner(System.in);
		int datapart =sc.nextInt();
		
        new SearchingAnElement().search(head,datapart);	
		
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
