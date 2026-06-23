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
 public ListNode partition(ListNode head, int x)
 {
  if(head == null)
  {return null;}

  ListNode l1=null, l2=null, ptr=head.next, h=null, l=null;

  if(head.val < x)
  {l2 = head; l=head;}
  else
  {l1 = head; h=head;}

  while(ptr != null)
  {
   if(ptr.val < x)
   {
    if(l2 == null)
    {l2 = ptr; l=ptr;}
    else
    {l.next = ptr; l=l.next;}
   }
   else
   {
    if(l1 == null)
    {l1= ptr; h=ptr;}
    else
    {h.next = ptr; h=h.next;}
   }
   ptr=ptr.next;
  }

  if(l1 == null)
  {return l2;}

  if(l2 == null)
  {return l1;}
  
  h.next = null;
  l.next = l1;

  return l2;
 }
}