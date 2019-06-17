import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int list[] = new int[n];
      for(int i = 0;i<n;i++)
      {
        list[i] = in.nextInt();
      }
      int match = 0;
      int head = 0;
      int tail = n-1;
        for(int i = 0;i<1;i++)
        {
          while(head < tail)
          {
            if(list[head] != list[tail])
            {
              match = 1;
              break;
            }
            else
              head++;
              tail --;
          }
        }
      if(match == 0)
      {
        System.out.print("Yes");
      }
      else
        System.out.print("No");
    }
}