import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int arr[] = {-3,0,-3,1,1,1,-3,10,0};
  
  // for(int i: obj.dailyTemperatures(arr))
  // {System.out.print(i+" ");}

  System.out.println(obj.uniqueOccurrences(arr));
 }
}



// Using a boolean array is the most optimal because the frequencycannot exceed the size of the given array
class Solution
{
 public boolean uniqueOccurrences(int[] arr)
 {
  HashMap<Integer, Integer> map = new HashMap<>();
  boolean seen[] = new boolean[arr.length+1];

  for(int i: arr)
  {
   if(map.containsKey(i))
   {map.put(i, map.get(i)+1);}
   else
   {map.put(i, 1);}
  }

  for(int value: map.values())
  {
   if(seen[value])
   {return false;}
   else
   {seen[value] = true;}
  }

  return true;
 }
}



// Optimal but using a set causes hashing overhead which makes it slower and also less memory efficient
// class Solution
// {
//  public boolean uniqueOccurrences(int[] arr)
//  {
//   HashMap<Integer, Integer> map = new HashMap<>();
//   HashSet<Integer>  set = new HashSet<>();

//   for(int i: arr)
//   {
//    if(map.containsKey(i))
//    {map.put(i, map.get(i)+1);}
//    else
//    {map.put(i, 1);}
//   }

//   for(int value: map.values())
//   {
//    if(set.contains(value))
//    {return false;}
//    else
//    {set.add(value);}
//   }

//   return true;
//  }
// }



// Optimal but using lambda funtion (forEach loop) is tedious and unnecessarily complicated
// class Solution
// {
//  public boolean uniqueOccurrences(int[] arr)
//  {
//   HashMap<Integer, Integer> map = new HashMap<>();
//   HashSet<Integer>  set = new HashSet<>();

//   for(int i: arr)
//   {
//    if(map.containsKey(i))
//    {map.put(i, map.get(i)+1);}
//    else
//    {map.put(i, 1);}
//   }

//   boolean flag[] = {true};
//   map.forEach((key, value) -> {
//    if(set.contains(value))
//    {flag[0] = false;}
//    else
//    {set.add(value);}
//   });

//   return flag[0];
//  }
// }