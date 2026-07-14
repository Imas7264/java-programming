public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {-2,-1,-3,-4,-1,-2,-1,-5,-4};
  String strs[] = {""};

  // for(int i: ans)
  // {System.out.print(i+" ");}
  // obj.sortColors(nums);
  System.out.println(obj.maxSubArray(nums));
  // System.out.println(map.get("abc"));
 }
}



class Solution 
{
 public int maxSubArray(int[] nums)
 {
  int max=Integer.MIN_VALUE, cmax=0;

  for(int i=0; i<nums.length; i++)
  {
   cmax += nums[i];

   if(max < cmax)
   {max = cmax;}
   
   if(cmax<0)
   {cmax = 0;}
  }

  return max;
 }
}
