import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {1};

  System.out.println(obj.permute(nums));
 }
}



class Solution 
{
 List<List<Integer>> answer = new ArrayList<>();

 public List<List<Integer>> permute(int[] nums) 
 {
  if(nums.length == 0)
  {return answer;}

  boolean used[] = new boolean[nums.length];

  addPermutation(used, nums, new ArrayList<Integer>());

  return answer;
 }

 void addPermutation(boolean[] used, int[] nums, List<Integer> soFar)
 {
  if(soFar.size()==nums.length)
  {answer.add(new ArrayList<Integer>(soFar)); return;}

  for(int j=0; j<nums.length; j++)
  {
   if(!used[j])
   {
    soFar.add(nums[j]); used[j]=true;
    addPermutation(used, nums, soFar);
    soFar.remove(soFar.size()-1); used[j]=false;
   }
  }
 }
}