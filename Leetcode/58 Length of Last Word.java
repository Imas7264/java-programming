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
  int i=0, prev=0, current=0;
  StringBuilder sb = new StringBuilder("");

  while(i<s.length())
  {
   if(s.charAt(i) == ' ')
   {
    if(current>0)
    {prev = current;}

    current = sb.length();
    sb.delete(0, sb.length());
   }
   else
   {sb.append(s.charAt(i));}

   i++;
  }

  if(current > 0)
  {prev = current;}

  current = sb.length();

  if(current == 0)
  {return prev;}
  
  return current;
 }
}

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