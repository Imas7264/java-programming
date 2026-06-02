ublic class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int[] nums = {3,2,1,0,4};

  System.out.println(obj.addBinary("101111","10"));
 }
}




class Solution
{
 public String addBinary(String a, String b)
 {
  StringBuilder ans = new StringBuilder();
  int i, j, carry=0;

  for(i=a.length()-1, j=b.length()-1; i!=-1 && j!=-1; i--, j--)
  {
   if(a.charAt(i)=='1' && b.charAt(j)=='1')
   {
    if(carry == 1)
    {ans.append('1');}
    else
    {ans.append('0');}
    carry = 1;
    continue;
   }
   else if(a.charAt(i)=='1' || b.charAt(j)=='1')
   {
    if(carry == 1)
    {ans.append('0');}
    else
    {ans.append('1');}
    continue;
   }

   if(carry == 1)
   {ans.append('1'); carry = 0;}
   else
   {ans.append('0');}
  }

  // System.out.println(i+" "+j+" "+carry);

  if(i==-1)
  {i=j; a=b;}

  while(i!=-1)
  {
   if(a.charAt(i) == '1' && carry == 1)
   {ans.append(0); i--; continue;}

   if(carry == 1)
   {ans.append('1'); carry = 0; i--; continue;}

   ans.append(a.charAt(i));

   i--;
  }

  if(carry == 1)
  {ans.append('1');}

  return ans.reverse().toString();
 }
}