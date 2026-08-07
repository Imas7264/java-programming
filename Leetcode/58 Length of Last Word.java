import java.util.*;

public class Test
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  System.out.println(obj.lengthOfLastWord("   fly me   to   the moon  "));
 }
}



class Solution
{
 public int lengthOfLastWord(String s)
 {
  int count=0, j=s.length()-1;

  while(s.charAt(j) == ' ')
  {j--;}

  for(int i=j; i>-1; i--)
  {
   if(s.charAt(i) == ' ')
   {return count;}
   else
   {count++;}
  }

  return count;
 }
}



// Extra space and also not runtime optimal
// class Solution
// {
//  public int lengthOfLastWord(String s)
//  {
//   String arr[] = s.split(" ");
//   for(String s1: arr)
//   {System.out.print(s1+" ");}
//   return arr[arr.length-1].length();
//  }
// }