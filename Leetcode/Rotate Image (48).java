import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};

  obj.rotate(nums);
 }
}


class Solution
{
 public void rotate(int[][] matrix)
 {
  int temp, n=matrix.length;
  for(int i=0; i<n; i++)
  {
   for(int j=i+1; j<n; j++)
   {
    temp = matrix[i][j];
    matrix[i][j] = matrix[j][i];
    matrix[j][i] = temp;
   }
  }

  for(int i=0; i<n; i++)
  {
   for(int j=0; j<n/2; j++)
   {
    temp = matrix[i][j];
    matrix[i][j] = matrix[i][n-j-1];
    matrix[i][n-j-1] = temp;
   }
  }

  for(int i=0; i<matrix.length; i++)
  {
   for(int j=0; j<matrix.length; j++)
   {System.out.print(matrix[i][j]+" ");}
   System.out.print("\n");
  }
 }
}