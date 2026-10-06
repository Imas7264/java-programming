import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int arr[] = {-3,0,-3,1,1,1,-3,10,0};
  
  // for(int i: obj.dailyTemperatures(arr))
  // {System.out.print(i+" ");}

  System.out.println(obj.minAddToMakeValid("()))((("));
 }
}




class Solution
{
 public int minAddToMakeValid(String s)
 {
   int count = 0;
   int stack = 0;
   // char stack[] = new char[s.length()];

   for(int i=0; i<s.length(); i++)
   {
    if(s.charAt(i) == '(')
    {stack++;}
    else
    {
     if(stack == 0)
     {count++;}
     else
     {stack--;}
    }
   }

   return count+stack;
 }
}