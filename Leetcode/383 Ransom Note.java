public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  System.out.println(obj.canConstruct("ab", "aab"));
 }
}



class Solution
{
 public boolean canConstruct(String ransomNote, String magazine)
 {
  if(magazine.length() < ransomNote.length())
  {return false;}

  int freq[] = new int[26];

  for(int i=0; i<magazine.length(); i++)
  {
   char c = magazine.charAt(i);

   freq[c-'a']++;
  }

  for(int i=0; i<ransomNote.length(); i++)
  {
   char c = ransomNote.charAt(i);

   freq[c-'a']--;

   if(freq[c-'a'] < 0)
   {return false;}
  }

  return true;
 }
}



// Optimal time complexity, accepted, but way less efficient compared to other solutions
// class Solution
// {
//  public boolean canConstruct(String ransomNote, String magazine)
//  {
//   if(magazine.length() < ransomNote.length())
//   {return false;}

//   HashMap<Character, Integer> map = new HashMap<>();

//   for(int i=0; i<magazine.length(); i++)
//   {
//    char c = magazine.charAt(i);

//    if(map.containsKey(c))
//    {map.put(c, map.get(c)+1);}
//    else
//    {map.put(c, 1);}
//   }

//   for(int i=0; i<ransomNote.length(); i++)
//   {
//    char c = ransomNote.charAt(i);

//    if(!map.containsKey(c))
//    {return false;}
//    else
//    {
//     map.put(c, map.get(c)-1);
    
//     if(map.get(c) < 0)
//     {return false;}
//    }
//   }

//   return true;
//  }
// }