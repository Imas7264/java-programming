class Test
{
 public static void main(String args[])
 {
  Solution obj = new Solution();
  int arr[] = {1,1,1,0,0,0,1,1};

  System.out.println(obj.findMaxConsecutiveOnesOrZeros(arr));
 }
}


class Solution
{
 public int findMaxConsecutiveOnesOrZeros(int[] nums)
 {
  if(nums.length == 0)
  {return 0;}

  int max=1, curr=max;

  for(int i=1; i<nums.length; i++)
  {
   if(nums[i]==nums[i-1])
   {curr++;}
   else
   {max = Math.max(max, curr); curr=1;}
  }

  return Math.max(max, curr);
 }
}