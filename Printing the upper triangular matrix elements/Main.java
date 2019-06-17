import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int mat[][] = new int[r][c];
    for(int i = 0;i<r;i++)
    {
      for(int j = 0;j<c;j++)
      {
        mat[i][j] = in.nextInt();
      }
    }
    for(int k = 0;k<r;k++)
    {
      for(int i = 0,j = k; j<r;j++,i++)
      {
        System.out.print(mat[i][j]+" ");
      }
    }
  }
}