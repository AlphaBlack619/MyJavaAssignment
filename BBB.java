import java.util.Scanner;

public class BBB {
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("enter number1: ");
int num1 = input.nextInt();

System.out.print("enter number2: ");
int num2 = input.nextInt();

System.out.print("enter number3: ");
int num3 = input.nextInt();

int sum = num1 * num2 * num3;
System.out.print(sum);

}


}
