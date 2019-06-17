import java.util.*;
class Main
{
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int list[] = new int[n];
     for(int i = 0; i< n;i++)
     {
       list[i] = in.nextInt();
     }
     int mid = n/2;
     for(int idx1 = 1;idx1 < n;idx1++)
     {
           int key = list[ idx1];
          int idx2 = idx1 -1;
        if( idx1< mid)
        {
          while(idx2>=0 && list[idx2]> key)
          {
            list[idx2 + 1] = list[idx2];
            idx2--;
          }
          list[idx2+1] = key;
        }
       else if(idx1>= mid)
       {
         while(idx2>=mid && list[idx2]< key)
          {
            list[idx2 + 1] = list[idx2];
            idx2--;
          }
          list[idx2+1] = key;
       }
     }
     for(int i = 0;i<n;i++)
     {
       System.out.print(list[i]+" ");
     }
   }
}