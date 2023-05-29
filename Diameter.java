import java.util.*;
 
public class Diameter{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("enter the radius of the circle: ");
int radius = input.nextInt();

System.out.printf("Diameter of the circle is %d\n", (2* radius) );
System.out.printf("Circumference of the circle is %.2f\n", (2* (Math.PI) * radius));
System.out.printf("Area of the circle is %f%n", Math.pow(Math.PI), 0.5);

}


}
