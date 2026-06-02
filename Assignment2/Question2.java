import java.util.Scanner;

class oddException extends Exception
{
 public oddException(String a)
 {super(a);}
}

class Question2
{
 static void checkOdd(int a) throws oddException
 {
  if(a%2 != 0)
  {throw new oddException("Number is odd.");}
  else
  {System.out.println("Number is even.");}
 }
 public static void main(String args[])
 {
  Scanner s = new Scanner(System.in);
  int n;

  try
  {
   System.out.print("Enter an integer: ");
   n = s.nextInt();
   checkOdd(n);
  }
  catch(oddException e)
  {System.out.println(e);}

  System.out.println("--- PROGRAM END ---");
 }
}
