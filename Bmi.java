import java.util.Scanner;

public class Bmi {
   public static void main(String [] args);
   
   Scanner input = new Scanner(System.in);
   
 System.out.println("input weight in pounds ");
 double weight = input.nextDouble();
 
 System.out.println("input height in inches ");
 double height = input.nextDouble();
 
 double Bmi = (weight * 70) / (height * height);
 
 System.out.print("Your National Heart Lung and Blood Institute (BMI) is " + Bmi + "kg/m2" );


}
