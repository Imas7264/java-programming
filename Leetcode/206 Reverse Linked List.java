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
 public ListNode reverseList(ListNode head)
 {
  if(head == null)
  {return null;}

  Stack<ListNode> stk = new Stack<>();
  ListNode temp = head;

  while(temp != null)
  {
   stk.push(temp);
   temp = temp.next;
  }

  head = stk.pop();
  head.next = null;
  temp = head;
  
  while(!stk.isEmpty())
  {temp.next = stk.pop(); temp = temp.next;}
  temp.next = null;

  return head;
 }
}