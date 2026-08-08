public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {2,2,2,3,3,3};
  char chars[] = {'a','b','c'};
  System.out.println(obj.maxOperations(nums, 5));
 }
}



class Solution
{
 public int maxOperations(int[] nums, int k)
 {
  int count = 0, i=0, j=nums.length-1, sum;
  Arrays.sort(nums);

  while(i<j)
  {
   sum = nums[i] + nums[j];

   if(sum == k)
   {count++; i++; j--;}
   else if(sum<k)
   {i++;}
   else
   {j--;}
  }

  return count;
 }
}



// Optimal time complexity [O(n)] but bad runtime due to hashing and lookups overhead
// class Solution
// {
//  public int maxOperations(int[] nums, int k)
//  {
//   HashMap<Integer, Integer> map = new HashMap<>();
//   int count=0;

//   for(int i=0; i<nums.length; i++)
//   {
//    if(map.containsKey(k-nums[i]) && map.get(k-nums[i]) > 0)
//    {
//     count++;
//     map.put(k-nums[i], map.get(k-nums[i])-1);
//    }
//    else if(map.containsKey(nums[i]))
//    {map.put(nums[i], map.get(nums[i])+1);}
//    else
//    {map.put(nums[i], 1);}
//   }

//   return count;
//  }
// }
