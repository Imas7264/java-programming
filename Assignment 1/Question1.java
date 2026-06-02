import java.util.Scanner;

public class Question1
{
 public static void main(String args[])
 {
  Scanner s = new Scanner(System.in);
  int num[], i;
  num= new int[3];

  System.out.println("Enter three integers: ");
  for(i=0; i<3; i++)
  {num[i] = s.nextInt();}

  if(num[0]<num[1]&&num[1]<num[2])
  {System.out.println("Numbers entered are in increasing order.");}
  else
  {
    if(num[0]>num[1]&&num[1]>num[2])
    {System.out.println("Numbers entered are in decreasing order.");}
    else
    {System.out.println("Neither increasing nor decreasing order.");}
  }
 }    
}
