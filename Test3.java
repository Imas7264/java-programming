import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {2,0,2,1,1,0};
  // int ans[] = obj.twoSum(nums, 6);

  // for(int i: ans)
  // {System.out.print(i+" ");}
  obj.sortColors(nums);
  // System.out.println(obj.sortColors(nums));
 }
}



class Solution 
{
 public void sortColors(int[] nums)
 {
  int l=0, h=nums.length-1, temp;

  while(l<h)
  {
   while(l<h && nums[l] < 2)
   {l++;}

   while(l<h && nums[h] == 2)
   {h--;}

   temp = nums[l];
   nums[l] = nums[h];
   nums[h] = temp;
   l++; h--;
  }

  l=0; h=nums.length-1;

  while(l<h)
  {
   while(l<h && nums[l] == 0)
   {l++;}

   while(l<h && nums[h] > 0)
   {h--;}

   temp = nums[l];
   nums[l] = nums[h];
   nums[h] = temp;
   l++; h--;
  }

  // for(int i: nums)
  // {System.out.println(i+" ");}
 }
}



// class Solution
// {
//  public int singleNumber(int[] nums)
//  {
//   int sum1=0, sum2=0;
//   for(int i : nums)
//   {sum1 = sum1^i; sum2 += i;}

//   // for(int i=0; i<nums.length; i++)
//   // {nums[i] = nums[i]sum; System.out.println(nums[i]);}

//   return sum2-sum1;
//  }
// }