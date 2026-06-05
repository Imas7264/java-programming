import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {0,0,1,1,1,2,2,3,3,4};

  System.out.println(obj.removeDuplicates(nums));
 }
}




class Solution
{
 public int removeDuplicates(int[] nums)
 {
  int k=0;

  for(int i=1; i<nums.length; i++)
  {
   if(nums[i-1] == nums[i])
   {k++; continue;}

   nums[i-k] = nums[i];
  }

  // for(int i: nums)
  // {System.out.print(i+" ");}
  // System.out.println(" ");

  return nums.length - k;
 }
}