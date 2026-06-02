import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();

  System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));
 }
}

class Solution
{
 public boolean isPalindrome(String s)
 {
  String alnums = s.replaceAll("[^a-zA-Z0-9]", "");
  alnums = alnums.toLowerCase();
  int i=0, j=alnums.length()-1;

  while(i<j)
  {
   if(alnums.charAt(i) != alnums.charAt(j))
   {return false;}

   i++; j--;
  }

  System.out.println(alnums);

  return true;
 }
}