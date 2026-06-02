import java.util.Scanner;

class Test
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int arr[] = new int[9];

  System.out.print("Enter an array: ");
  for(int i=0; i<5; i++)
  {arr[i] = s.nextInt();}

  int profit=0;
  for(int i=1; i<5; i++)
  {
   if(arr[i]-arr[i-1]>0)
   {profit += arr[i]-arr[i-1];}
  }

  System.out.println(profit);
 }
}