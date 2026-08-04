public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {0,2,3,4,5,0,0,0,9};
  System.out.println(obj.minFlips(0,0,3));
 }
}



class Solution
{
 public int minFlips(int a, int b, int c)
 {
  int sum = a|b, count=0;

  while(sum != c)
  {
   if((sum&1) != (c&1))
   {
    if((c&1) == 1)
    {count++;}
    else
    {
     if(((a&1)&(b&1)) == 1)
     {count += 2;}
     else
     {count++;}
    }
   }

   sum = sum>>1;
   c = c>>1;
   a = a>>1;
   b = b>>1;
  }

  return count;
 }
}


// Slightly more memory efficient as it doesn't use the 'sum' variable, logic is the same for both the solutions
// class Solution
// {
//  public int minFlips(int a, int b, int c)
//  {
//   int count=0;

//   while((a|b) != c)
//   {
//    if(((a|b)&1) != (c&1))
//    {
//     if((c&1) == 1)
//     {count++;}
//     else
//     {
//      if(((a&1)&(b&1)) == 1)
//      {count += 2;}
//      else
//      {count++;}
//     }
//    }

//    c = c>>1;
//    a = a>>1;
//    b = b>>1;
//   }

//   return count;
//  }
// }