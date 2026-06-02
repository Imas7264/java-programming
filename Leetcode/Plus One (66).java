class Test
{
 public static void main(String[] args)
 {
  int digits[] = {9, 9}, n = digits.length, i = 1;

  do
  {
   digits[n - i] += 1;
   if(digits[n-i] == 10)
   {digits[n-i]=0;}
   i++;
  }while(i<n+1 && digits[n-i+1]==0);

  if(digits[0] == 0)
  {
   int[] digits2 = new int[digits.length + 1];
   digits2[0]=1;

   for(i=0; i<n+1; i++)
   {System.out.print(digits2[i]+" ");}

   System.exit(0);
  }

  for(i=0; i<n; i++)
  {System.out.print(digits[i]+" ");}
 }
}