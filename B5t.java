import java.util.Scanner;

public class B5t{
public static void main(String [] args){
Scanner input = new Scanner(System.in);

System.out.print("enter firstNumber");
int firstNumber = input.nextInt();

System.out.print("enter secondNumber");
int secondNumber = input.nextInt();

int additionResult = firstNumber + secondNumber;
System.out.printf("Sum = %d%n", additionResult);
System.out.println("Will you like to try some multipication?");

int multiplicationResult = firstNumber * secondNumber;
System.out.printf("Sum = %d%n", multiplicationResult);

}

}
