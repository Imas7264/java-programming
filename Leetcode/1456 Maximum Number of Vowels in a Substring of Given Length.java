import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int arr[] = {73,74,75,71,69,72,76,73};
  
  // for(int i: obj.dailyTemperatures(arr))
  // {System.out.print(i+" ");}

  System.out.println(obj.maxVowels("leetcode", 3));
 }
}



class Solution
{
 public int maxVowels(String s, int k)
 {
  int count=0, maxCount=0, l=0, h=0;

  while(h<k && h<s.length())
  {
   char c = s.charAt(h);
   if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
   {count++;}

   h++;
  }
  maxCount=count;

  while(h<s.length())
  {
   char c = s.charAt(l);
   if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
   {count--;}
   l++;

   c = s.charAt(h);
   if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
   {count++;}
   h++;

   maxCount = (count>maxCount)? count : maxCount;
  }

  return maxCount;
 }
}