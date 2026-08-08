import java.util.*;

class Test
{
 public static void main(String args[])
 {
  Solution obj1 = new Solution();
  ListNode obj = new ListNode();
  obj.printLL(obj1.oddEvenList(l1));
 }
}



class Solution
{
 public ListNode oddEvenList(ListNode head)
 {
  if(head == null)
  {return null;}
  
  ListNode even = new ListNode(0);
  ListNode temp1=head, temp2=even;

  while(temp1.next != null)
  {
   temp2.next = temp1.next;
   temp2 = temp2.next;

   if(temp1.next.next == null)
   {temp1.next = null;}
   else
   {
    temp1.next = temp1.next.next;
    temp1 = temp1.next;
   }
  }

  temp1.next = even.next;
  temp2.next = null;

  return head;
 }
}
