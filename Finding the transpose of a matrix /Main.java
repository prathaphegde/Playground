import java.util.Scanner;
class Main{
  public static void main(String args[]){
     Scanner in = new Scanner(System.in);
     int row = in.nextInt();
     int col = in.nextInt();
     int m1[][] = new int[row][col];
    for(int i = 0;i<row;i++)
    {
      for(int j = 0;j<col;j++)
      {
        m1[i][j] = in.nextInt();
      }
    }
     int trans[][] = new int[col][row];
     for(int i = 0; i< row; i++)
     {
       for(int j = 0; j<col; j++)
       {
         trans[j][i] = m1[i][j];
       }
     }
     for(int i = 0;i<col;i++)
     {
       for(int j = 0;j<row;j++)
       {
         System.out.print(trans[i][j]+" ");
       }
       System.out.print("\n");
     }
  }
}