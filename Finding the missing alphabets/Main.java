import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      String s1 = in.nextLine();
      StringBuilder sb = new StringBuilder(s1);
      int len = s1.length();
      int list[] = new int[26];
      int k[] = new int[26];
        for(int i = 0;i<len;i++)
        {
          if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
          {
            int off = (s1.charAt(i) - 'A');
            char ch = (char)(off + 'a');
            sb.setCharAt(i,ch);
            int index = sb.charAt(i) - 'a';
            list[index]++;
            
          }
          else if(sb.charAt(i)>='a' && sb.charAt(i)<='z')
          {
            int index = s1.charAt(i) - 'a';
            list[index]++;
          }
        }
       for(int i = 0;i<26;i++)
       {
         if(list[i]==0)
         {
           char temp = (char)(i+ 'a');
           System.out.print(temp+" ");
         }
       }
       
      
    }
}