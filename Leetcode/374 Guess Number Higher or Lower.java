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



public class Solution extends GuessGame
{
 public int guessNumber(int n)
 {
  int l=1, h=n, m;
  while(true)
  {
   m=l+((h-l)/2); //avoids integer overflow that can be caused by h+l

   switch(guess(m))
   {
    case 1: l=m+1; break;
    case -1: h=m-1; break;
    case 0: return m;
   }
  }
 }
}