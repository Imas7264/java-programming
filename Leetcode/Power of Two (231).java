public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  System.out.println(obj.isPowerOfTwo(4));
 }
}


class Solution
{
 public boolean isPowerOfTwo(int n)
 {
  while(((n & 1) == 0) && (n>=1))
  {n = n>>1;}

  if(n==1)
  {return true;}

  return false;
 }
}