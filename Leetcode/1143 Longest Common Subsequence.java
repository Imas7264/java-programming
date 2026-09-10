import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int arr[] = {73,74,75,71,69,72,76,73};
  
  // for(int i: obj.dailyTemperatures(arr))
  // {System.out.print(i+" ");}

  System.out.println(obj.longestCommonSubsequence("intention", "execution"));
 }
}



class Solution
{
 public int longestCommonSubsequence(String text1, String text2)
 {
  int n = text1.length(), m = text2.length();
  int matrix[][] = new int[n+1][m+1];

  for(int i=1; i<=n; i++)
  {
   for(int j=1; j<=m; j++)
   {
    if(text1.charAt(i-1) == text2.charAt(j-1))
    {matrix[i][j] = matrix[i-1][j-1] + 1;}
    else
    {matrix[i][j] = Math.max(matrix[i][j-1], matrix[i-1][j]);}
   }
  }

  // for(int i=0; i<=n; i++)
  // {
  //  for(int j=0; j<=m; j++)
  //  {System.out.print(matrix[i][j]+" ");}
  //  System.out.print("\n");
  // }

  return matrix[n][m];
 }
}