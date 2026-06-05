import java.util.*;

public class Test2
{
 public static void main(String[] args)
 {
  String[] strs = {"flower", "flow", "flight"};
  if(strs.length == 0)
  {System.exit(0);}

  int min = strs[0].length();

  for(int i=1; i<strs.length; i++)
  {
   if(strs[i].length() < min)
   {min = strs[i].length();}
  }

  if(min == 0)
  {System.exit(0);}

  StringBuilder s = new StringBuilder("");
  for(int i=0; i<min; i++)
  {
   char temp = strs[0].charAt(i);

   for(int j=1; j<strs.length; j++)
   {
    if(strs[j].charAt(i) != temp)
    {System.out.println(s); System.exit(0);}
   }
   
   s.append(temp);
  }

  System.out.println(s);
 }
}