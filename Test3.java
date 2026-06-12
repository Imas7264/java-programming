public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {4,1,2,1,2,2,1};

  System.out.println(obj.singleNumber(nums));
 }
}


class Solution
{
 public int singleNumber(int[] nums)
 {
  int sum1=0, sum2=0;
  for(int i : nums)
  {sum1 = sum1^i; sum2 += i;}

  // for(int i=0; i<nums.length; i++)
  // {nums[i] = nums[i]sum; System.out.println(nums[i]);}



  return sum2-sum1;
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