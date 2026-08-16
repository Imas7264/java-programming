class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int arr[] = {1,1,1,1,1};
  
  System.out.println(obj.longestOnes(arr, 2));
 }
}



class Solution
{
 public int longestOnes(int[] nums, int k)
 {
  int l=0, r=0, maxOnes=0, count=0;

  while(l<nums.length && r<nums.length)
  {
   if(nums[r] == 0)
   {count++;}
   r++;

   if(count<=k)
   {
    // System.out.println(l+" "+r+" "+(r-l));
    maxOnes = (maxOnes < r-l)? r-l : maxOnes;
   }
   
   if(count>k)
   {
    while(l<nums.length && nums[l] != 0)
    {l++;}
    l++; count--;
   }
  }
  
  return maxOnes;
 }
}