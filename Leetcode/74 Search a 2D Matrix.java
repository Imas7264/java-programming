public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[][] nums = {{1}, {2}, {3}};

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
   if(target == matrix[m][l])
   {return true;}

   System.out.println("Checked column index: "+m+", "+l);
   
   if(matrix[m][l]<target && target<=matrix[m][r])
   {u=m; break;}

   if(target<matrix[m][l])
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
    
   System.out.println("Checked row index: "+u+", "+m);
   
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