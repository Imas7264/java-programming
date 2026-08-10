public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {0,1,1,1,0,1,1,0,1};
  char chars[] = {'a','b'};
  System.out.println(obj.longestSubarray(nums));
 }
}



class Solution
{
 public int longestSubarray(int[] nums)
 {
  int count=0, prevCount=0, maxCount=0;

  for(int i=0; i<nums.length; i++)
  {
   if(nums[i] == 0)
   {
    maxCount = (maxCount<(count+prevCount))? (count+prevCount) : maxCount;
    prevCount=count;
    count=0;
   }
   else
   {count++;}
  }

  maxCount = (maxCount<(count+prevCount))? (count+prevCount) : maxCount;

  if(maxCount == nums.length)
  {return nums.length-1;}

  return maxCount;
 }
}