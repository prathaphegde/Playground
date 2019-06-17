import java.util.Scanner;
class Main
{
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int list[] = new int[n];
for(int i = 0;i<=n-1;i++)
{
list[i] = in.nextInt();
}
int key = in.nextInt();
for(int i =0;i<=n-1;i++)
{
for(int j = i+1;j<=n-1;j++)
{
if(list[i] + list[j] == key)
{
System.out.println(list[i] +", "+list[j]);
}
}
}

}
}