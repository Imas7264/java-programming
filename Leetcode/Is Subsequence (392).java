import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();

  System.out.println(obj.isSubsequence("axc", "ahbgdc"));
 }
}

class Solution
{
 public boolean isSubsequence(String s, String t)
 {
  int j=0;

  if(s.length() == 0)
  {return true;}
  
  for(int i = 0; i<t.length(); i++)
  {
   if(s.charAt(j) == t.charAt(i))
   {j++;}

   if(j==s.length())
   {return true;}
  }

  if(j<s.length())
  {return false;}

  return true;
 }
}