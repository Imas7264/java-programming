import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {1, 2, 3, 4};

  System.out.println(obj.containsNearbyDuplicate(nums, 2));
 }
}



class Solution
{
 public boolean isAnagram(String s, String t)
 {
  if(s.length() != t.length())
  {return false;}
 
  int alpha[] = new int[26];

  for(int i=0; i<s.length(); i++)
  {
   alpha[s.charAt(i)-'a'] += 1;
   alpha[t.charAt(i)-'a'] -= 1;   
  }

  for(int i=0; i<alpha.length; i++)
  {
   if(alpha[i] != 0)
   {return false;}
  }

  return true;
 }
}



// class Solution
// {
//  public boolean isAnagram(String s, String t)
//  {
//   if(s.length() != t.length())
//   {return false;}

//   HashMap<Character, Integer> s1 = new HashMap<>();
//   char a, b;

//   for(int i=0; i<s.length(); i++)
//   {
//    a=s.charAt(i);
//    b=t.charAt(i);
   
//    if(s1.containsKey(s.charAt(i)))
//    {s1.put(a, s1.get(a)+1);}
//    else
//    {s1.put(a, 1);}

//    if(s1.containsKey(t.charAt(i)))
//    {s1.put(b, s1.get(b)-1);}
//    else
//    {s1.put(b, -1);}
//   }

//   for(int i=0; i<s.length(); i++)
//   {
//    a=s.charAt(i);

//    if(s1.get(a) != 0)
//    {return false;}
//   }

//   return true;
//  }
// }
