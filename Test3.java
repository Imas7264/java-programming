import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {0,2,3,4,5,0,0,0,9};
  System.out.println(obj.minFlips(0,0,3));
 }
}



class Solution
{
 public int minFlips(int a, int b, int c)
 {
  int count=0;

  while((a|b) != c)
  {
   if(((a|b)&1) != (c&1))
   {
    if((c&1) == 1)
    {count++;}
    else
    {
     if(((a&1)&(b&1)) == 1)
     {count += 2;}
     else
     {count++;}
    }
   }

   c = c>>1;
   a = a>>1;
   b = b>>1;
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