import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {0,2,3,4,5,0,0,0,9};
  System.out.println(obj.minFlips(2,6,5,));
 }
}



class Solution
{
 public int minFlips(int a, int b, int c)
 {
  int sum = a|b, count=0;

  while(sum != c)
  {
   if(((sum&1) ^ (c&1)) == 1)
   {count++;}

   sum = sum>>1;
   c = c>>1;
  }

  return count;
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