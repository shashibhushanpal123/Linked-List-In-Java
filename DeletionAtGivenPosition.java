//Java program for Deletion At Given Position of a Linked List

package Singly_Linked_List;

import java.util.Scanner;

public class DeletionAtGivenPosition {

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
	
	void DelAtGivenPos(Node headref,int pos)
	{
		Node loopthrough=headref;
		int count=1;
		if(headref==null)
		{
			System.out.println("List is Empty");
			return;
		}
		
		if(pos==1)
		{
			Node temp=headref;
			headref=headref.next;
			temp=null;
			new DeletionAtGivenPosition().printinglist(headref);
			return;
		}
		
		
		while(count<pos-1)
		{
			loopthrough=loopthrough.next;
			count++;
		}
		
		//holing the node reference, which is going to be deleted
		Node savingdeletednode=loopthrough.next;
		
		//making the next of the previous node to the next of the deletion node
		loopthrough.next=loopthrough.next.next;
		
		//making next of the deletion node as null
		savingdeletednode.next=null;
		
		//making the deleted node eligible for GC
		savingdeletednode=null;
		
        new DeletionAtGivenPosition().printinglist(headref);
		
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
		
		new DeletionAtGivenPosition().printinglist(head);
		
		System.out.println("Which node you want to Delete ");
		Scanner sc=new Scanner(System.in);
		int position =sc.nextInt();
		
        new DeletionAtGivenPosition().DelAtGivenPos(head,position);

		
		
		
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
