public class ListNode
{
 int val;
 ListNode next;
 ListNode() {}
 ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode next) { this.val = val; this.next = next; }

 ListNode createList(int n)
 {
  if(n<=0)
  {return null;}
  
  ListNode head = new ListNode(1, null);
  ListNode end = head;

  for(int i=2; i<=n; i++)
  {
   ListNode temp = new ListNode(i, null);
   end.next = temp;
   end = end.next;
  }

  return head;
 }

 void printLL(ListNode head)
 {
  ListNode ptr = head;

  while(ptr != null)
  {System.out.println(ptr.val); ptr = ptr.next;}
 }
}