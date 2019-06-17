import java.util.Scanner;
class Main
{
    public static int square(int num)
    {
      int squ;
      squ = num*num;
      return squ;
    }
	public static void main (String[] args)
    {
	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = square(n);
      n = k;
      System.out.print(n);
	} 
}