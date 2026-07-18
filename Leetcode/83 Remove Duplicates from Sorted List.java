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

  ListNode temp=head;

  while(temp.next != null)
  {
   if(temp.val == temp.next.val)
   {temp.next = temp.next.next;}
   else
   {temp = temp.next;}
  }

  return head;
 }
}



// class Solution
// {
//  public ListNode deleteDuplicates(ListNode head)
//  {
//   if(head == null)
//   {return null;}

//   ListNode temp=head;

//   while(temp != null)
//   {
//    while(temp.next != null && temp.val == temp.next.val)
//    {temp.next = temp.next.next;}
//    temp = temp.next;
//   }

//   return head;
//  }
// }