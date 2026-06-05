class Test
{
 public static void main(String args[])
 {
  ListNode obj = new ListNode();
  ListNode l1 = obj.createList(10);
  obj.printLL(l1);
 }
}


class Solution
{
 public ListNode addTwoNumbers(ListNode l1, ListNode l2)
 {
  int sum = 0, carry = 0;
  ListNode sumNode = new ListNode((l1.val + l2.val)%10);
  carry = ((l1.val + l2.val)/10);
  ListNode head = sumNode;

  while(l1.next != null && l2.next != null)
  {
   l1 = l1.next; l2 = l2.next;
   sumNode.next = new ListNode((l1.val + l2.val + carry)%10);
   carry = ((l1.val + l2.val+carry)/10);
   sumNode = sumNode.next;
  }

  if(l1.next != null)
  {
   l1=l1.next;
   while(l1 != null)
   {
    sumNode.next = new ListNode((l1.val+carry)%10);
    carry = (l1.val+carry)/10;
    sumNode = sumNode.next;
    l1 = l1.next; 
   }
  }
  else if(l2.next != null)
  {
   l2=l2.next;
   while(l2 != null)
   {
    sumNode.next = new ListNode((l2.val+carry)%10);
    carry = (l2.val+carry)/10;
    sumNode = sumNode.next;
    l2 = l2.next; 
   }
  }

  if(carry == 1)
  {sumNode.next = new ListNode(1);}

  return head;
 }
}