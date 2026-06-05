import java.util.*;

public class Test2
{
 // public static void main(String[] args)
 // {
 //  char[] s = {'h', 'e', 'l', 'l', 'o'};
 //  char temp;

 //  for(int i=0; i<s.length/2; i++)
 //  {
 //   temp = s[i];
 //   s[i]=s[s.length-1-i];
 //   s[s.length-1-i]=temp;
 //  }


 //  for(int i=0; i<s.length; i++)
 //  {System.out.print(s[i]+" ");}
 // }

 public static void main(String[] args)
 {
  char[] s = {'h', 'e', 'l', 'l', 'o'};
  char temp;

  for(int i=0, j=s.length-1; i<s.length/2; i++, j--)
  {
   temp = s[i];
   s[i]=s[j];
   s[j]=temp;
  }

  for(int i=0; i<s.length; i++)
  {System.out.print(s[i]+" ");}
 }
}