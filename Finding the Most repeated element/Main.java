import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int i = 0;i<n;i++)
    {
      list[i] = in.nextInt();
    }
    int key = 9;
   
    int num = 0;
    int max = 0;
    for(int i = 0;i<=key;i++)
    {
       int count = 0;
     for(int j = 0;j<n;j++)
     {
       if(list[j] == i)
       {
         count++;
       }
       if(count>max)
       {
         num = list[j];  
       } 
     }
         
    }
    if(num != 0)
    {
    System.out.print(num);
    }
    else
        System.out.print(list[num]);
  }
}