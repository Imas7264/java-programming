import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  SecondClass obj = new SecondClass();

  int nums[] = obj.ones(5);

  for(int i=0; i<nums.length; i++)
  {System.out.print(nums[i]+" ");}
 }
}



// class Solution
// {
//  void reverseStack(Stack<Integer> stk)
//  {
//   int 
//  }
// }



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