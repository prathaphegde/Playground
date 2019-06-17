import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int list[] = new int[n];
      for(int i = 0;i<n;i++)
      {
        list[i] = in.nextInt();
      }
      int key = in.nextInt();
      
      for(int i = 0;i<n;i++)
      {
        int index = i;
        for(int j = i+1;j<n;j++)
        {
          if(list[index]<list[j])
          {
            index = j;
          }
        }
        int smallest = list[index];
        list[index] = list[i];
        list[i] = smallest;
      }
      System.out.print(list[key-1]);
      
      
    }   
}