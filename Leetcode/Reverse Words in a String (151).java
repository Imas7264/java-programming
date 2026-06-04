class Test
{
 public static void main(String args[])
 {
  Solution obj = new Solution();
  int arr[] = {1,1,1,0,0,0,1,1};

  System.out.println(obj.reverseWords("a"));
 }
}


class Solution
{
 public String reverseWords(String s)
 {
  StringBuilder s1 = new StringBuilder("");
  StringBuilder word = new StringBuilder("");
  
  for(int i=s.length()-1; i>-1; i--)
  {
   if(s.charAt(i) == ' ')
   {
    if(word.length()==0)
    {continue;}
    else
    {s1.append(word); s1.append(' '); word.setLength(0);}
   }
   else
   {word.insert(0, s.charAt(i));}
  }

  s1.append(word);

  if(s1.charAt(s1.length()-1) == ' ')
  {s1.deleteCharAt(s1.length()-1);}

  return s1.toString();
 }
}