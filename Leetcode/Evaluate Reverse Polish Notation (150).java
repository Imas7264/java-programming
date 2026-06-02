import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  String tokens[] = {"4","13","5","/","+"};
  Solution obj = new Solution();

  System.out.println("Answer: "+obj.evalRPN(tokens));
 }
}

class Solution
{
 public int evalRPN(String[] tokens)
 {
  Stack<Integer> stk = new Stack<>();
  int a;

  for(String s : tokens)
  {
   switch(s)
   {
    case "+":
    {
     a = stk.pop();
     stk.push(stk.pop()+a);
     break;
    }

    case "-":
    {
     a = stk.pop();
     stk.push(stk.pop()-a);
     break;
    }

    case "*":
    {
     a = stk.pop();
     stk.push(stk.pop()*a);
     break;
    }

    case "/":
    {
     a = stk.pop();
     stk.push(stk.pop()/a);
     break;
    }

    default:
    {stk.push(Integer.parseInt(s));}
   }
  }

  return stk.pop();
 }
}