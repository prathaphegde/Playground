import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      int list[] = new int[n];
      for(int i = 0;i<n;i++)
      {
        list[i] = in.nextInt(); 
      }
      int count = 0;
      int num = 1;
      for(int i = 0;i<n;i++)
      {
        if(list[i] !=num)
        {
          break;
        } 
        else
        {
          count++;
        }
      }
      System.out.println(count);
    }

}
         
          
          
        
      