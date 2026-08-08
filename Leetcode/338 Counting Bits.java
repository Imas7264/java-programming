public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {1,2,3,4,5};
  char chars[] = {'a','b','c'};
  System.out.println(obj.compress(chars));
 }
}



class Solution
{
 public int[] countBits(int n)
 {
  int ans[] = new int[n+1];

  for(int i=1; i<ans.length; i++)
  {ans[i] = ans[i>>1] + (i&1);}

  return ans;
 }
}


// Time complexity is O(n log n), can be optimized to O(n)
// class Solution
// {
//  public int[] countBits(int n)
//  {
//   int ans[] = new int[n+1];

//   for(int i=1; i<ans.length; i++)
//   {ans[i] = countOnes(i);}

//   return ans;
//  }

//  int countOnes(int num)
//  {
//   int count=0;

//   while(num != 0)
//   {
//    if((num&1) == 1)
//    {count++;}
//    num = num>>1;
//   }

//   return count;
//  }
// }