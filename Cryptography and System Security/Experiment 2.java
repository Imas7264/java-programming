// To implement Product Cipher using Caeser Cipher and Columnar Transposition Cipher
import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  String p = "ABCWYZ";
  int ck = 3;
  String tk = "RAT";
  Caeser cobj = new Caeser();
  CTC ctcobj = new CTC();

  String c = encrypt(p, ck, tk);
  String d = decrypt(c, ck, tk);
  

  System.out.println("Input message: "+p);
  System.out.println("Encrypted message: "+c);
  System.out.println("Decrypted message: "+d);
 }

 static String encrypt(String s, int ck, String tk)
 {
  Caeser cobj = new Caeser();
  CTC ctcobj = new CTC();

  String c = cobj.encrypt(s, ck);

  return ctcobj.encrypt(c, tk);
 }

 static String decrypt(String s, int ck, String tk)
 {
  Caeser cobj = new Caeser();
  CTC ctcobj = new CTC();

  String d = ctcobj.decrypt(s, tk);

  return cobj.decrypt(d, ck);
 }
}




class Caeser
{
 public String encrypt(String s, int key)
 {
  StringBuilder c = new StringBuilder("");

  for(int i=0; i<s.length(); i++)
  {c.append((char) (((int)s.charAt(i)-(int)'A' + key)%26 + (int)'A'));}
  // System.out.println("Encrypted Text is "+c);

  return c.toString();
 }


 public String decrypt(String s, int key)
 {
  StringBuilder d = new StringBuilder("");

  for(int i=0; i<s.length(); i++)
  {d.append((char) (((int)s.charAt(i)-(int)'Z' - key)%26 + (int)'Z'));}
  // System.out.println("Decrypted Text is "+d);

  return d.toString();
 }
}




class CTC
{
 static String encrypt(String msg, String key)
 {
  char keyArray[] = key.toCharArray();
  Arrays.sort(keyArray);

  int n = key.length(), temp=0;
  int m = (int)Math.ceil((double)msg.length()/n);

  char mat[][] = new char[m][n];

  for(int i=0; i<m; i++)
  {
   for(int j=0; j<n; j++)
   {
    if(temp < msg.length())
    {mat[i][j] = msg.charAt(temp); temp++;}
    else
    {mat[i][j] = 'X';}
   }
  }

  StringBuilder emsg = new StringBuilder("");
  for(int j=0; j<n; j++)
  {
   temp = key.indexOf(keyArray[j]);

   for(int i=0; i<m; i++)
   {emsg.append(mat[i][temp]);}
  }
  
  return emsg.toString();
 }
 
 
 static String decrypt(String emsg, String key)
 {
  char keyArray[] = key.toCharArray();
  Arrays.sort(keyArray);
  
  int n = key.length(), temp=0, temp1=0;
  int m = emsg.length()/n;
  
  char mat[][] = new char[m][n];
  
  for(int j = 0; j<n; j++)
  {
   temp = key.indexOf(keyArray[j]);
   for(int i=0; i<m; i++)
    {mat[i][temp] = emsg.charAt(temp1); temp1++;}
  }
  
  StringBuilder msg = new StringBuilder("");
  for(int i=0; i<m; i++)
 {
  for(int j=0; j<n; j++)
   {
    if(mat[i][j] != 'X')
     {msg.append(mat[i][j]);}
   }
  }
  
  return msg.toString();
 }
}