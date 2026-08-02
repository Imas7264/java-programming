public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {0,2,3,4,5,0,0,0,9};
  obj.moveZeroes(nums);

  for(int i: nums)
  {System.out.println(i+" ");}
 }
}



class Solution
{
 public void moveZeroes(int[] nums)
 {
  int k=0;

  for(int i=0; i<nums.length; i++)
  {
   if(nums[i] == 0)
   {k++;}
   else
   {nums[i-k] = nums[i];}
  }

  for(int i=nums.length-k; i<nums.length; i++)
  {nums[i] = 0;}
 }
}