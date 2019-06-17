import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int l = 1;
      for(int i = 1;i<=n;i++)
      {
        for(int k = 1;k<=n-i;k++)
        {
          System.out.print(" ");
        }
        for(int j= 1;j<=i;j++)
        {
          System.out.print( l+" ");
          l++;
        }
        System.out.print("\n");
      }
    }    
}