import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int list[] = new int[n];
     for(int i = 0;i<n;i++)
     {
       list[i] =in.nextInt();
     }
     for(int i = 0;i<n;i++)
     {
       for(int j = i;j<n;j++)
       {
         if(list[j]>list[i])
         {
           System.out.println(list[i]+","+list[j]);
         }
       }
     }
  }
}