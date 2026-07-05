import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {1,1,2,2};

  System.out.println(obj.removeDuplicates(nums));
 }
}



class Solution
{
 public int removeDuplicates(int[] nums)
 {
  if(nums.length == 0)
  {return 0;}
  
  int latest=nums[0], count=1, k=0;
  for(int i=1; i<nums.length; i++)
  {
   if(nums[i] != latest)
   {latest=nums[i]; count=1;}
   else
   {
    count++;

    if(count>2)
    {k++;}
   }

   nums[i-k] = nums[i];
  }

  return nums.length-k;
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