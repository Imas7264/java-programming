import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int arr[] = {73,74,75,71,69,72,76,73};
  
  for(int i: obj.dailyTemperatures(arr))
  {System.out.print(i+" ");}
 }
}



// Array implementation of the monotonic stack eliminates the overhead caused by using the Stack object
class Solution
{
 public int[] dailyTemperatures(int[] temperatures)
 {
  int i = temperatures.length-1;
  int[] monoStack = new int[i+1];
  int top = -1;
  int[] answer = new int[i+1];

  while(i>-1)
  {
   while(top != -1 && (temperatures[monoStack[top]] <= temperatures[i]))
   {top--;}

   if(top == -1)
   {answer[i] = 0;}
   else
   {answer[i] = monoStack[top]-i;}

   monoStack[++top] = i;
   i--;
  }

  return answer;
 }
}




// Optimal time and space complexity but using the Stack object increases the overhead significantly
// class Solution
// {
//  public int[] dailyTemperatures(int[] temperatures)
//  {
//   Stack<Integer> monoStack = new Stack<>();
//   int i = temperatures.length-1;
//   int[] answer = new int[i+1];

//   while(i>-1)
//   {
//    while(!monoStack.isEmpty() && (temperatures[monoStack.peek()] <= temperatures[i]))
//    {monoStack.pop();}

//    if(monoStack.isEmpty())
//    {answer[i] = 0;}
//    else
//    {answer[i] = monoStack.peek()-i;}

//    monoStack.push(i);
//    i--;
//   }

//   return answer;
//  }
// }