import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {1,3,5,6};

  // System.out.println(obj.searchInsert(nums, 2));
  obj.combine(4, 2);
 }
}



class Solution
{
 List<List<Integer>> answer =  new ArrayList<>();

 public List<List<Integer>> combine(int n, int k)
 {
  addCombination(1, k, n, new ArrayList<>());
  System.out.println(answer);
  return answer;
 }


 void addCombination(int i, int k, int n, List<Integer> soFar)
 {
  System.out.println(soFar);
  if(soFar.size() == k)
  {answer.add(new ArrayList<>(soFar)); return;}

  for(int j=i; n-j >= k-soFar.size()-1; j++)
  {
   soFar.add(j);
   addCombination(j+1, k, n, soFar);
   soFar.remove(soFar.size()-1);
  }
 }
}