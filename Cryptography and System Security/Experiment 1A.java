// To implement Ceaser Cipher
class Test
{
 public static void main(String[] args)
 {
  String s = "ABCXYZ";
  StringBuilder c = new StringBuilder("");
  StringBuilder d = new StringBuilder("");
  int key = 3;

  System.out.println("Plain Text is "+s);

  for(int i=0; i<s.length(); i++)
  {c.append((char) (((int)s.charAt(i)-(int)'A' + key)%26 + (int)'A'));}
  System.out.println("Encrypted Text is "+c);

  for(int i=0; i<c.length(); i++)
  {d.append((char) (((int)c.charAt(i)-(int)'Z' - key)%26 + (int)'Z'));}
  System.out.println("Decrypted Text is "+d);
 }
}