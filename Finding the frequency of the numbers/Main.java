import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int k = in.nextInt();
         int list[] = new int[n];
      for(int i = 0;i<n;i++)
      {
        list[i] = in.nextInt();
      }
       for(int i = 1;i<=k;i++)
       {
           int count = 0;
         int freq = fcount(count,i,n,list);
          System.out.println(i +" "+(freq));
       }
    }
      public static int fcount(int count, int i, int n,int list[])
      {
        for(int j = 0;j<n;j++)
        {
          if(i== list[j])
          {
            count++;
          }
        }
       
        return count;
      }
    }
