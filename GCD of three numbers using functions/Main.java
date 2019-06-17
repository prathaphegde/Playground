import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
      int res = gcd(n1,n2);
      int fres = gcd(res,n3);
      System.out.println(fres);
	}
  public static int gcd(int n1,int n2)
  {
    int min;
    int op;
    if(n1>n2)
    {
      min = n2;
    }
    else
    min = n1;
    if(n1%min == 0 && n2%min == 0)
    {
      op = min;
    }
    else
    min--;
    return min;
  }
}