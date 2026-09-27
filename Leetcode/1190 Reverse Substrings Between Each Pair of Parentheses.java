import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int arr[] = {-3,0,-3,1,1,1,-3,10,0};
  
  // for(int i: obj.dailyTemperatures(arr))
  // {System.out.print(i+" ");}

  System.out.println(obj.reverseParentheses("(a(bc)d)"));
 }
}



// Optimal solution traverses the string almost exactly twice and makes use of a teleporter integr array.
class Solution
{
 public String reverseParentheses(String s)
 {
  int n = s.length(), temp;
  char c;
  Stack<Integer> stack = new Stack<>();
  int teleporter[] = new int[n];

  for(int i=0; i<n; i++)
  {
   c = s.charAt(i);
   if(s.charAt(i) == '(')
   {stack.push(i);}
   else if(s.charAt(i) == ')')
   {
    temp = stack.pop();
    teleporter[i] = temp;
    teleporter[temp] = i;
   }
  }

  int direction = 1;
  StringBuilder sb = new StringBuilder("");
  for(int i=0; i<n; i+=direction)
  {
   c = s.charAt(i);
   if(c == '(' || c == ')')
   {i = teleporter[i]; direction = -direction;}
   else
   {sb.append(c);}
  }

  return sb.toString();
 }
}



// Optimal complexity but requires too many operations and much much extra memory.
// class Solution
// {
//  public String reverseParentheses(String s)
//  {
//   Stack<Character> stack = new Stack<>();
//   Queue<Character> queue = new LinkedList<>();
//   StringBuilder sb = new StringBuilder("");

//   int j = 0, n = s.length();
//   while(j<n && s.charAt(j) != '(')
//   {sb.append(s.charAt(j)); j++;}

//   for(int i=j; i<n; i++)
//   {
//    char c = s.charAt(i);
//    // System.out.println(stack);

//    if(c != ')')
//    {stack.push(c);}
//    else
//    {
//     while(stack.peek() != '(')
//     {queue.add(stack.pop());}
//     stack.pop();

//     while(!queue.isEmpty())
//     {stack.push(queue.remove());}
//    }
//   }

//   // System.out.println(stack);
//   Stack<Character> tempStack = new Stack<>();
//   while(!stack.isEmpty())
//   {tempStack.push(stack.pop());}

//   while(!tempStack.isEmpty())
//   {sb.append(tempStack.pop());}

//   // while(j < s.length() && s.charAt(j) != ')')
//   // {sb.append(s.charAt(j)); j++;}

//   return sb.toString();
//  }
// }