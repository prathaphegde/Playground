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
      int sum = 0;
      int next = 0; 
    int div = n/2;
      for(int j = 0;j<=n-1;j++)
      {
         
        if(j<=div)
        {
          sum = sum +list[j];
        }
        if(j>=div)
        {
          next = next + list[j];
        }
           
      }
    if( sum == next)
    {
      System.out.print("Perfect Batch");
      //System.out.println(sum);
      //System.out.println(next);

    }
    else
      System.out.print("Not a Perfect Batch");
      
        
  }
}