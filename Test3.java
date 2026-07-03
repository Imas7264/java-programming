import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {1, 2, 3, 4};

  System.out.println(obj.containsNearbyDuplicate(nums, 2));
 }
}



class Solution
{
 public boolean containsNearbyDuplicate(int[] nums, int k)
 {
  if(k==0)
  {return false;}
  
  HashSet<Integer> window = new HashSet<>();

  for(int i=0; i<nums.length; i++)
  {
   if(window.contains(nums[i]))
   {return true;}

   if(window.size() == k)
   {window.remove(nums[i-k]);}

   window.add(nums[i]);
  }

  return false;
 }
}



// class Solution
// {
//  public boolean containsNearbyDuplicate(int[] nums, int k)
//  {
//   for(int i=0; i<nums.length; i++)
//   {
//    for(int j=i+1; j<=i+k && j<nums.length; j++)
//    {
//     if(nums[i] == nums[j])
//     {return true;}
//    }
//   }

//   return false;
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