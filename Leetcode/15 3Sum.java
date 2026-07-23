import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();

  // List<List<Integer>> L = new ArrayList<>();
  // List<Integer> L1 = new ArrayList<>();
  // List<Integer> L2 = new ArrayList<>();

  // L1.add(1);
  // L1.add(1);
  // L1.add(1);

  // L2.add(1);
  // L2.add(1);
  // L2.add(1);

  // L.add(L1);
  // L.add(L2);

  int arr[] = {-1,0,1,2,-1,-4};

  System.out.println(obj.threeSum(arr));
 }
}



class Solution
{
 public List<List<Integer>> threeSum(int[] nums)
 {
  List<List<Integer>> answer = new ArrayList<>();
  Arrays.sort(nums);

  for(int i=0; i<nums.length-2; i++)
  {
   if(i>0 && nums[i]==nums[i-1])
   {continue;}

   int target=-nums[i], l=i+1, r=nums.length-1, sum;

   while(l<r)
   {
    sum = nums[l] + nums[r];
    if(sum == target)
    {
     List<Integer> triplet = new ArrayList<>();
     triplet.add(nums[i]);
     triplet.add(nums[l]);
     triplet.add(nums[r]);

     answer.add(triplet);
     
     while(l<r && nums[l] == triplet.get(1))
     {l++;}

     while(l<r && nums[r] == triplet.get(2))
     {r--;}
    }
    else if(sum < target)
    {l++;}
    else
    {r--;}
   }
  }

  return answer;
 }
}


// Optimal time complexity, not accepted, time limit exceeded
// class Solution
// {
//  public List<List<Integer>> threeSum(int[] nums)
//  {
//   List<List<Integer>> answer = new ArrayList<>();
//   HashMap<String, Integer> mapDuplicate = new HashMap<>();

//   for(int i=0; i<nums.length-2; i++)
//   {
//    HashMap<Integer, Integer> mapTwoSum = new HashMap<>();
//    int target=-nums[i];

//    for(int j=i+1; j<nums.length; j++)
//    {
//     if(mapTwoSum.containsKey(target-nums[j]))
//     {
//      List<Integer> triplet = new ArrayList<>();
//      triplet.add(-target);
//      triplet.add(nums[j]);
//      triplet.add(nums[mapTwoSum.get(target-nums[j])]);
//      System.out.println(triplet);

//      sortTriplet(triplet);
   
//      String s = triplet.toString();
//      // System.out.println(s);
    
//      if(!mapDuplicate.containsKey(s))
//      {answer.add(triplet); mapDuplicate.put(s, 1);}
//     }
//     else
//     {mapTwoSum.put(nums[j], j);}
//    }

//   }

//   return answer;
//  }

 
//  void sortTriplet(List<Integer> triplet)
//  {
//   int temp;
//   if(triplet.get(1) < triplet.get(0))
//   {
//    temp=triplet.get(1);
//    triplet.set(1, triplet.get(0));
//    triplet.set(0, temp);
//   }
  
//   if(triplet.get(2) < triplet.get(1))
//   {
//    temp=triplet.get(1);
//    triplet.set(1, triplet.get(2));
//    triplet.set(2, temp);

//    if(triplet.get(0) > triplet.get(1))
//    {
//     temp=triplet.get(1);
//     triplet.set(1, triplet.get(0));
//     triplet.set(0, temp);
//    }
//   }
//  }
// }



// Brute Force, not accepted, time limit exceeded
// class Solution
// {
//  public List<List<Integer>> threeSum(int[] nums)
//  {
//   List<List<Integer>> answer = new ArrayList<>();
//   HashMap<String, Integer> map = new HashMap<>();

//   for(int i=0; i<nums.length-2; i++)
//   {
//    for(int j=i+1; j<nums.length; j++)
//    {
//     for(int k=j+1; k<nums.length; k++)
//     {
//      if(nums[i]+nums[j]+nums[k] == 0)
//      {
//       List<Integer> triplet = new ArrayList<>();
//       triplet.add(nums[i]);
//       triplet.add(nums[j]);
//       triplet.add(nums[k]);

//       sortTriplet(triplet);
      
//       String s = triplet.toString();
//       // System.out.println(s);
      
//       if(!map.containsKey(s))
//       {answer.add(triplet); map.put(s, 1);}
//      }
//     }
//    }
//   }

//   return answer;
//  }

 
//  void sortTriplet(List<Integer> triplet)
//  {
//   int temp;
//   if(triplet.get(1) < triplet.get(0))
//   {
//    temp=triplet.get(1);
//    triplet.set(1, triplet.get(0));
//    triplet.set(0, temp);
//   }
  
//   if(triplet.get(2) < triplet.get(1))
//   {
//    temp=triplet.get(1);
//    triplet.set(1, triplet.get(2));
//    triplet.set(2, temp);

//    if(triplet.get(0) > triplet.get(1))
//    {
//     temp=triplet.get(1);
//     triplet.set(1, triplet.get(0));
//     triplet.set(0, temp);
//    }
//   }
//  }
// }