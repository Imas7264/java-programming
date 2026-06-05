import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();

  System.out.println("Answer: "+obj.integerReplacement(8));
 }
}

class Solution
{
 public int integerReplacement(int n)
 {return function((long)n, 0);}

 public static int function(long n, int steps)
 {
  if(n == 1)
  {return steps;}

  if(n%2 == 0)
  {return function(n/2, steps+1);}

  int a = function(n-1, steps+1);
  int b = function(n+1, steps+1);

  return Math.min(a, b);
 }
}