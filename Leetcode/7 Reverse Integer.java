public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[][] nums = {{1, 5, 10, 11}};

  System.out.println(obj.reverse(-102));
 }
}


class Solution
{
 public int reverse(int x)
 {
  int r, sum=0;

  while(x!=0)
  {
   r=x%10;
   
   if(sum>Integer.MAX_VALUE/10 || sum<Integer.MIN_VALUE/10 || (sum==Integer.MAX_VALUE && r>7) || (sum==Integer.MIN_VALUE && r<-8))
   {return 0;}

   sum =  sum*10+r;
   x=x/10;
  }

  return sum;
 }
}