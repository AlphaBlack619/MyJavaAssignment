import java.util.Scanner;

public class LL2 {
 public static void main(String [] args ){
 
 Scanner scan = new Scanner(System.in);
 
 System.out.print("enter number1: ");
 int num1 = scan.nextInt();
 
 System.out.print("enter number2: ");
 int num2 = scan.nextInt();
 
 System.out.print("enter number3");
 int num3 = scan.nextInt();
 
 int result1 = num1 + num2 + num3;
 int result2 = num1 - num2 - num3;
 int result3 = num1 * num2 * num3;
 
 System.out.printf("%d%n%d%n%d%n", result1, result2, result3);
 
 }

}
