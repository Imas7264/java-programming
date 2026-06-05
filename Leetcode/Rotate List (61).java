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
 public ListNode rotateRight(ListNode head, int k)
 {
  if(head == null)
  {return null;}

  if(head.next == null)
  {return head;}

  ListNode ptr1 = head;
  ListNode ptr2 = head;
  int count = 1;

  while(ptr1.next != null)
  {count++; ptr1 = ptr1.next;}

  k = k%count;
  if(k==0)
  {return head;}
  
  ptr1.next = head;
  count = count-k;

  while(count!=1)
  {ptr2 = ptr2.next; count--;}
  head = ptr2.next;
  ptr2.next = null;

  return head;
 }
}