import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int arr[] = {-3,0,-3,1,1,1,-3,10,0};
  
  // for(int i: obj.dailyTemperatures(arr))
  // {System.out.print(i+" ");}

  System.out.println(obj.removeStars("erase*****"));
 }
}



class Solution
{
 public String removeStars(String s)
 {
  int n = s.length(), top=-1;
  char stack[] = new char[s.length()];

  for(int i=0; i<n; i++)
  {
   if(s.charAt(i) != '*')
   {stack[++top] = s.charAt(i);}
   else
   {top--;}
  }

  StringBuilder sb = new StringBuilder("");
  for(int i=0; i<=top; i++)
  {sb.append(stack[i]);}

  return sb.toString();
 }
}