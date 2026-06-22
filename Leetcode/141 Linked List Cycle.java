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
 public boolean hasCycle(ListNode head)
 {
  ListNode ptr1=head, ptr2=head;

  while(ptr2 != null)
  {
   ptr1 = ptr1.next;

   if(ptr2.next != null)
   {ptr2 = ptr2.next.next;}
   else
   {return false;}

   if(ptr1 == ptr2)
   {return true;}
  }

  return false;
 }
}