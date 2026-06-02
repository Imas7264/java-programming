public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {3,2,1,0,4};

  System.out.println(obj.minPartitions("27346209830709182346"));
 }
}


class Solution
{
 public int findMin(int[] nums)
 {
  int n=nums.length, l=0, h=nums.length-1;

  while(nums[m] < nums[m+1])

  return 0;
 }
}


// class Solution
// {
//  public boolean canJump(int[] nums)
//  {
//   boolean result = jump(nums, 0);

//   return result;
//  }


//  static boolean jump(int nums[], int index)
//  {
//   if(index == nums.length-1)
//   {return true;}

//   if(index>=nums.length)
//   {return true;}

//   int i = nums[index];
//   boolean result = false;
//   while(i>0 && !result)
//   {result = jump(nums, index+i); i--;}

//   if(result)
//   {return true;}

//   return false;
//  }
// }