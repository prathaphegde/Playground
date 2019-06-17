//import required packages
import java.util.*;
class Faculty
{
  public int baseSalary;
  public void salary(int baseSalary)
  {
      this.baseSalary = baseSalary;
    //write your Faculty class statements
     System.out.println("Base Salary:" +" "+ baseSalary);
  }
}
class CSE extends Faculty
{
  public void salary(int baseSalary)
  {
    //write your CSE class statement
    this.baseSalary = baseSalary;
    
    System.out.println("CSE Faculty:" +" "+(baseSalary + 3000));
  }
}
class IT extends Faculty
{
  public void salary(int baseSalary)
  {
    //write your IT class statements
    System.out.println("IT Faculty:" +" "+(baseSalary  + 5000));
  }
}
class ECE extends Faculty
{
  public void salary(int baseSalary)
  {
    //write your ECE class statements
    System.out.println("ECE Faculty:" +" "+( baseSalary + 4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
      Scanner in = new Scanner(System.in);
    int baseSalary = in.nextInt();
    if(baseSalary>0)
    {   
    Faculty obj = new Faculty();
    CSE obj1 = new CSE();
    IT obj2 = new IT();
    ECE obj3 = new ECE();
    obj.salary(baseSalary);
    //implement your required concept here
    obj1.salary(baseSalary);
    obj2.salary(baseSalary);
    obj3.salary(baseSalary);
    }
    else 
       System.out.println("null");
  }
}