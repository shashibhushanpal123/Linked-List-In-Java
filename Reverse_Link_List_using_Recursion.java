package freshly;
//Reverse Link List using Recursion

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

class Reverse
{
	Node head;
	Node reverse(Node p)
	{
		if(p==null)
			return null;

		else if(p.next==null)
		{
			head=p;
			return null;
		}
		else
		{
		reverse(p.next);
		p.next.next=p;
		p.next=null;
		}
		return head;
	}

  static void printlist(Node head)
  {
	  while(head!=null)
	  {
		  System.out.print(head.data+" ");
		  head=head.next;
	  }
  }
  
  
public static void main(String[]args)
{ 
	Node head=new Node(1);
	Node n2=new Node(2);
	Node n3=new Node(3);
	Node n4=new Node(4);
	Node n5=new Node(5);
	head.next=n2;
	n2.next=n3;
	n3.next=n4;
	n4.next=n5;
	System.out.println("Original List is");
	printlist(head);
	System.out.println();
	System.out.println("After reversing List becomes");
	Node result=new Reverse().reverse(head);
	printlist(result);
}
}