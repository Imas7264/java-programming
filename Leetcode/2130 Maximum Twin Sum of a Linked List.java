import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int arr[] = {-3,0,-3,1,1,1,-3,10,0};
  
  // for(int i: obj.dailyTemperatures(arr))
  // {System.out.print(i+" ");}

  System.out.println(obj.uniqueOccurrences(arr));
 }
}



// More optimal than using recursion.
class Solution
{
 public int pairSum(ListNode head)
 {
  ListNode temp1=head, temp2=head.next;

  while(temp2.next != null)
  {temp1 = temp1.next; temp2 = temp2.next.next;}
  // System.out.println(temp1.next.val+" "+temp2.val);

  temp1.next = reverse(temp1.next);

  temp2 = temp1.next;
  temp1 = head;

  int max = Integer.MIN_VALUE, sum;

  while(temp2 != null)
  {
   // System.out.println(temp2.val);
   sum = temp1.val + temp2.val;
   max = (sum>max)? sum : max;
   temp1 = temp1.next; temp2 = temp2.next;
  }

  return max;
 }

// Reversing the list using 3 pointers is more memory and runtime efficient.
 ListNode reverse(ListNode head)
 {
  if(head == null || head.next == null)
  {return head;}

  ListNode temp1=null, temp2=head, temp3;

  while(temp2 != null)
  {
   temp3 = temp2.next;
   temp2.next = temp1;

   temp1 = temp2;
   temp2 = temp3;
  }

  head = temp1;

  return head;
 }
}



// Idea is optimal but using recursion for reversing causes overhead and uses n/2 auxilary memory.
// class Solution
// {
//  public int pairSum(ListNode head)
//  {
//   ListNode temp1=head, temp2=head.next;

//   while(temp2.next != null)
//   {temp1 = temp1.next; temp2 = temp2.next.next;}
//   // System.out.println(temp1.next.val+" "+temp2.val);

//   temp1.next = reverse(temp1.next);

//   temp2 = temp1.next;
//   temp1 = head;

//   int max = Integer.MIN_VALUE, sum;

//   while(temp2 != null)
//   {
//    // System.out.println(temp2.val);
//    sum = temp1.val + temp2.val;
//    max = (sum>max)? sum : max;
//    temp1 = temp1.next; temp2 = temp2.next;
//   }

//   return max;
//  }

//  ListNode reverse(ListNode head)
//  {

//   if(head.next == null)
//   {return head;}
  
//   ListNode temp = head.next;
//   ListNode node = reverse(head.next);
//   temp.next = head;
//   // System.out.println(node.val);
//   head.next = null;

//   return node;
//  }
// }