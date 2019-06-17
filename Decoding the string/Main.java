import java.util.Scanner;
class Main{
  public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
       String s1 = in.nextLine();
       int key = in.nextInt();
       int len = s1.length();
      StringBuilder sb = new StringBuilder(s1);
        //sb.setlength(0);
     for(int i = 0;i<len;i++)
     {
       char ch = s1.charAt(i);
       if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
       {
          
           ch = (char)(ch - key);
           if(ch<'A')
           {
             ch =(char)(ch+26);
             
             
           }
          }
        else if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
           {
                ch = s1.charAt(i);
             ch = (char)(ch -key);
             if(ch<'a')
             {
               ch = (char)(ch+26);
                
             }
           }
         sb.setCharAt(i,ch);
           
       }
     
    System.out.print(sb);
  }
}