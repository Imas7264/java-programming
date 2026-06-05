import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  // int nums[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
  // int nums[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
  // int nums[][] = {{1,2,3},{4,5,6},{7,8,9}};
  int nums[][] = {{1,2,3}};

  obj.spiralOrder(nums);
 }
}


class Solution
{
 public List<Integer> spiralOrder(int[][] matrix)
 {
  int rmin=0, cmin=0, rmax=matrix.length-1, cmax=matrix[0].length-1;
  List<Integer> ans = new ArrayList<>();
  // System.out.println(rmin+" "+rmax+" "+cmin+" "+cmax);
  while(cmin<=cmax && rmin<=rmax)
  {
   for(int j=cmin; j<=cmax; j++)
   {ans.add(matrix[rmin][j]);}
   rmin++;

   for(int i=rmin; i<=rmax; i++)
   {ans.add(matrix[i][cmax]);}
   cmax--;

   if(rmin<=rmax)
   {
    for(int j=cmax; j>=cmin; j--)
    {ans.add(matrix[rmax][j]);}
    rmax--;
   }

   if(cmin<=cmax)
   {
    for(int i=rmax; i>=rmin; i--)
    {ans.add(matrix[i][cmin]);}
    cmin++;
   }

   // System.out.println(rmin+" "+rmax+" "+cmin+" "+cmax);
  }

  // for(int i: ans)
  // {System.out.println(i);}

  return ans;
 }
}