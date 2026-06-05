class Test
{
 public static void main(String args[])
 {
  Solution obj = new Solution();
  int arr[] = {};

  System.out.println(obj.findMaxConsecutiveOnes(arr));
 }
}


class Solution
{
 public int findMaxConsecutiveOnes(int[] nums)
 {
  if(nums.length == 0)
  {return 0;}

  int max = (nums[0]==1)? 1 : 0, curr=max;

  for(int i=1; i<nums.length; i++)
  {
   if(nums[i]==1)
   {
    if(nums[i-1] == 1)
    {curr++;}
    else
    {curr=1;}
   }
   else if(curr != 0)
   {max = Math.max(max, curr);}
  }

  return Math.max(max, curr);
 }
}