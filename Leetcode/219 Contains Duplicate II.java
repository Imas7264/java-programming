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