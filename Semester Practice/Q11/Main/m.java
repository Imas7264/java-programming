package Q11.Main;

import Q11.Add.addition;
import Q11.Input.ab;
import Q11.Sub.subtraction;

public class m
{
 public static void main(String args[])
 {
  int a, b;
  addition ad = new addition();
  subtraction s = new subtraction();
  ab i = new ab();
  i.ab();
  a = i.geta();
  b = i.getb();
  System.out.println("Their additon is "+ad.add(a, b));
  System.out.println("Their subtraction is "+s.sub(a, b));
 }
}
