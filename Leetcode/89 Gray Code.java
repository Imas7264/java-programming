import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int arr[] = {73,74,75,71,69,72,76,73};
  
  // for(int i: obj.dailyTemperatures(arr))
  // {System.out.print(i+" ");}

  System.out.println(obj.grayCode(3));
 }
}



class Solution
{
 public List<Integer> grayCode(int n)
 {
  List<Integer> gray = new ArrayList<>(1<<n);

  for(int i=0; i<(1<<n); i++)
  {
   gray.add((i^(i>>1)));
  }

  return gray;
 }
}



// Optimal but has significant overhead due to the addition of Integer and int, and accessing the element from the ArrayList
// class Solution
// {
//  public List<Integer> grayCode(int n)
//  {
//   List<Integer> gray = new ArrayList<>(1<<n);
//   gray.add(0);
//   gray.add(1);

//   if(n == 1)
//   {return gray;}

//   gray.add(3);
//   gray.add(2);

//   for(int i=3; i<=n; i++)
//   {
//    int add = 1<<(i-1);

//    for(int j=gray.size()-1; j>=0; j--)
//    {gray.add(gray.get(j)+add);}
//   }

//   return gray;
//  }
// }