import java.util.*;

public class Test
{
 public static void main(String[] args)
 {
  // Solution obj = new Solution();
  MinStack stk = new MinStack();

  stk.push(-2);
  stk.push(0);
  stk.push(-3);
  System.out.println(stk.getMin());
  stk.pop();
  System.out.println(stk.top());
  System.out.println(stk.getMin());

  // System.out.println(obj.majorityElement(nums));
 }
}




class MinStack
{
 Stack<Integer> minstk;
 Stack<Integer> stk;

 public MinStack()
 {
  minstk = new Stack<>();
  stk = new Stack<>();
 }
 
 public void push(int val)
 {
  if(minstk.isEmpty() || val<=minstk.peek())
  {minstk.push(val); stk.push(val);}
  else
  {stk.push(val);}
 }
 
 public void pop()
 {
  if(stk.isEmpty())
  {return;}

  int temp = stk.pop();
  if(temp == minstk.peek())
  {minstk.pop();}
 }
 
 public int top()
 {return stk.peek();}
 
 public int getMin()
 {return minstk.peek();}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */