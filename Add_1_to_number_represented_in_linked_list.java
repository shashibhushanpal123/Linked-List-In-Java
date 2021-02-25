package freshly;
//Add 1 to number represented in linked list
//Time Complexity is ->O(n) where n is number of digits in a number eg-> 9999(4 digits in a number) 
// Steps-> 1)Reverse  2)Add 1 to all elements  3)Reverse

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

class Add1To
{
  static Node reverse(Node head)
   {
	  Node prev = null;
	  Node current = head;
	  Node next;
	    while (current != null)
	    {
	        next=current.next;
	        current.next = prev;
	        prev = current;
	        current = next;
	    } 
	    return prev;
   }
  
  static Node add1to(Node headref)
  {
	  Node resultant=headref,temp=headref;
	  int carry=1,sum;
	  
	  while(headref!=null)
	  {
		  sum=carry+headref.data;
		  carry=(sum==10)?1:0;
		  sum=sum%10;
		  headref.data=sum;
		  temp=headref;
		  headref=headref.next;
	  }
	  
	  if(carry>0)
	  {
		 temp.next=new Node(carry);
	  }
	  return reverse(resultant);
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
	Node head=new Node(9);
	Node n2=new Node(9);
	Node n3=new Node(9);
	Node n4=new Node(9);
	head.next=n2;
	n2.next=n3;
	n3.next=n4;
	System.out.println("Original List is");
	printlist(head);
	System.out.println();
	Node headref=reverse(head);
	Node overall=add1to(headref);
	System.out.println("List after adding 1 to each element is");
	printlist(overall);
}
}
