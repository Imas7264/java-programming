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
 public ListNode deleteDuplicates(ListNode head)
 {
  if(head == null)
  {return null;}

  ListNode dummy = new ListNode(0, head);
  head = dummy;
  ListNode temp=head, temp2=head.next;

  while(temp2 != null)
  {
   if(temp2.next != null && temp2.val == temp2.next.val)
   {temp2 = temp2.next;}
   else if(temp.next != temp2)
   {
    temp.next = temp2.next;
    temp2 = temp2.next;
   }
   else
   {
    temp = temp.next;
    temp2 = temp2.next;
   }
  }

  temp.next = null;

  return head.next;
 }
}



// class Solution
// {
//  public ListNode deleteDuplicates(ListNode head)
//  {
//   if(head == null)
//   {return null;}

//   ListNode dummy = new ListNode(-150, head);
//   head = dummy;
//   ListNode temp=head, temp2=head.next;
//   int current = temp.val;

//   while(temp2 != null)
//   {
//    if(temp2.val == current)
//    {temp2 = temp2.next;}
//    else if(temp2.next != null && temp2.val == temp2.next.val)
//    {current = temp2.val;}
//    else
//    {
//     temp.next = temp2;
//     temp = temp.next;
//     current = temp.val;
//     temp2 = temp2.next;
//    }
//   }

//   temp.next = null;

//   return head.next;
//  }
// }