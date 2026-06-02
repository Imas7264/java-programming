public class Test3
{
 public static void main(String[] args)
 {
  RSA obj = new RSA();

  obj.keyGeneration(17, 11);

  System.out.println("RSA Encryption");
  String p = "Hello World";
  String c = obj.encrypt("Hello World");

  System.out.println("Public key(n, e): ["+obj.PublicKey[0]+", "+obj.PublicKey[1]+"]");
  System.out.println("Private key(n, d): ["+obj.PrivateKey[0]+", "+obj.PrivateKey[1]+"]");
  System.out.println("Plain Text: "+p);
  System.out.println("Encrypted Text: "+c);
  System.out.println("Decrypted Text: "+obj.decrypt(c));

  System.out.println("----------------------------------------------------------------\n");

  System.out.println("RSA Digital Signature");
  String message = "Hello";
  String signature = obj.sign(message);
  String verifiedMessage = obj.verify(signature);
  System.out.println("Message: "+message);
  System.out.println("Verified message: "+verifiedMessage);

  if(message.equals(verifiedMessage))
  {System.out.println("Signature is valid.");}
  else
  {System.out.println("Signature is invalid.");}
 }
}




class RSA
{
 int[] PublicKey;
 int[] PrivateKey;

 static int calcGCD(int a, int b)
 {
  int temp;
  while(b != 0)
  {
   temp = a;
   a = b;
   b = temp%b;
  }
  
  return a;
 }


 static int calcCoprime(int eF)
 {
  int gcd = 0, e=2;
  
  while(true)
  {
   gcd = calcGCD(e, eF);

   if(gcd == 1)
   {return e;}

   e++;
  }
 }


 static int calcMulInverse(int e, int eF)
 {
  e = e%eF;

  for(int d=1; d<eF; d++)
  {
   if((e*d)%eF == 1)
   {return d;}
  }

  return -1;
 }


 public void keyGeneration(int p, int q)
 {
  int n = p*q, eF = (p-1)*(q-1);

  int e = calcCoprime(eF);
  int d = calcMulInverse(e, eF);

  this.PublicKey = new int[2];
  PublicKey[0] = n;
  PublicKey[1] = e;

  this.PrivateKey = new int[2];
  PrivateKey[0] = n;
  PrivateKey[1] = d;
 }


 static int modPow(int base, int exp, int mod)
 {
  base = base % mod;
  int result = 1;

  while(exp>0)
  {result = (result*base)%mod; exp--;}

  return result;
 }


 public String encrypt(String p)
 {
  int n = this.PublicKey[0];
  int e = this.PublicKey[1];

  StringBuilder s = new StringBuilder();

  for(int i=0; i<p.length(); i++)
  {
   int c = modPow((int)p.charAt(i), e, n);
   s.append(c).append(' ');
  }

  return s.toString();
 }


 public String decrypt(String c)
 {
  int n = this.PrivateKey[0];
  int d = this.PrivateKey[1];

  StringBuilder p = new StringBuilder();
  StringBuilder num = new StringBuilder();

  for(int i=0; i<c.length(); i++)
  {
   if(c.charAt(i) == ' ')
   {
    int ascii = modPow(Integer.parseInt(num.toString()), d, n);
    p.append((char)ascii);
    num.setLength(0);
   }
   else
   {num.append(c.charAt(i));}
  }

  return p.toString();
 }


 public String sign(String p)
 {int n = this.PrivateKey[0];
  int d = this.PrivateKey[1];

  StringBuilder s = new StringBuilder();

  for(int i=0; i<p.length(); i++)
  {
   int c = modPow((int)p.charAt(i), d, n);
   s.append(c).append(' ');
  }

  return s.toString();
 }


 public String verify(String c)
 {
  int n = this.PublicKey[0];
  int e = this.PublicKey[1];

  StringBuilder p = new StringBuilder();
  StringBuilder num = new StringBuilder();

  for(int i=0; i<c.length(); i++)
  {
   if(c.charAt(i) == ' ')
   {
    int ascii = modPow(Integer.parseInt(num.toString()), e, n);
    p.append((char)ascii);
    num.setLength(0);
   }
   else
   {num.append(c.charAt(i));}
  }

  return p.toString();
 }
} {
 
}
