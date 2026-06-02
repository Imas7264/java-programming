import java.util.*;

public class Test
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {1,2,3,4,5,6,7};
  obj.rotate(nums, 3);
  // System.out.println();
 }
}




class Solution
{
 public void rotate(int[] nums, int k)
 {
  k = k%nums.length;

  nums = rev(nums, 0, nums.length-1);
  nums = rev(nums, k, nums.length-1);
  nums = rev(nums, 0, k-1);
  // nums = rev(nums, nums.length-k+1, nums.length-1);

  for(int num: nums)
  {System.out.print(num+" ");}
 }

 static int[] rev(int nums[], int start, int end)
 {
  int i = start, j = end, temp;
  while(i<j)
  {
   temp = nums[i];
   nums[i] = nums[j];
   nums[j] = temp;
   i++; j--;
  }

  // System.out.println("\n");
  // for(int num: nums)
  // {System.out.print(num+" ");}

  return nums;
 }
}