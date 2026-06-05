class Test
{
 public static void main(String[] args)
 {
  int arr1[] = {1, 2, 3, 0, 0, 0};
  int arr2[] = {2, 5, 6};
  int n=3, m=3;

  int i=n-1, j=m-1, k=m+n-1;
  while(j>=0)
  {
   if(i>=0 && arr1[i]>arr2[j])
   {arr1[k]=arr1[i]; i--; k--;}
   else
   {arr1[k]=arr2[j]; j--; k--;}
  }

  for(i=0; i<6; i++)
  {System.out.print(arr1[i]+"\t");}
 }
}