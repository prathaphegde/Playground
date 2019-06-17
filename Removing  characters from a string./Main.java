import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
      String s1 = in.nextLine();
    String s2 = in.nextLine();
    StringBuilder sb1 = new StringBuilder(s1);
    StringBuilder sb2 = new StringBuilder(s2);
    int len1 = sb1.length();
    int len2 = sb2.length();
   for(int i = 0;i<len2;i++)
   {
     for(int j = 0;j<len1;j++)
     {
       if(sb2.charAt(i)==sb1.charAt(j))
       {
         for(int k = j;k<len1-1;k++)
         {
           sb1.setCharAt(k,sb1.charAt(k+1)); 
         }
         len1--;
       }
        
     }
   }
    String ch = sb1.substring(0,len1);
    System.out.print(ch);
  }
}
    