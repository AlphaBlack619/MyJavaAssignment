import java.util.Scanner;

public class Kata {

  public static void main(String [] args) {
  
  Scanner input = new Scanner(System.in);
   
  System.out.print("Hi What Your Name? ");
  String name = input.next();
  
  System.out.print("May We Please Know Your Age? ");
  int Age = input.nextInt(); 
  
  if (Age <= 17) {
  System.out.printf("Sorry %s Web Content Not For Viewers Below The Age of 18%n", name);
  }
  
  if (Age >= 18) {
  System.out.printf("Dear %s Welcome To BlackWeb! Here We Take You To Hidden The Pleasures Of Life...%n", name);
  }
  
  }

}
