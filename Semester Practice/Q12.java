import java.util.Scanner;

class Q12
{
 public static void main(String args[])
 {
  int n, i, j;
  Scanner s = new Scanner(System.in);

  System.out.print("Enter the order of the matrix: ");
  n = s.nextInt();

  int a[][] = new int[n][n];
  int b[][] = new int[n][n];
  int c[][] = new int[n][n];
  int d[][] = new int[n][n];

  System.out.println("Enter elements of matrix A: ");
  for(i=0; i<n; i++)
  {
   for(j=0; j<n; j++)
   {
    System.out.print("Enter element "+(i+1)+", "+(j+1)+": ");
    a[i][j] = s.nextInt();
   }
  }

  System.out.println();
  System.out.println();

  System.out.println("Enter elements of matrix B: ");
  for(i=0; i<n; i++)
  {
   for(j=0; j<n; j++)
   {
    System.out.print("Enter element "+(i+1)+", "+(j+1)+": ");
    b[i][j] = s.nextInt();
   }
  }

  System.out.println();
  System.out.println();

  System.out.println("Entered matrix A: ");
  for(i=0; i<n; i++)
  {
   for(j=0; j<n; j++)
   {System.out.print(a[i][j]+"\t");}

   System.out.println();
  }

  System.out.println();
  System.out.println();

  System.out.println("Entered matrix B: ");
  for(i=0; i<n; i++)
  {
   for(j=0; j<n; j++)
   {System.out.print(b[i][j]+"\t");}

   System.out.println();
  }

  for(i=0; i<n; i++)
  {
   for(j=0; j<n; j++)
   {c[i][j] = a[i][j] + b[i][j];}
  }

  for(i=0; i<n; i++)
  {
   for(j=0; j<n; j++)
   {d[i][j] = a[i][j] - b[i][j];}
  }

  System.out.println();
  System.out.println();

  System.out.println("Addition is A+B: ");
  for(i=0; i<n; i++)
  {
   for(j=0; j<n; j++)
   {System.out.print(c[i][j]+"\t");}

   System.out.println();
  }

  System.out.println();
  System.out.println();
 
  System.out.println("Subtraction is A-B: ");
  for(i=0; i<n; i++)
  {
   for(j=0; j<n; j++)
   {System.out.print(d[i][j]+"\t");}
 
   System.out.println();
  }
 }
}