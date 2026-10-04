import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int arr[] = {-3,0,-3,1,1,1,-3,10,0};
  
  // for(int i: obj.dailyTemperatures(arr))
  // {System.out.print(i+" ");}

  System.out.println(obj.isPalindrome(242));
 }
}




class Solution
{
 public boolean isPalindrome(int x)
 {
  if(x < 0)
  {return false;}

  int sum = 0, n = x, rem;
  while(n > 0)
  {
   rem = n%10;
   sum = sum*10 + rem;
   n = n/10;
  }

  if(x == sum)
  {return true;}

  return false;
 }
}