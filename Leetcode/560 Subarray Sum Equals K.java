class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int arr[] = {1,-1,0};
  // [1,0,0]
  
  System.out.println(obj.subarraySum(arr, 0));
 }
}



class Solution
{
 public int subarraySum(int[] nums, int k)
 {
  for(int i=1; i<nums.length; i++)
  {nums[i] += nums[i-1];}

  int count=0;
  HashMap<Integer, Integer> map = new HashMap<>();
  map.put(0, 1);

  for(int i=0; i<nums.length; i++)
  {
   if(map.containsKey(k-nums[i]))
   {count += map.get(k-nums[i]);}

   if(map.containsKey(-nums[i]))
   {map.put(-nums[i], map.get(-nums[i])+1);}
   else
   {map.put(-nums[i], 1);}
  }

  return count;
 }
}