public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {1,2};

  System.out.println(obj.reverseBits(2147483644));
 }
}


class Solution
{
 public int reverseBits(int n)
 {
  int ans=0, carry, i=32;
  while(i>0)
  {
   carry=n&1;
   ans = ans<<1;
   ans = ans | carry;
   n = n>>1;
   i--;
  }

  return ans;
 }
}