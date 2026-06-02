class Test
{
 public static void main(String args[])
 {
  DiffieHellman userA = new DiffieHellman(11, 2, 9);
  DiffieHellman userB = new DiffieHellman(11, 2, 4);

  userA.generateSecretKey(userB.y);
  userB.generateSecretKey(userA.y);

  System.out.print("Prime number and it's primitive root are:\np="+userA.p+"\tg="+userA.g+"\n");

  System.out.print("For user A: \nx="+userA.x+"\ty="+userA.y+"\tk="+userA.k+"\n");
  System.out.print("For user B: \nx="+userB.x+"\ty="+userB.y+"\tk="+userB.k+"\n");

  if(userA.k == userB.k)
  {System.out.println("Secret key was generated successfully.");}
  else
  {System.out.println("Secret key generation was unsuccessful.");}
 }
}

class DiffieHellman
{
 int p, g, x, y, k;

 static int modPow(int base, int exp, int mod)
 {
  base = base % mod;
  int result = 1;

  while(exp>0)
  {result = (result*base)%mod; exp--;}

  return result;
 }


 DiffieHellman(int p, int g, int x)
 {
  this.p = p; this.g =g;
  this.x = x;

  y = modPow(g, x, p);
 }


 public void generateSecretKey(int yb)
 {k = modPow(yb, this.x, this.p);}
}

