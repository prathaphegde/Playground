import java.util.*;
class Main
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
      int mid = n/2;
      for(int id1 = 1;id1<mid;id1++)
      {
         int key = list[id1];
         int id2 = id1-1;
         while(id2>=0 && list[id2]>key)
         {
           list[id2 + 1] = list[id2];
            id2--;
         }
         list[id2+ 1] = key;
      }
      for(int i = 0;i<n;i++)
      {
        System.out.print(list[i]+" ");
      }
   }
}