import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int i = 0;i<=n-1;i++)
    {
        list[i] = in.nextInt();
    }
    int gt = list[0];
    int id = 0;
    for(int j = 0;j<=n-1;j++)
    {
        if(gt<list[j])
        {
          gt = list[j];
          id = j;
        }
    }
    System.out.println(id);
  }
}