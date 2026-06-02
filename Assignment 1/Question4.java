import java.util.Scanner;

class BankAccount
{
 double balance = 0;

 void deposit(double a)
 {
  balance += a;
  System.out.println("Deposited "+ a +"\nTotal Balance: "+balance);
 }

 void withdraw(double s)
 {
  balance -= s;
  System.out.println("Withdrawed "+ s +"\nTotal Balance: "+balance);
 }
}

class SavingsAccount extends BankAccount
{
 void withdraw(double s)
 {
  if(balance-s <= 100)
  {System.out.println("Insufficient balance!!!");}
  else
  {super.withdraw(s);}
 }
}

class Question4
{
 public static void main(String args[])
 {
  Scanner s = new Scanner(System.in);
  SavingsAccount A = new SavingsAccount();
  int i;
  double amt;

  System.out.print("Select:\n 1. Deposit\n 2. Withdraw\n 3. Exit\n Enter your choice: ");
  i = s.nextInt();
  
  while(i != 3)
  {
   switch(i)
   {
    case 1:
    {
     System.out.println("Enter amount to deposit: ");
     amt = s.nextDouble();
     A.deposit(amt);
     break;
    }

    case 2:
    {
     System.out.println("Enter amount to withdraw: ");
     amt = s.nextDouble();
     A.withdraw(amt);
     break;
    }

    default: {System.out.println("Invalid choice!!!");}
   }

   System.out.print("Select:\n 1. Deposit\n 2. Withdraw\n 3. Exit\n Enter your choice: ");
   i = s.nextInt();
  }
 }
}