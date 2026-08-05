public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {1,2,3,4,5};
  int nums2[] = {3,4,5,1,2};
  System.out.println(obj.canCompleteCircuit(nums, nums2));
 }
}



class Solution
{
 public int canCompleteCircuit(int[] gas, int[] cost)
 {
  int total = 0;
  
  for(int i=0; i<gas.length; i++)
  {total += gas[i]-cost[i];}

  if(total<0)
  {return -1;}

  int start=0, currentGas=0;

  for(int i=0; i<gas.length; i++)
  {
   currentGas = currentGas - cost[i] + gas[i];

   if(currentGas < 0)
   {start = i+1; currentGas = 0;}
  }

  return start;
 }
}



// Brute force approach
// class Solution
// {
//  public int canCompleteCircuit(int[] gas, int[] cost)
//  {
//   int totalGas=0, totalCost=0;
  
//   for(int i=0; i<gas.length; i++)
//   {totalGas+=gas[i]; totalCost+=cost[i];}

//   if(totalGas<totalCost)
//   {return -1;}

//   int start=0, currentGas=gas[0], i=0, count=0;
  
//   while(count<gas.length)
//   {
//    currentGas -= cost[i];
//    i = (i+1)%gas.length;

//    if(currentGas < 0)
//    {
//     currentGas = gas[i];
//     start = i;
//     count = 0;
//    }
//    else
//    {
//     currentGas += gas[i];
//     count++;
//    }
//   }

//   return start;
//  }
// }