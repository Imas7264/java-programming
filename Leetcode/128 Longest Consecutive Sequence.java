import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {1,3,2};

  System.out.println(obj.longestConsecutive(nums));
 }
}



class Solution
{
 public int longestConsecutive(int[] nums)
 {
  if(nums.length == 0)
  {return 0;}

  HashSet<Integer> s = new HashSet<>();
  for(int i: nums)
  {s.add(i);}

  int max=0, count=0;
  for(int i: s)
  {
   if(!s.contains(i-1))
   {
    while(s.contains(i+1))
    {
     count++;
     i++;
    }
    max = (max<count)?count:max;
    count=0;
   }
  }

  return max+1;
 }
}



// class Solution
// {
//  public int longestConsecutive(int[] nums)
//  {
//   if(nums.length == 0)
//   {return 0;}

//   HashSet<Integer> s = new HashSet<>();
//   for(int i: nums)
//   {s.add(i);}

//   HashMap<Integer,Integer> m = new HashMap<>();
//   for(int i: s)
//   {
//    if(!m.containsKey(i))
//    {
//     if(m.containsKey(i-1))
//     {m.put(i-1, i);}

//     if(m.containsKey(i+1))
//     {m.put(i, i+1);}
//     else
//     {m.put(i,i);}
//    }
//   }

//   int count=0, max=0;
//   for(int i: s)
//   {
//    if(!m.containsKey(i-1))
//    {
//     while(i != m.get(i))
//     {
//      count++;
//      // System.out.println(i);
//      i=m.get(i);
//     }
//     max = (count>max)?count:max;
//     count=0;
//    }
//   }

//   return max+1;
//  }
// }