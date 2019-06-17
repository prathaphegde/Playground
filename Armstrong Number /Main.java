import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
        
         int  temp = n;
         int copy = n;
         int sum = 0;
          int count = 0;
      int rem = 0;
         while(n!=0)
         {
            rem  = n%10;
           count++;
            n = n/10;
         }
        while(temp!=0)
        {
            rem = temp%10;
            int count2 = 0;
          int expo = 1;
            int base = rem;
           
            while(count>count2)
            {
               expo = base * expo;
               count2++;
            }
            sum = sum+ expo;
           temp = temp/10;
        }
       if(sum == copy)
       {
          System.out.println("Armstrong Number");
       }
      else
      {
         System.out.println("Not a Armstrong Number");
      }
	}
}