import java.util.*;

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



// Optimal runtime but non-optimal space complexities, accepted, uses O(n) space but can be solved in O(1)
// class Solution 
// {
//  public int pivotIndex(int[] nums)
//  {
//   int preSum[] = new int[nums.length], sum=0, pivot=-1;

//   for(int i=1; i<nums.length; i++)
//   {preSum[i] = nums[i-1]+preSum[i-1];}

//   for(int i=nums.length-1; i>-1; i--)
//   {
//    if(preSum[i] == sum)
//    {pivot = i;}

//    sum += nums[i];
//   }

//   return pivot;
//  }
// }



// class Solution
// {
//  public int singleNumber(int[] nums)
//  {
//   int sum1=0, sum2=0;
//   for(int i : nums)
//   {sum1 = sum1^i; sum2 += i;}

//   // for(int i=0; i<nums.length; i++)
//   // {nums[i] = nums[i]sum; System.out.println(nums[i]);}

//   return sum2-sum1;
//  }
// }