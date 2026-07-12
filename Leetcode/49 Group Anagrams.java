import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {2,0,2,1,1,0};
  String strs[] = {""};

  // for(int i: ans)
  // {System.out.print(i+" ");}
  // obj.sortColors(nums);
  System.out.println(obj.groupAnagrams(strs));
  // System.out.println(map.get("abc"));
 }
}



class Solution 
{
 public List<List<String>> groupAnagrams(String[] strs)
 {
  HashMap<String, List<String>> map = new HashMap<>();

  for(int i=0; i<strs.length; i++)
  {
   int[] alpha = new int[26];
   
   for(int j=0; j<strs[i].length(); j++)
   {alpha[(strs[i].charAt(j) - 'a')]++;}
   
   StringBuilder sb = new StringBuilder("");
   
   for(int j: alpha)
   {sb.append(j); sb.append('-');}

   String key = sb.toString();

   if(!map.containsKey(key))
   {map.put(key, new ArrayList<String>());}

   map.get(key).add(strs[i]);
  }

  return new ArrayList<>(map.values());
 }
}