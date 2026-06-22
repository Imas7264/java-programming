public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {4,1,2,1,2,2,1};

  System.out.println(obj.convert("PAYPALISHIRING", 4));
 }
}

class Solution
{
 public String convert(String s, int numRows)
 {
  if(numRows == 1)
  {return s;}
  
  int direction=1, ptr=0;
  StringBuilder mat[] = new StringBuilder[numRows];
  StringBuilder ans = new StringBuilder();

  for(int i=0; i<mat.length; i++)
  {mat[i] = new StringBuilder("");}


  for(int i=0; i<s.length(); i++)
  {
   mat[ptr].append(s.charAt(i));
   ptr = ptr+direction;

   if(ptr==numRows-1 || ptr==0)
   {direction = -direction;}
  }

  for(StringBuilder s1: mat)
  {ans.append(s1);}

  return ans.toString();
 }
}