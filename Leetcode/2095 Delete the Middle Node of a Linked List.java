import java.util.*;

class Test
{
 public static void main(String args[])
 {
  Solution obj1 = new Solution();
  ListNode obj = new ListNode();
  ListNode l1 = obj.createList(7);
  obj.printLL(obj1.deleteMiddle(l1));
 }
}



class Solution
{
 public ListNode deleteMiddle(ListNode head)
 {
  if(head == null)
  {return null;}

  ListNode dummy = new ListNode(0, head);
  head = dummy;
  ListNode temp1=head, temp2=head.next;
  int count=1;

  while(temp2.next != null)
  {
   count++;
   temp2 = temp2.next;

   if(count%2 == 0)
   {temp1 = temp1.next;}
  }

  temp1.next = temp1.next.next;

  return head.next;
 }
}