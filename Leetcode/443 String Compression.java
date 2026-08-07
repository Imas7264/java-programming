public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {1,2,3,4,5};
  char chars[] = {'a','b','c'};
  System.out.println(obj.compress(chars));
 }
}



class Solution
{
 public int compress(char[] chars)
 {
  if(chars.length == 0)
  {return 0;}

  int count=1, write=1;

  for(int i=1; i<chars.length; i++)
  {
   if(chars[i] == chars[i-1])
   {count++;}
   else
   {
    if(count>1)
    {
     String num = Integer.toString(count);

     for(int j=0; j<num.length(); j++)
     {chars[write+j] = num.charAt(j);}
     write+=num.length();
    }
    
    chars[write] = chars[i];
    write++;
    count=1;
   }
  }

  if(count>1)
  {
   String num = Integer.toString(count);

   for(int i=0; i<num.length(); i++)
   {chars[write+i] = num.charAt(i);}
   write+=num.length();
  }

  // for(char c: chars)
  // {System.out.print(c+" ");}

  return write;
 }
}