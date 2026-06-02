import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();

  // List<List<Integer>> L = new ArrayList<>();
  // List<Integer> L1 = new ArrayList<>();
  // List<Integer> L2 = new ArrayList<>();

  // L1.add(1);
  // L1.add(1);
  // L1.add(1);

  // L2.add(1);
  // L2.add(1);
  // L2.add(1);

  // L.add(L1);
  // L.add(L2);

  int arr[] = {-1,0,1,2,-1,-4};

  System.out.println(obj.threeSum(arr));
 }
}

class Solution
{
 public List<List<Integer>> threeSum(int[] nums)
 {
  List<List<Integer>> M = new ArrayList<>();

  for(int i=0; i<nums.length-2; i++)
  {
   for(int j=i+1; j<nums.length; j++)
   {
    for(int k=j+1; k<nums.length; k++)
    {
     if(nums[i]+nums[j]+nums[k] == 0)
     {
      List<Integer> I = new ArrayList<>();
      I.add(nums[i]);
      I.add(nums[j]);
      I.add(nums[k]);
      M.add(I);
     }
    }
   }
  }

  return M;
 }
}