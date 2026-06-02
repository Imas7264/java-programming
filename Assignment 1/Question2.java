import java.util.Scanner;

class Question2
{
 public static void main(String args[])
 {
  int num=0, i;

  Scanner s = new Scanner(System.in);

  System.out.println("The password should satisfy the following conditions:\n1) It must have atleast 10 characters.\n2) It should consists of only letters and digits.\n3) It must contain atleast two digits.\nEnter the password to check its validity: ");
  String password = s.nextLine();
  String pass = password.toLowerCase();

  if(pass.length()<10)
  {System.out.println("Invalid password!!! Due to condition 1."); System.exit(0);}

  for(i=0; i<pass.length(); i++)
  {
   if(((pass.charAt(i)<97)||(pass.charAt(i)>122))&&((pass.charAt(i)<48)||(pass.charAt(i)>57)))
   {System.out.println("Invalid password!!! Due to condition 2."); System.exit(0);}

   if((pass.charAt(i)>=48)&&(pass.charAt(i)<=57))
   {num++;}
  }

  if(num<2)
  {System.out.println("Invalid password!!! Due to condition 3."); System.exit(0);}

  System.out.print("The password is valid.");
 }
}