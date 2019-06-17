import java.util.Scanner;
class Main{
  public static int fun(int num)
  {
     int sum = 0;
    for(int i =1;i<=num;i++)
    {
      sum = sum +i;
    }
    return sum;
  }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int k = fun(n);
       n = k;
      System.out.print(k);
	}
}