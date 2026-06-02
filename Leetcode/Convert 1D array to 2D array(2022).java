class Test
{
 public static void main(String[] args)
 {
  int arr[] = {1, 2, 3, 4}, m=2, n=2, k=0;
  int arr2[][] = new int[m][n];
  
  if(m*n != arr.length)
  {printArray(arr2, m, n); System.exit(0);}

  for(int i=0; i<m; i++)
  {
   for(int j=0; j<n; j++)
   {arr2[i][j] = arr[k]; k++;}
  }

  printArray(arr2, m, n);
 }

 static void printArray(int[][] arr, int m, int n)
 {
  for(int i=0; i<m; i++)
  {
   for(int j=0; j<n; j++)
   {System.out.print(arr[i][j]+" ");}
   System.out.println("");
  }
 }
}