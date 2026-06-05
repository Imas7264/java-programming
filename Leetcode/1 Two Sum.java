public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {1, 5, 10, 1};

  // System.out.println(obj.twoSum(nums, 3));
  for(int i: obj.twoSum(nums, 3))
  {System.out.print(i+" ");}
 }
}


class Solution
{
 public int[] twoSum(int[] nums, int target)
 {
  int[] r = {0, 0};

  for(int i=0; i<nums.length; i++)
  {
   for(int j=i+1; j<nums.length; j++)
   {
    if(nums[i]+nums[j] == target)
    {
     r[0] = i;
     r[1] = j;
     return r;
    }
   }
  }
  return r;
 }
}