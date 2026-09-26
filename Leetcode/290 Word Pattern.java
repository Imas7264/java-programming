import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int arr[] = {-3,0,-3,1,1,1,-3,10,0};
  
  // for(int i: obj.dailyTemperatures(arr))
  // {System.out.print(i+" ");}

  System.out.println(obj.wordPattern("abba", "dog cat cat dog"));
 }
}



class Solution
{
 public boolean wordPattern(String pattern, String s)
 {
  String arr[] = s.split(" ");
  int n = pattern.length(), m = arr.length;
  
  if(n != m)
  {return false;}

  HashMap<Character, String> map1 = new HashMap<>(n);
  HashMap<String, Character> map2 = new HashMap<>(m);
  char c;

  for(int i=0; i<n; i++)
  {
   c = pattern.charAt(i);

   if(map1.containsKey(c) && !map1.get(c).equals(arr[i]))
   {return false;}
   else if(map2.containsKey(arr[i]) && map2.get(arr[i]) != c)
   {return false;}
   
   map1.put(c, arr[i]);
   map2.put(arr[i], c);
  }

  return true;
 }
}