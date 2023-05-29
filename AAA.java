import java.util.Scanner;

public class AAA {
public static void main(String [] args){
Scanner input = new Scanner(System.in);

System.out.print("enter the firstNumber");
double number1 = input.nextDouble();

System.out.print("enter the secondNumber");
double number2 = input.nextDouble();

double result;
result = number1 + number2;

double result1;
result1 = number1 * number2;

double result2;
result2 = number1 / number2;

System.out.printf("%,.2f%n", result);

System.out.printf("%,.2f%n", result1);

System.out.printf("%,.2f%n", result2);

}


}
