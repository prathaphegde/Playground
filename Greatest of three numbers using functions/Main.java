import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 =in.nextInt();
       int res = greatest_of_3num(n1,n2);
      int f = greatest_of_3num(res,n3);
      System.out.println(f);      
       }
    public static int  greatest_of_3num(int n1,int n2)
    {
      int greatest;
        int res;
        if(n1>n2)
        {
          greatest = n1;
        }
      else 
        greatest = n2;
      return greatest;
    }
}