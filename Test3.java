import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {1,1,2};
  String strs[] = {""};

  // for(int i: obj.countOddEven(nums))
  // {System.out.print(i+" ");}
  // obj.sortColors(nums);
  System.out.println(obj.secondSmallest(nums));
  // System.out.println(map.get("abc"));
 }
}



class Solution
{
 int secondSmallest(int[] nums)
 {
  if(nums.length <= 1)
  {return -1;}

  int min=Integer.MAX_VALUE, min2=Integer.MAX_VALUE;

  for(int i=0; i<nums.length; i++)
  {
   if(min>nums[i])
   {
    min2=min;
    min=nums[i];
   }
   else if(nums[i]<min2 && nums[i] != min)
   {min2=nums[i];}
  }

  return (min2 == Integer.MAX_VALUE)? -1: min2;
 }
}



// class Solution 
// {
//  public int maxSubArray(int[] nums)
//  {
//   int max=Integer.MIN_VALUE, cmax=0, current=0;

//   for(int i=0, j=0; j<2*nums.length-1; i=(i+1)%nums.length, j++)
//   {
//    cmax += nums[i];

//    if(max < cmax)
//    {max = cmax;}
   
//    if(cmax<0)
//    {cmax = 0; current=(i+1)%nums.length;}

//    if((j+1)%nums.length == current)
//    {break;}
//   }

//   return max;
//  }
// }



// class Solution 
// {
//  List<List<String>> answer = new ArrayList<>();

//  public List<List<String>> groupAnagrams(String[] strs)
//  {
//   int[] alpha = new int[26];
//   HashMap<ArrayList<Integer>, List<String>> map = new HashMap<>();

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