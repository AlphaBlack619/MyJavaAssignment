import java.util.Scanner;

public class Ba2{
public static void main(String [] args) {
Scanner input = new Scanner(System.in);

System.out.print("enter firstNumber");
int firstNumber = input.nextInt();

System.out.print("enter secondNumber");
int secondNumber = input.nextInt();

int sum = firstNumber + secondNumber;
System.out.printf("sum is %d%n", sum);
System.out.println("Thanks for using our calculator");

}

}
