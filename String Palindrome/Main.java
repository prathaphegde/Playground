import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
          String s1 = in.nextLine();
          int len =s1.length();
          int head = 0;
          int tail =len-1;
          int match = -1;
          while(head<tail)
          {
            if(s1.charAt(head) == s1.charAt(tail))
            {
              head++;
                tail--;
               match = 1;
            }
            else
            {
             match = 0;
              break;
            }
         }
          if(match==1)
          {
          System.out.println("Yes");
          }
           else if(match ==0)
           {
            System.out.println("No");
          }
    }
            
}