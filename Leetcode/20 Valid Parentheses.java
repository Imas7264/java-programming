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


class Solution
{
 public boolean isValid(String s1)
 {
  Stack<Character> stack = new Stack<>();
  for(int i=0; i<s1.length(); i++)
  {
   if(s1.charAt(i)=='(' || s1.charAt(i)=='{' || s1.charAt(i)=='[')
   {stack.push(s1.charAt(i));}
   else
   {
    if(stack.empty())
    {return false;}

    switch(s1.charAt(i))
    {
     case ')':
     {
      if(stack.peek() != '(')
      {return false;}
      stack.pop();
      break;
     }

     case '}':
     {
      if(stack.peek() != '{')
      {return false;}
      stack.pop();
      break;
     }

     case ']':
     {
      if(stack.peek() != '[')
      {return false;}
      stack.pop();
      break;
     }
    }
   }
  }

  if(stack.empty())
  {return true;}

  return false;
 }
}