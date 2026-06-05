import java.util.Scanner;

class Test
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int arr[] = new int[9], target;

  System.out.print("Enter target: ");
  target = s.nextInt();

  System.out.print("Enter an array: ");
  for(int i=0; i<4; i++)
  {arr[i] = s.nextInt();}

  int l=0, h=3;
  while(l<h)
  {
   if(arr[l]+arr[h] == target)
   {System.out.println(l+", "+h); System.exit(0);}

   if(arr[l]+arr[h] > target)
   {h--;}
   else
   {l++;}
  }

  System.out.println("0");
 }
}