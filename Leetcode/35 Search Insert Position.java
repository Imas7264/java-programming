public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {1,3,5,6};

  System.out.println(obj.searchInsert(nums, 2));
 }
}



class Solution
{
 public int searchInsert(int[] nums, int target)
 {
  int l=0, h=nums.length-1, m=(l+h)/2;

  while(l<=h)
  {
   if(nums[m] == target)
   {return m;}
   
   if(nums[m] > target)
   {h=m-1;}
   else
   {l=m+1;}

   m = (l+h)/2;
  }

  return l;
 }
}