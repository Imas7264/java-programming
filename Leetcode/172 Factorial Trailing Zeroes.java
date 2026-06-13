public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {4,1,2,1,2,2,1};

  System.out.println(obj.trailingZeroes(100));
 }
}

class Solution
{
 public int trailingZeroes(int n)
 {
  int i=n, j=5, count=0;

  while(i/j != 0)
  {
   count += i/j;
   j *= 5;
  }

  return count;
 }
}