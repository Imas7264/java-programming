import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int arr[] = {-3,0,-3,1,1,1,-3,10,0};
  
  // for(int i: obj.dailyTemperatures(arr))
  // {System.out.print(i+" ");}

  System.out.println(obj.reverseParentheses("(abcd)"));
 }
}




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