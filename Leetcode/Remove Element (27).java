import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {0,1,2,2,3,0,4,2};

  System.out.println(obj.removeElement(nums, 2));
 }
}




class Solution
{
 public int removeElement(int[] nums, int val)
 {
  int k = 0;

  for(int i=0; i<nums.length; i++)
  {
   if(nums[i] == val)
   {k++; continue;}
   nums[i-k] = nums[i];
  }

  // for(int i: nums)
  // {System.out.print(i+" ");}
  // System.out.println(" ");

  return nums.length - k;
 }
}