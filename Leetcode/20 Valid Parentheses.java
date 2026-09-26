import java.util.Stack;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {1, 5, 10, 1};

  System.out.println(obj.isValid("()()(())"));
 }
}



import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int arr[] = {-3,0,-3,1,1,1,-3,10,0};
  
  // for(int i: obj.dailyTemperatures(arr))
  // {System.out.print(i+" ");}

  System.out.println(obj.isValid("([)]"));
 }
}



// Static implementation of stack using array and vaiours other checks improves runtime & memory drastically.
class Solution
{
 public boolean isValid(String s1)
 {
  int n = s1.length(), top=-1;

  if(n%2 != 0)
  {return false;}

  char[] stack = new char[n/2];
  char c;

  for(int i=0; i<n; i++)
  {
   c = s1.charAt(i);

   if(c=='(' || c=='{' || c=='[')
   {
    if(top == stack.length-1)
    {return false;}

    stack[++top] = c;
   }
   else
   {
    if(top == -1)
    {return false;}

    switch(c)
    {
     case ')':
     {
      if(stack[top] != '(')
      {return false;}
      top--;
      break;
     }

     case '}':
     {
      if(stack[top] != '{')
      {return false;}
      top--;
      break;
     }

     case ']':
     {
      if(stack[top] != '[')
      {return false;}
      top--;
      break;
     }
    }
   }
  }

  if(top == -1)
  {return true;}

  return false;
 }
}



// Using stack class causes additional overhead due to it being a dynamic datatype
// class Solution
// {
//  public boolean isValid(String s1)
//  {
//   Stack<Character> stack = new Stack<>();
//   for(int i=0; i<s1.length(); i++)
//   {
//    if(s1.charAt(i)=='(' || s1.charAt(i)=='{' || s1.charAt(i)=='[')
//    {stack.push(s1.charAt(i));}
//    else
//    {
//     if(stack.empty())
//     {return false;}

//     switch(s1.charAt(i))
//     {
//      case ')':
//      {
//       if(stack.peek() != '(')
//       {return false;}
//       stack.pop();
//       break;
//      }

//      case '}':
//      {
//       if(stack.peek() != '{')
//       {return false;}
//       stack.pop();
//       break;
//      }

//      case ']':
//      {
//       if(stack.peek() != '[')
//       {return false;}
//       stack.pop();
//       break;
//      }
//     }
//    }
//   }

//   if(stack.empty())
//   {return true;}

//   return false;
//  }
// }