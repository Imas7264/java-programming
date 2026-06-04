public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {1,2,3,4,5,6,7,8};

  System.out.println(obj.findMin(nums));
 }
}


class Solution
{
 public int findMin(int[] nums)
 {
  if(nums.length == 1)
  {return nums[0];}

  int l=0, h=nums.length-1, m=(l+h)/2;

  while(nums[m]<nums[m+1] && l<h)
  {
   if(nums[m]<nums[h])
   {h=m;}
   else
   {l=m;}

   m=(h+l)/2;
  }

  return (l<h)? nums[m+1]:nums[m];
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