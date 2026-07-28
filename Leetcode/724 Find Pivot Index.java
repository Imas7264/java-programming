public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {2,-1,1};
  System.out.println(obj.pivotIndex(nums));
 }
}



class Solution 
{
 public int pivotIndex(int[] nums)
 {
  int totalSum=0, sum=0;

  for(int i=0; i<nums.length; i++)
  {totalSum += nums[i];}

  for(int i=0; i<nums.length; i++)
  {
   if(sum == totalSum-sum-nums[i])
   {return i;}

   sum += nums[i];
  }

  return -1;
 }
}