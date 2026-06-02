import java.util.*;

public class Test
{
 public static void main(String[] args)
 {
  



  // Solution obj = new Solution();

  // System.out.println(obj.myPow(2, -3));
 }
}



class RandomizedSet {
 ArrayList<Integer> arr;
 HashMap<Integer, Integer> hm;

 public RandomizedSet()
 {
  arr = new ArrayList<>();
  hm = new HashMap<>();
 }
 
 public boolean insert(int val)
 {
  if(hm.get(val) == null)
  {
   arr.add(val);
   hm.put(val, arr.size()-1);

   return true;
  }

  return false;
 }
 
 public boolean remove(int val)
 {
  if(hm.get(val) != null)
  {
   arr.set(hm.get(val), arr.get(arr.size() - 1));
   hm.put(arr.get(arr.size() - 1), hm.get(val));
   arr.remove(arr.size() - 1);
   hm.remove(val);

   return true;
  }

  return false;
 }
 
 public int getRandom()
 {
  Random ran = new Random();
  int i = ran.nextInt(arr.size());

  return arr.get(i);
 }
}







// class Solution
// {
 
// }