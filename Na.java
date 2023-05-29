import java.util.Scanner;

public class Na{
public static void main(String [] args){
 Scanner input = new Scanner(System.in);
 
 System.out.print("enter firstNumber1:");
 int firstNumber = input.nextInt();
 
 System.out.print("enter the secondNumber:");
 int secondNumber = input.nextInt();
 
 int sum = firstNumber + secondNumber;
 
 System.out.printf("Sum is %d%n", sum);
 System.out.println("Thanks for using our calculator");
}

}
