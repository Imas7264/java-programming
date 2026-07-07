import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {3,3};
  int ans[] = obj.twoSum(nums, 6);

  for(int i: ans)
  {System.out.print(i+" ");}

  // System.out.println(obj.twoSum(nums, 9));
 }
}



class Solution 
{
 public int[] twoSum(int[] nums, int target)
 {
  int[] r = {0, 0};
  HashMap<Integer, Integer> map = new HashMap<>();

  for(int i=0; i<nums.length; i++)
  {
   if(map.containsKey(target-nums[i]))
   {r[0]=map.get(target-nums[i]); r[1]=i; return r;}

   map.put(nums[i], i);
  }
  
  return r;
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