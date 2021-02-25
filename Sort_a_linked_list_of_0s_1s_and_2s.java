package freshly;
//Sort a linked list of 0's 1's and 2's
//Steps-> 1)Traverse list to fill the array with data elements of node
//        2)Again traverse list to overwrite the data elements from the array, and decrement array count  

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

class Sort
{
	int array[]=new int[3];
	int i=0;
	Node sort(Node head)
	{
		Node temp=head,overall=head;
		while(temp!=null)
		{
			array[temp.data]+=1;
			temp=temp.next;
		}
		
		temp=head;
		
		while(temp!=null)
		{
			if(array[i]==0)
				++i;
			else
			{
	        temp.data=i;
			--array[i];
			temp=temp.next;
			}
	       
		}
		return overall;
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
	Node head=new Node(2);
	Node n2=new Node(2);
	Node n3=new Node(1);
	Node n4=new Node(0);
	head.next=n2;
	n2.next=n3;
	n3.next=n4;
	System.out.println("Original List is");
	printlist(head);
	System.out.println();
	System.out.println("After sorting it becomes");
	Node result=new Sort().sort(head);
	printlist(result);
	
}
}
