import java.util.Vector;
import java.util.Scanner;

class Question3
{
 public static void main(String args[])
 {
  Scanner s = new Scanner(System.in);
  int i, j;
  String toRem;
  Vector<String> a = new Vector<>();
  Vector<String> b = new Vector<>(0);

  a.add("ABCD");
  a.add("hello");
  a.add("Apple");
  a.add("hi");
  a.add("bye");
  a.add("1234");
  a.add("XYZ");

  do
  {
   System.out.println("Options vector:");
   for(i=0; i<a.size(); i++)
   {System.out.println((i+1)+") "+a.get(i));}
   System.out.println("8) Exit");

   System.out.print("Enter the index of the element to add to the vector: ");
   j = s.nextInt();
   if(j<8 && j>0)
   {b.add(a.get(j-1));}
   else
   {
    if(j==8)
    {continue;}
    else
    {System.out.println("Invalid Input!!!");}
   }
  }while(j!=8);

  if(b.size()==0)
  {System.out.println("No elements were added.");}
  else
  {
   System.out.println("Elements in the vector:");
   for(i=0; i<b.size(); i++)
   {System.out.println(b.get(i));}
  }
 }
}