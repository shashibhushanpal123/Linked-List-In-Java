// Java program for Finding Kth Node From End of Link List Using 2 Pointers
// So here we are traversing the List Once-> Time Comp->O(N)

package Singly_Linked_List;

import java.util.Scanner;

public class KthNodeFromEndOfList2{

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
	
	void findkthnodefromend(Node head,int kth)
	{
		//2 Pointers initialized to point to head of list
		Node p=head,q=head;
		
		if(kth<=0)
		{
			System.out.println("Please enter positive integer greater than zero");
			inputtaking(head);
			return;
		}
		
		if(head==null) //iterating till "null" is encountered
		{
			System.out.println("List is Empty");
			return;
		}
		
		for(int i=1;i<kth && p!=null;i++) //This loop is for making the "p" pointer, points to the kth node from beginning of list
		{
			p=p.next; 
		}
		
		if(p==null) //This condition is for kth>list size
		{
			System.out.println("Kth element is greater than list size");
			return;
		}
	
		while(p.next!=null)
		{
			p=p.next;
			q=q.next;
		}

	    System.out.println(kth+" Element from end of link list is "+q.data);

}		

	public static void main(String[]args)
	{
		KthNodeFromEndOfList2 first=new KthNodeFromEndOfList2();
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
		
		new KthNodeFromEndOfList2().printinglist(first.head);
        
		inputtaking(first.head);
}
		static void inputtaking(Node header)
		{
			System.out.println("Enter the Kth Element to be Found From End OF Link list");
			Scanner sc=new Scanner(System.in);
			int kth=sc.nextInt();
			
			//Holding the reference of Kth node from end of Link list
			new KthNodeFromEndOfList2().findkthnodefromend(header,kth);
	        
}
}	
