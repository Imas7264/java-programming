import java.util.Scanner;

class Question1
{
 public static void main(String args[])
 {
  Scanner s = new Scanner(System.in);
  int n, i, j, flag=0;

  System.out.print("Enter the size of the array: ");
  n = s.nextInt();

  int num[] = new int[n];
  int num2[] = new int[n];

  System.out.println("Enter integer elements in the array(except 0):");
  for(i=0; i<n; i++)
  {
   System.out.print("Enter element "+(i+1)+": ");
   num[i] = s.nextInt();
  }

  for(i=0; i<n; i++)
  {
   for(j=0; j<n; j++)
   {
    if(num[i] == num2[j])
    {flag++;}
   }

   if(flag==0)
   {
    for(j=0; j<n; j++)
    {
     if(num2[j] == 0)
     {num2[j] = num[i]; break;}
    }
   }
   flag = 0;
  }

  for(i=0; i<num2.length; i++)
  {
   if(num2[i] != 0)
   {System.out.print(num2[i]+"\t");}
  }
 }
}