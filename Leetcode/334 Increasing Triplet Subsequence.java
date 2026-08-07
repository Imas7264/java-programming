public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {1,2,3,4,5};
  int nums2[] = {3,4,5,1,2};
  System.out.println(obj.increasingTriplet(nums));
 }
}



class Solution
{
 public boolean increasingTriplet(int[] nums)
 {
  if(nums.length < 3)
  {return false;}

  int s1=Integer.MAX_VALUE, s2=Integer.MAX_VALUE;

  for(int i=0; i<nums.length; i++)
  {
   if(nums[i] > s2)
   {return true;}

   if(nums[i]<=s1)
   {s1=nums[i];}
   else if(nums[i]<=s2)
   {s2=nums[i];}
  }

  return false;
 }
}
