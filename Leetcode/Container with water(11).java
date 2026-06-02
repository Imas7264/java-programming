import java.util.Scanner;

class Test
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int arr[] = new int[9];

  System.out.print("Enter an array: ");
  for(int i=0; i<9; i++)
  {arr[i] = s.nextInt();}

  int l=0, h=8, temp, max=0;
  while(l<h)
  {
   if(arr[l]<arr[h])
   {temp = arr[l]*(h-l);}
   else
   {temp = arr[h]*(h-l);}

   if(temp>max)
   {max=temp;}

   if(arr[l]<arr[h])
   {l++;}
   else
   {h--;}
  }

  System.out.println(max);
 }
}