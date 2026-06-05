public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {3,2,1,0,4};

  System.out.println(obj.minPartitions("27346209830709182346"));
 }
}


class Solution
{
 public int minPartitions(String n)
 {
  int max = n.charAt(0)-48, num;

  for(int i=1; i<n.length(); i++)
  {
   num = n.charAt(i) - 48;
   max = (max < num)? num : max;
  }

  return max;
 }
}