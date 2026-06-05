import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  char letters[] = {'c', 'f', 'j'};

  System.out.println(obj.nextGreatestLetter(letters, 'j'));
 }
}




class Solution
{
 public char nextGreatestLetter(char[] letters, char target)
 {
  char temp = letters[0];
  int i = 1;
  while((temp <= target) && (i < letters.length))
  {temp = letters[i]; i++;}

  if((i == letters.length) && (temp <= target))
  {return letters[0];}

  return temp;
 }
}