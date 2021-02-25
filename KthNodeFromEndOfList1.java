//Java program for Finding Kth Node From End of Link List Using 1 Pointer Only
//So here we are traversing the List Twice-> Time comp->O(N)

package Singly_Linked_List;

import java.util.Scanner;

public class KthNodeFromEndOfList{

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
	
	Node findkthnodefromend(Node head,int kth)
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
	   
	   //To get reference of Kth element
	   Node ref=head;
	   
	   for(int i=count;i>0;i--) //Looping in reverse order
	   {   
		   if(kth==i) //comparing given Kth element with the elements of list
		   {
			 return ref;	 	    
		   }
		   ref=ref.next; //traversing again in forward direction and comparing each value with Kth given element
	   }
	   
	   return null;
	   
	}		

	public static void main(String[]args)
	{
		KthNodeFromEndOfList first=new KthNodeFromEndOfList();
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
		
		new KthNodeFromEndOfList().printinglist(first.head);
        
		System.out.println("Enter the Kth Element to be Found From End OF Link list");
		Scanner sc=new Scanner(System.in);
		int kth=sc.nextInt();
		
		//Holding the reference of Kth node from end of Link list
		Node header=new KthNodeFromEndOfList().findkthnodefromend(first.head,kth);
        
		//printing middle node data of Linked List
		try{
		System.out.println(kth+" Element from end of link list is "+header.data);
		}
		catch(NullPointerException npe)
		{
			System.out.println("Null");
		}
        
}	
		
}
