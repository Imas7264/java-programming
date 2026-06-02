package Q11.Input;
import java.util.Scanner;

public class ab
{
 int a, b;

 public void ab()
 {
  Scanner s = new Scanner(System.in);
  System.out.print("Enter an integer: ");
  a = s.nextInt();
  System.out.print("Enter an integer: ");
  b = s.nextInt();
 }

 public int geta()
 {return a;}

 public int getb()
 {return b;}
}
