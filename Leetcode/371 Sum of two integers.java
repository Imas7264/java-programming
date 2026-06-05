class Test
{
 public static void main(String[] args)
 {
  int a=5, b=3, sum, temp;

  do
  {
   temp = a;
   a = a^b;
   b = (temp&b)<<1;
  }while((a&b) != 0);

  sum = a^b;
  System.out.println(sum);
 }
}