import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int i = 0;i<=arr_size-1;i++)
        {
            arr[i] = in.nextInt();
        }
       int key1 = in.nextInt();
       int key2 = in.nextInt();
       int found1 = -1;
      int found2 = -1;
      for(int j = 0;j<=arr_size-1;j++)
      {
          if(arr[j]==key1)
          {
            found1 = j;
          }
       
       if(arr[j]==key2)
           {
             found2 = j;
           }  
      }
       System.out.println(found1);
        System.out.println(found2);
    }
}