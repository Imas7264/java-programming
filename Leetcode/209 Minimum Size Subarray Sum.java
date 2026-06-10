public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {1,4,4};

  System.out.println(obj.minSubArrayLen(41, nums));
 }
}


class Solution
{
 public int minSubArrayLen(int target, int[] nums)
 {
  int min = Integer.MAX_VALUE, sum=nums[0], i=0, j=0;

  while(i<nums.length && j<nums.length)
  {
   if(sum < target)
   {
    j++;
    if(j>nums.length-1)
    {break;} 
    sum+=nums[j];
   }
   else
   {
    sum-=nums[i];
    min = Math.min(j-i, min);
    i++;
   }
  }

  return (min == Integer.MAX_VALUE)? 0 : min+1;
 }
}