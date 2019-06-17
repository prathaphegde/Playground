import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int list[] = new int[n];
        for(int i = 0;i<=n-1;i++)
        {
          list[i] = in.nextInt();
        }
      sorting(n, list);
       for(int i = 0;i<=n-1;i++)
       {
         System.out.print(list[i]+" ");
       }
    }
    public static void sorting(int n, int list[])
    {
      int count = 0;
      int temp = 0;
      for(int j = 0;j<=n-1;j++)
      {
        if(list[j] !=0)
        {
          temp = list[j];
          list[j] = list[count];
          list[count] = temp;
          count++;
        }
      }
    }
}