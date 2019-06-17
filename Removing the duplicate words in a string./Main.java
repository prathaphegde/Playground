import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String s1 = in.nextLine();
    String word[] = s1.split(" ");
    for(int i = 0;i<word.length;i++)
    {
        if(word[i]!= null)
        {
          for(int j = i+1;j<word.length;j++)
          {
             if(word[i].equals(word[j]))
             {
                word[j] = null;
             }
          }
        }
    }
     for(int j = 0;j<word.length;j++)
     {
        if(word[j]!=null){
       System.out.print(word[j]+" ");
        }
     }
  }
}