import java.util.Scanner;

public class Aa1{
public static void main(String [] args) {

Scanner input = new Scanner (System.in);

System.out.print("Enter firstNumber: ");
 int firstNumber = input.nextInt();
 
System.out.print("Enter secondNumber: ");
int secondNumber = input.nextInt();

int sum = firstNumber + secondNumber;
sum+= firstNumber;
sum*= secondNumber;
sum-= firstNumber;
sum/= secondNumber;
sum%= firstNumber;
System.out.printf("the sum of the expresion is %d%n", sum);
firstNumber++;
++firstNumber;
System.out.printf("the sum of the expresion is %d%n", firstNumber);

int c = 5;
System.out.printf("c before postincrement: %d%n", c); // prints 5
System.out.printf("postincrementing c: %d%n", c++); // prints 5
System.out.printf(" c after postincrement: %d%n", c); // prints 6 
System.out.println(); // skip a line
// demonstrate prefix increment operator
c = 5;
System.out.printf(" c before preincrement: %d%n", c); // prints 5
System.out.printf("preincrementing c: %d%n", ++c); // prints 6
System.out.printf(" c after preincrement: %d%n", c); // prints 6

}

}
// if 1st num is 2 and 2nd num is 3 expression is 0, anytime the 1st num is higher than 2nd num the ans is 0; reverse is 2
