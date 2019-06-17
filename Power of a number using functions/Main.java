import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int expo = in.nextInt();
    pow(base,expo);
  }
  public static void pow(int base, int expo)
  {
    int sum = 1;
    while(expo!=0)
    {
      sum = sum*base;
        expo--;
    }
    System.out.print(sum);
  }
}
    