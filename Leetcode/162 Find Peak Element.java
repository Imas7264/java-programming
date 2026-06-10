public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {1,2};

  System.out.println(obj.findPeakElement(nums));
 }
}


class Solution
{
 public int findPeakElement(int[] nums)
 {
  int l=0, r=nums.length-1, m=(l+r)/2;

  while(l<r)
  {
   if(nums[m]<nums[m+1])
   {l=m+1;}
   else
   {r=m;} 
   
   m=(l+r)/2;
  }

  return l;
 }
}