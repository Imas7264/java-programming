import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int arr[] = {8,1,2,2,100};
  
  for(int i: obj.smallerNumbersThanCurrent(arr))
  {System.out.print(i+" ");}

  // System.out.println(obj.minAddToMakeValid("()))((("));
 }
}




// Using prefix sum array improves runtime
class Solution
{
 public int[] smallerNumbersThanCurrent(int[] nums)
 {
  int freq[] = new int[101];
  int ans[] = new int[nums.length];
  int count = 0, prev;

  for(int i=0; i<nums.length; i++)
  {freq[nums[i]]++;}

  prev = freq[0];
  freq[0] = 0;
  for(int i=1; i<freq.length; i++)
  {
   count = freq[i];
   freq[i] = freq[i-1] + prev;
   prev = count;
  }
  
  for(int i=0; i<nums.length; i++)
  {ans[i] = freq[nums[i]];}

  return ans;
 }
}



// class Solution
// {
//  public int[] smallerNumbersThanCurrent(int[] nums)
//  {
//   int freq[] = new int[101];
//   int ans[] = new int[nums.length];
//   int count;

//   for(int i=0; i<nums.length; i++)
//   {freq[nums[i]]++;}
  
//   for(int i=0; i<nums.length; i++)
//   {
//    count=0;
//    for(int j = nums[i]-1; j>-1; j--)
//    {
//     if(freq[j] != 0)
//     {count += freq[j];}
//    }
//    ans[i] = count;
//   }

//   return ans;
//  }
// }