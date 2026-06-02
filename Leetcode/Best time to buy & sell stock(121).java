import java.util.Scanner;

class Test
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int arr[] = new int[9];

  System.out.print("Enter an array: ");
  for(int i=0; i<6; i++)
  {arr[i] = s.nextInt();}

  int buy=arr[0], profit=0;
  for(int i=1; i<6; i++)
  {
   if(arr[i]<buy)
   {buy = arr[i];}
   else
   {
    if(arr[i]-buy > profit)
    {profit = arr[i]-buy;}
   }
  }

  System.out.println(profit);
 }
}