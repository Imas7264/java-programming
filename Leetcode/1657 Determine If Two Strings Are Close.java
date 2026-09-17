import java.util.*;

class Test2
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int arr[] = {73,74,75,71,69,72,76,73};
  
  // for(int i: obj.dailyTemperatures(arr))
  // {System.out.print(i+" ");}

  System.out.println(obj.closeStrings("abc", "bac"));
 }
}



class Solution
{
 public boolean closeStrings(String word1, String word2)
 {
  int n = word1.length(), m = word2.length();

  if(n != m)
  {return false;}

  int freq1[] = new int[26];
  int freq2[] = new int[26];

  for(int i=0; i<n; i++)
  {freq1[word1.charAt(i) - 'a']++; freq2[word2.charAt(i) - 'a']++;}

  for(int i=0; i<26; i++)
  {
   if((freq1[i]>0 && freq2[i]==0) || (freq2[i]>0 && freq1[i]==0))
   {return false;}
  }

  selectionSort(freq1);
  selectionSort(freq2);

  for(int i=0; i<26; i++)
  {
   if(freq1[i] != freq2[i])
   {return false;}
  }

  return true;
 }

 void selectionSort(int[] freq)
 {
  for(int i=0; i<freq.length; i++)
  {
   int max=i;
   for(int j=i+1; j<freq.length; j++)
   {
    if(freq[max]<freq[j])
    {max = j;}
   }

   int temp = freq[i];
   freq[i] = freq[max];
   freq[max] = temp;
  }

  // for(int i: freq)
  // {System.out.print(i+" ");}
 }
}