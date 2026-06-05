public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[][] nums = {{1,3,5}, {7,9,11}};

  System.out.println(obj.searchMatrix(nums, 3));
 }
}


class Solution
{
 public boolean searchMatrix(int[][] matrix, int target)
 {
  int u=0, d=matrix.length-1, l=0, r=matrix[0].length-1, m=(u+d)/2;
  if(d==0 && r==0)
  {return (target==matrix[d][r])? true:false;}

  while(u<d)
  {
   if(target == matrix[m][r])
   {return true;}

   System.out.println("Checked index: "+m+", "+l);
   
   if(target<matrix[m][r])
   {d = m-1;}
   else
   {u = m+1;}
   
   m=(u+d)/2;
  }
  
  if(matrix[m][l]==target)
  {return true;}
  
  m=(l+r)/2;
  while(l<r)
  {
   if(target == matrix[u][m])
   {return true;}
    
   System.out.println("Checked index: "+u+", "+m);
   
   if(target<matrix[u][m])
   {r=m-1;}
   else
   {l=m+1;}

   m=(l+r)/2;
  }
  if(matrix[u][m]==target)
  {return true;}
  
  return false;
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