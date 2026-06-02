/*
Given a string s, count the number of substrings where all characters are the same.
Input: aaabb
Output: 9
*/ 


import java.util.*;

public class Main
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  String s1 = sc.nextLine();
 
  int count =0, n=s1.length();
  
  for(int i=0; i<n; i++)
  {
    char a = s1.charAt(i);
    String s2 = ""+a;
    for(int j=i; j<n; j++)
    {
     if(a == s1.charAt(j))
     {count++;}
     else
     {break;}
    }
  }

  System.out.println(count);    
 }
}