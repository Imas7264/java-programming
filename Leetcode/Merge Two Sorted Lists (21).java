import java.util.*;

class ListNode
{
 int val;
 ListNode next;

 
 ListNode() {}
 
 
 ListNode(int val)
 {this.val = val;}


 ListNode(int val, ListNode next)
 {this.val = val; this.next = next;}


 static ListNode append(ListNode head, int val)
 {
  if(head == null)
  {return new ListNode(val);}

  ListNode temp = head;
  
  while(temp.next != null)
  {temp = temp.next;}

  temp.next = new ListNode(val, null);

  return head;
 }
}




class Solution
{
 public ListNode mergeTwoLists(ListNode l1, ListNode l2)
 {
  ListNode temp = new ListNode(0);
  ListNode head = temp;

  while(l1 != null && l2 != null)
  {
   if(l1.val < l2.val)
   {temp.next = l1; l1 = l1.next;}
   else
   {temp.next = l2; l2 = l2.next;}

   temp = temp.next;
  }

  if(l1 != null)
  {temp.next = l1;}
  
  if(l2 != null)
  {temp.next = l2;}

  return head.next;
 }
}




class Test
{
 public static void main(String[] args)
 {
  ListNode head1 = new ListNode(1);
  head1.append(head1, 2);
  head1.append(head1, 4);
  // head1.append(head1, 9);
  // head1.append(head1, 9);
  
  ListNode head2 = new ListNode(1);
  head2.append(head2, 3);
  head2.append(head2, 4);
  // head2.append(head2, 9);
  // head2.append(head2, 9);
  
  Solution obj = new Solution();
  head1 = obj.mergeTwoLists(head1, head2);

  printLL(head1);
  // printLL(head2);
 }

 static void printLL(ListNode n)
 {
  while(n.next != null)
  {
   System.out.println(n.val);
   n = n.next;
  }

  System.out.println(n.val);
 }
}

