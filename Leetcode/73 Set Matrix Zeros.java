class Test
{
 public static void main(String[] args)
 {
  int[][] arr = {{0, 2, 0}, {4, 5, 6}, {7, 8, 9}};
  
  System.out.println("Entered matrix:");
  for(int i=0; i<3; i++)
  {
   for(int j=0; j<3; j++)
   {System.out.print(arr[i][j]+" ");}
   System.out.println("");
  }

  for(int i=0; i<3; i++)
  {
   for(int j=0; j<3; j++)
   {
    if(arr[i][j] == 0)
    {
     arr[i][j]=-1;
     arr = setChange(arr, i, j, 3, 3);
    }
   }
  }

  for(int i=0; i<3; i++)
  {
   for(int j=0; j<3; j++)
   {
    if(arr[i][j] == -1)
    {arr[i][j]=0;}
   }
  }

  System.out.println("0-ed matrix:");
  for(int i=0; i<3; i++)
  {
   for(int j=0; j<3; j++)
   {System.out.print(arr[i][j]+" ");}
   System.out.println("");
  }
 }

 static int[][] setChange(int arr[][], int i, int j, int m, int n)
 {
  for(int k=0; k<m; k++)
  {
   if(arr[k][j] == 0)
   {continue;}
   else
   {arr[k][j]=-1;}
  }

  for(int k=0; k<n; k++)
  {
   if(arr[i][k] == 0)
   {continue;}
   else
   {arr[i][k]=-1;}
  }

  return arr;
 }
}