public class Test
{
 public static void main(String[] args)
 {
  String s = "abcabcbb";

  StringBuilder r = new StringBuilder(""+s.charAt(0));
  int len=1, maxLen=1;

  for(int i=1; i<s.length(); i++)
  {
   int flag=0;

   for(int j=0; j<r.length(); j++)
   {
    if(s.charAt(i) == r.charAt(j))
    {
     flag=1;
     
     for(int k=0; k<=j; k++)
     {r.deleteCharAt(0); len--;}

     r.append(s.charAt(i)); len++;
     break;
    }

    System.out.println(r);
   }

   if(flag != 1)
   {r.append(s.charAt(i)); len++;}
   
   maxLen = Math.max(len, maxLen);
  }

  System.out.println(maxLen);
  System.out.println(r);
 }
} {
 
}
