public class Test
{
 public static void main(String[] args)
 {
  int num = 38;
  int sum = num, temp = 0;

  while(sum/10 != 0)
  {
   while(sum != 0)
   {
    temp += sum%10;
    sum = Math.floorDiv(sum, 10);
   }

   sum = temp;
   temp = 0;
  }
  
  System.out.println(sum);
 }
}