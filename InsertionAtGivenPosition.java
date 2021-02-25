//Java program for Insertion At Given Position In a Linked List

package Singly_Linked_List;

import java.util.Scanner;

public class InsertionAtGivenPosition {

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
	
	void insertatgivenpos(Node headref, int pos)
	{
		Node loopthrough=headref;
		int count=1;

		//Newly node created
	    Node newly=new Node(70);		
		
		if(pos==1)
		{
		   	newly.next=headref;
		   	headref=newly;
		   	new InsertionAtGivenPosition().printinglist(headref);
		   	return;
		}
		
		else if(pos==0)
		{
			System.out.println("position can't be zero, It's a Linked List, Not Array!!!");
			return;
			
		}
		
		while(count<pos-1) //since singly link list, so that's why (pos-1), since can't track previous one
		{
			count++;
			loopthrough=loopthrough.next;
		}
		
		//Newly's next pointing to the previous node's next
		newly.next=loopthrough.next;
	    
		//previous node's next pointing to newly
		loopthrough.next=newly;
		
		//Called from here and not from main because, headref is pointing to newly, but HEAD NOT!!!
		
		new InsertionAtGivenPosition().printinglist(headref);
		
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
		
		new InsertionAtGivenPosition().printinglist(head);
		
		System.out.println("Where you want to insert new Node ");
		Scanner sc=new Scanner(System.in);
		int position =sc.nextInt();
		

		new InsertionAtGivenPosition().insertatgivenpos(head, position);

		
		
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
