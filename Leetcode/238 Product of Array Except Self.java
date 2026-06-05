public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {1,2,3,4};

  obj.productExceptSelf(nums);
 }
}



class Solution
{
 public int[] productExceptSelf(int[] nums)
 {
  int temp1, temp2=nums[0];
  int arr[] = nums.clone();

  nums[0] = 1;
  for(int i=1; i<nums.length; i++)
  {
   temp1 = nums[i];
   nums[i] = temp2*nums[i-1];
   temp2 = temp1;
  }


  // for(int i: nums)
  // {System.out.print(i+" ");}

  temp2 = arr[arr.length-1];
  arr[arr.length-1] = 1;
  for(int i=arr.length-2; i>-1; i--)
  {
   temp1 = arr[i];
   arr[i] = temp2*arr[i+1];
   temp2 = temp1;
  }

  // for(int i: arr)
  // {System.out.print(i+" ");}

  for(int i=0; i<arr.length; i++)
  {arr[i] = arr[i]*nums[i];}
  
  // for(int i: arr)
  // {System.out.print(i+" ");}

  return arr;
 }
}