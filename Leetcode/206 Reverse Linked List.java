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



// Most optimal solution
class Solution
{
 ListNode reverseList(ListNode head)
 {
  if(head == null || head.next == null)
  {return head;}

  ListNode temp1=null, temp2=head, temp3;
  head.next = null;

  while(temp2 != null)
  {
   temp3 = temp2.next;
   temp2.next = temp1;

   temp1 = temp2;
   temp2 = temp3;
  }

  temp2.next = temp1;
  head = temp2;

  return head;
 }
}



// Not at all optimal but very easy to understand (recursion equivalent implementation)
// class Solution
// {
//  public ListNode reverseList(ListNode head)
//  {
//   if(head == null)
//   {return null;}

//   Stack<ListNode> stk = new Stack<>();
//   ListNode temp = head;

//   while(temp != null)
//   {
//    stk.push(temp);
//    temp = temp.next;
//   }

//   head = stk.pop();
//   head.next = null;
//   temp = head;
  
//   while(!stk.isEmpty())
//   {temp.next = stk.pop(); temp = temp.next;}
//   temp.next = null;

//   return head;
//  }
// }