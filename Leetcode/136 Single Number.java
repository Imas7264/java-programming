public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {4,1,2,1,2};

  System.out.println(obj.singleNumber(nums));
 }
}


class Solution
{
 public int singleNumber(int[] nums)
 {
  int sum=0;
  for(int i : nums)
  {sum = sum^i;}

  return sum;
 }
}