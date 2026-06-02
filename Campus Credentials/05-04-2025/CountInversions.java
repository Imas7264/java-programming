/*
An inversion in an array is a pair of indices (i, j) such that i < j and arr[i] > arr[j]. Your task is to count the total number of inversions in the array.

Input: 5
  [2 4 1 3 5]

Output: 3
*/


import java.util.Scanner;

public class CountInversions
{
 // Your code will go below this line 
 public static int countInversions(int arr[], int n)
 {
  int inversions = 0;
  for(int i=0; i<n; i++)
  {
   for(int j=i; j<n; j++)
   {
     if(arr[i]>arr[j])
     {inversions++;}
   }
  }
  return inversions;
 }
 // Your code will go above this line 
  

 public static void main(String[] args)
 {
  Scanner scanner = new Scanner(System.in);
  int n = scanner.nextInt();
  scanner.nextLine();  
  String input = scanner.nextLine().trim();
  input = input.substring(1, input.length() - 1).trim(); 
  
  if (input.isEmpty())
  {System.out.println(0); return;}

  String[] inputArr = input.split("\\s+"); 
  int[] arr = new int[n];
  for (int i = 0; i < n; i++)
  {arr[i] = Integer.parseInt(inputArr[i]);}
  
  int result = countInversions(arr, n);
  System.out.println(result);
 }
}