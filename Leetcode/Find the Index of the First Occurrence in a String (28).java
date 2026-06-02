import java.util.*;

public class Test
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();

  System.out.println(obj.strStr("codet", "et"));
 }
}




class Solution
{
 public int strStr(String haystack, String needle)
 {
  if(haystack.length() < needle.length())
  {return -1;}

  for(int i=0; i<haystack.length(); i++)
  {
   if(haystack.charAt(i) == needle.charAt(0))
   {
    if(needle.length() == 1)
    {return i;}

    int j = 1;
    for(j=1; j<needle.length() && i+j < haystack.length(); j++)
    {
     if(haystack.charAt(i+j) != needle.charAt(j))
     {break;}
    }

    if(j == needle.length())
    {return i;}
   }
  }

  return -1;
 }
}