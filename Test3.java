import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {1};

  System.out.println(obj.longestConsecutive(nums));
 }
}

class Solution
{
 public int longestConsecutive(int[] nums)
 {
  if(nums.length == 0)
  {return 0;}

  HashSet<Integer> s = new HashSet<>();
  for(int i: nums)
  {s.add(i);}

  int max=0, count=0;
  for(int i: s)
  {
   if(!s.contains(i-1))
   {
    while(s.contains(i+1))
    {
     count++;
     i++;
    }
    max = (max<count)?count:max;
    count=0;
   }
  }

  return max+1;
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


// class Solution
// {
//  public boolean canJump(int[] nums)
//  {
//   boolean result = jump(nums, 0);

//   return result;
//  }


//  static boolean jump(int nums[], int index)
//  {
//   if(index == nums.length-1)
//   {return true;}

//   if(index>=nums.length)
//   {return true;}

//   int i = nums[index];
//   boolean result = false;
//   while(i>0 && !result)
//   {result = jump(nums, index+i); i--;}

//   if(result)
//   {return true;}

//   return false;
//  }
// }