import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String s1 = in.nextLine();
    int len_s1 = s1.length();
    String s2 = in.nextLine();
    int len_s2 = s2.length();
    int count = 0;
     for(int i =0;i<(len_s1-len_s2+1);i++)
     {
       int match = -1;
       for(int j =0;j<=len_s2-1;j++)
       {
          if(s1.charAt(i+j)==s2.charAt(j))
          {
            match = 0;
          }
       }
       if(match==0)
       {
         count++;
       }
       
       
     }
    System.out.println(count);
  } 
}