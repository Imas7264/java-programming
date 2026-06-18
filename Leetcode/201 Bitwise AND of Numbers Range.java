public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {4,1,2,1,2,2,1};

  System.out.println("");
 }
}

class Solution
{
 public int rangeBitwiseAnd(int left, int right)
 {
  int i=0;

  while(left != right)
  {left=left>>1; right=right>>1; i++;}

  return right<<i;
 }
}