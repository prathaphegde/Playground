import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int mat1[][] = new int[r][c];
    for(int i = 0;i<r;i++)
    {
      for(int j = 0;j<c;j++)
      {
        mat1[i][j] = in.nextInt();
      }
    }
    int mat2[][] = new int[r][c];
    for(int i = 0;i<r;i++)
    {
      for(int j = 0;j<c;j++)
      {
        mat2[i][j] = in.nextInt();
      }
    }
     boolean match = true;
     for(int i = 0;i<r;i++)
     {
       for(int j = 0;j<c;j++)
       {
         if(mat1[i][j]!=mat2[i][j])
         {
           match = false;
         }
            
       }
     }
    if(match == true)
    {
      System.out.print("Yes");
    }
    else
    {
      System.out.print("No");
    }
  }
}