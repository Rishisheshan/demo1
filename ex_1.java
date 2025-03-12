import java.io.*;
import java.util.Scanner;

 public class ex_1
{
public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number n1");
   int a=sc.nextInt();
   System.out.println("Enter the number n2");
   int b=sc.nextInt();

   System.out.println("sum of the two number is");
   System.out.println(a+b);
   System.out.println("Difference of the two number is");
   System.out.println(Math.abs(a-b));
   System.out.println("Product of the two number is");
   System.out.println(a*b);
 }
}