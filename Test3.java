import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {0,1,1,1,0,1,1,0,1};
  char chars[] = {'a','b'};
  System.out.println(obj.longestSubarray(nums));
 }
}



class Solution
{
 public int longestSubarray(int[] nums)
 {
  int count=0, prevCount=0, maxCount=0;

  for(int i=0; i<nums.length; i++)
  {
   if(nums[i] == 0)
   {
    maxCount = (maxCount<(count+prevCount))? (count+prevCount) : maxCount;
    prevCount=count;
    count=0;
   }
   else
   {count++;}
  }

  maxCount = (maxCount<(count+prevCount))? (count+prevCount) : maxCount;

  if(maxCount == nums.length)
  {return nums.length-1;}

  return maxCount;
 }
}



// Optimal time complexity [O(n)] but bad runtime due to hashing and lookups overhead
// class Solution
// {
//  public int maxOperations(int[] nums, int k)
//  {
//   HashMap<Integer, Integer> map = new HashMap<>();
//   int count=0;

//   for(int i=0; i<nums.length; i++)
//   {
//    if(map.containsKey(k-nums[i]) && map.get(k-nums[i]) > 0)
//    {
//     count++;
//     map.put(k-nums[i], map.get(k-nums[i])-1);
//    }
//    else if(map.containsKey(nums[i]))
//    {map.put(nums[i], map.get(nums[i])+1);}
//    else
//    {map.put(nums[i], 1);}
//   }

//   return count;
//  }
// }



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