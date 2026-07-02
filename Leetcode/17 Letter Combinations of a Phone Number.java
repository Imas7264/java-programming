import java.util.*;

public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  // int[][] nums = {{1,0,1},{8,8,8},{2,0,3}};
  // int[][] nums = {{1,0,0},{0,0,0},{0,0,1}};
  // int[][] ans = obj.lightsOut(nums);

  // System.out.println(obj.canJump(nums));
  obj.letterCombinations("23");
 }
}



class Solution
{
 static String keypad[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
 List<String> answer = new ArrayList<>();

 public List<String> letterCombinations(String digits)
 {
  if(digits.length() == 0)
  {return answer;}

  goDown(0, digits, new StringBuilder(""));

  System.out.println(answer);
  return answer;
 }

 void goDown(int i, String digits, StringBuilder soFar)
 {
  if(i>=digits.length())
  {answer.add(soFar.toString()); return;}

  String letters = keypad[digits.charAt(i)-'0'];

  for(int j=0; j<letters.length(); j++)
  {
   soFar.append(letters.charAt(j));
   goDown(i+1, digits, soFar);
   soFar.deleteCharAt(soFar.length()-1);
  }
 }
}



// class Solution
// {
//  static String keypad[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//  List<String> answer = new ArrayList<>();

//  public List<String> letterCombinations(String digits)
//  {
//   if(digits.length() == 0)
//   {return answer;}

//   goDown(0, digits, "");
//   System.out.println(answer);
//   return answer;
//  }

//  void goDown(int i, String digits, String soFar)
//  {
//   if(i>=digits.length())
//   {answer.add(soFar); return;}

//   for(int j=0; j<keypad[digits.charAt(i)-'0'].length(); j++)
//   {
//    goDown(i+1, digits, soFar+keypad[digits.charAt(i)-'0'].charAt(j));
//   }
//  }
// }