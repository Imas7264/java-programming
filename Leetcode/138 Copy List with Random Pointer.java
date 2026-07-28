import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  Node head = new Node(1);
  head.createLL(head, 10);
  // head.printLL(head);
  System.out.println(obj.copyRandomList(head));
  System.out.println(head);
 }
}



class Solution
{
 public Node copyRandomList(Node head)
 {
  if(head == null)
  {return null;}

  Node temp1=head, temp;

  while(temp1 != null)
  {
   Node newNode = new Node(temp1.val);
   temp = temp1.next;
   temp1.next = newNode;
   newNode.next = temp;
   temp1 = temp;
  }

  // head.printLL(head);
  temp1=head;
  Node head2 = head.next, temp2;

  while(temp1 != null)
  {
   temp2 = temp1.next;

   if(temp1.random != null)
   {temp2.random = temp1.random.next;}
   else
   {temp2.random = null;}

   temp1 = temp2.next;
  }

  head.printLL(head2);

  temp1=head; temp2=head2;
  while(temp2.next != null)
  {
   temp1.next = temp2.next;
   temp1 = temp1.next;
   temp2.next = temp1.next;
   temp2 = temp2.next;
  }

  temp1.next = null;

  // head2.printLL(head2);


  return head2;
 }
}



class Node
{
 int val;
 Node next;
 Node random;

 public Node(int val)
 {
  this.val = val;
  this.next = null;
  this.random = null;
 }

 void createLL(Node head, int val)
 {
  Node temp = head;

  for(int i=2; i<=val; i++)
  {
   Node newNode = new Node(i);
   temp.next = newNode;
   temp=temp.next;
  }
 }

 void printLL(Node head)
 {
  Node temp=head;

  while(temp!=null)
  {System.out.println(temp.val); temp=temp.next;}
 }
}