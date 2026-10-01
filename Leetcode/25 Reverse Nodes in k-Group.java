import java.util.*;

class Test
{
 public static void main(String args[])
 {
  Solution obj1 = new Solution();
  ListNode obj = new ListNode();
  // obj.printLL(obj.createList(11));
  // obj1.reverseKGroup(obj.createList(11), 3);
  obj.printLL(obj1.reverseKGroup(obj.createList(20), 7));
 }
}



class Solution
{
 public ListNode reverseKGroup(ListNode head, int k)
 {
  if(k == 1)
  {return head;}

  ListNode dummy = new ListNode(0, head);
  head = dummy;
  ListNode temp1=head, temp2=head.next, temp3;
  int count = 1;

  while(temp2 != null)
  {
   temp2 = temp2.next;
   count++;
   
   if(count == k+1)
   {
    temp3 = temp1.next;
    temp1.next = reverse(temp1.next, k, temp2);
    temp1 = temp3;
    count = 1;
   }
  }

  return head.next;
 }

 ListNode reverse(ListNode head, int k, ListNode end)
 {
  if(head == null || head.next == null)
  {return head;}

  ListNode temp1=end, temp2=head, temp3;

  while(k != 0)
  {
   temp3 = temp2.next;
   temp2.next = temp1;

   temp1 = temp2;
   temp2 = temp3;
   k--;
  }

  head = temp1;

  return head;
 }
}