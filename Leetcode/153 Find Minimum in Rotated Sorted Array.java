public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {1,2,3,4,5,6,7,8};

  System.out.println(obj.findMin(nums));
 }
}


class Solution
{
 public int findMin(int[] nums)
 {
  if(nums.length == 1)
  {return nums[0];}

  int l=0, h=nums.length-1, m=(l+h)/2;

  while(nums[m]<nums[m+1] && l<h)
  {
   if(nums[m]<nums[h])
   {h=m;}
   else
   {l=m;}

   m=(h+l)/2;
  }

  return (l<h)? nums[m+1]:nums[m];
 }
}