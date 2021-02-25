package freshly;
//Remove duplicates from Sorted Link List

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

class Remove
{
	int array[]=new int[3];
	int i=0;
	Node remove(Node head)
	{
		Node current=head;
		
		if(current==null)
		{
			return null;
		}
		while(current.next!=null)
		{
			if(current.data==current.next.data)
			{
				current.next=current.next.next;
			}
			else
			{
				current=current.next;
			}
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
	Node head=new Node(0);
	Node n2=new Node(1);
	Node n3=new Node(1);
	Node n4=new Node(2);
	Node n5=new Node(2);
	head.next=n2;
	n2.next=n3;
	n3.next=n4;
	n4.next=n5;
	System.out.println("Original List is");
	printlist(head);
	System.out.println();
	System.out.println("After removing duplicates it becomes");
	Node result=new Remove().remove(head);
	printlist(result);
	
}
}