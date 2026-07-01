public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {2,3,1,1,4};

  System.out.println(obj.canJump(nums));
 }
}



class Solution
{
 public boolean canJump(int[] nums)
 {
  int maxReachable=0;

  for(int i=0; i<=maxReachable; i++)
  {
   if(maxReachable>=nums.length-1)
   {return true;}

   maxReachable = (nums[i]+i > maxReachable)? nums[i]+i : maxReachable;   
  }

  return false;
 }
}



// class Solution
// {
//  public boolean canJump(int[] nums)
//  {
//   int canReach[] = new int[nums.length];
//   canReach[0] = 1;

//   for(int i=0; canReach[i]==1; i++)
//   {
//    if(i == nums.length -1)
//    {return true;}

//    for(int j=i+1; j<nums.length && j<=i+nums[i]; j++)
//    {canReach[j]=1;}

//    // for(int k: canReach)
//    // {System.out.print(k+" ");}
//   }

//   return false;
//  }
// }