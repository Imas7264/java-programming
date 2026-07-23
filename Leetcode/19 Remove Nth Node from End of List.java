import java.util.*;

class Test
{
 public static void main(String args[])
 {
  Solution obj1 = new Solution();
  ListNode obj = new ListNode();
  ListNode l1 = obj.createList(10);
  obj.printLL(l1);
  l1 = obj1.reverseList(l1);
  obj.printLL(l1);
 }
}



class Solution
{
 public ListNode removeNthFromEnd(ListNode head, int n)
 {
  ListNode dummy = new ListNode(0, head);
  head = dummy;
  ListNode ptr1 = head, ptr2 = head.next;
  int count = 1;

  while(ptr2.next != null)
  {
   count++;
   ptr2 = ptr2.next;

   if(count > n)
   {ptr1 = ptr1.next;}
  }

  ptr1.next = ptr1.next.next;

  return head.next;
 }
}