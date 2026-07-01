public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  // int[][] nums = {{1,0,1},{8,8,8},{2,0,3}};
  int[][] nums = {{1,0,0},{0,0,0},{0,0,1}};
  int[][] ans = obj.lightsOut(nums);

  // System.out.println(obj.canJump(nums));
  for(int[] i: ans)
  {
   for(int j: i)
   {System.out.print(j+" ");}
   System.out.println();
  }
 }
}



class Solution
{
 int[][] lightsOut(int[][] input)
 {
  int[][] output = new int[input.length][input[0].length];

  for(int i=0; i<input.length; i++)
  {
   for(int j=0; j<input[i].length; j++)
   {input[i][j] = input[i][j] % 2; output[i][j]=1;}
  }

  for(int i=0; i<input.length; i++)
  {
   for(int j=0; j<input[i].length; j++)
   {
    if(input[i][j] == 1)
    {
     output[i][j] = (output[i][j] == 0)? 1: 0;

     if(i-1 > -1)
     {output[i-1][j] = (output[i-1][j] == 0)? 1: 0;}
     
     if(i+1 < input.length)
     {output[i+1][j] = (output[i+1][j] == 0)? 1: 0;}

     if(j-1 > -1)
     {output[i][j-1] = (output[i][j-1] == 0)? 1: 0;}
     
     if(j+1 < input[0].length)
     {output[i][j+1] = (output[i][j+1] == 0)? 1: 0;}
    }
   }
  }

  return output;
 }
}