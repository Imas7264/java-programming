// To implement Columnar Transposition Cipher
import java.util.*;

class Test
{
 public static void main(String[] args)
 {
  String p = "HELLO WORLD";
  String key = "RAT";
  String c = encrypt(p, key);
  String d = decrypt(c, key);

  System.out.println("Input message: "+p);
  System.out.println("Encrypted message: "+c);
  System.out.println("Decrypted message: "+d);
 }


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
    {mat[i][j] = '.';}
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
    if(mat[i][j] != '.')
     {msg.append(mat[i][j]);}
   }
  }
  
  return msg.toString();
 }
}