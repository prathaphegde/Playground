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
        int  grt = arr[0];
        for(int j = 0;j<=arr_size-1;j++)
        {
          if(grt<arr[j])
          {
            grt = arr[j];
          }
        }
      System.out.println(grt);
    }
}