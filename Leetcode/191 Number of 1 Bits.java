public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {1, 5, 10, 1};

  System.out.println(obj.hammingWeight(2147483645));
 }
}


class Solution
{
 public int hammingWeight(int n)
 {
  int i=0;

  while(n!=0)
  {
   if((n & 1) == 1)
   {i++;}

   n = n>>1;
  }

  return i;
 }
}