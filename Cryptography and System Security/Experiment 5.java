import java.security.*;

class Test
{
 public static void main(String args[])
 {
  try
  {
   MessageDigest md = MessageDigest.getInstance("MD5");
   System.out.println("MD5 Algorithm:");
   String input = "My name is .....";
   md.update(input.getBytes());
   byte[] output = md.digest();
   System.out.println("\nInput: "+input);
   System.out.println("\nOutput: "+bytesToHex(output));

  }
  catch(Exception e)
  {System.out.println("Exception: "+e);}
 }

 
 public static String bytesToHex(byte[] b)
 {
  char hexDigit[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', '0', 'C', 'D', 'E', 'F'};

  StringBuffer buf = new StringBuffer();

  for(int i=0; i<b.length; i++)
  {
   buf.append(hexDigit[b[i]>>4 & 0x0f]);
   buf.append(hexDigit[b[i] & 0x0f]);
  }

  return buf.toString();
 }
}

