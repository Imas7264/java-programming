public class Test3
{
 public static void main(String[] args)
 {
  Solution obj = new Solution();
  int nums[] = {3,0,6,1,5};

  System.out.println(obj.hIndex(nums));
 }
}



class Solution
{
 public int hIndex(int[] citations)
 {
  int cited[] = new int[citations.length + 1];

  for(int i=0; i<citations.length; i++)
  {
   if(citations[i] >= citations.length)
   {cited[citations.length]++;}
   else
   {cited[citations[i]]++;}
  }

  for(int i=cited.length-1; i>0; i--)
  {
   if(cited[i]>=i)
   {return i;}
   else
   {cited[i-1] += cited[i];}
  }

  return 0;
 }
}




// class Solution
// {
//  public int hIndex(int[] citations)
//  {
//   int papers, cited=0;

//   for(int i=citations.length; i>0; i--)
//   {
//    papers = i;

//    for(int j=0; j<citations.length && cited<papers; j++)
//    {
//     if(citations[j] >= papers)
//     {cited++;}
//    }

//    if(cited>=papers)
//    {return papers;}

//    cited=0;
//   }

//   return 0;
//  }
// }