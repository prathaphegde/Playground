import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = 1;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
               System.out.print(t);
            }
            t++;
          System.out.print("\n");
        }
	}
}