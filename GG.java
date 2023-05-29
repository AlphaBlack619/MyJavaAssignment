// Arithmetic expression in straight line form
 import java.util.Scanner;
 
 public class GG {
 public static void main(String [] args){
 
 Scanner input = new Scanner(System.in);
 
 System.out.println("enter number1: ");
 int x = input.nextInt();
 
 System.out.println("enter number2: ");
 int y = input.nextInt();
 
 System.out.println("enter number3: ");
 int z = input.nextInt();
 
 int result1 = x * (y + z);
 int result2 = ( (x + y) * z);
 System.out.printf("%d%n%d", result2, result1);
 
 }
 
 }
