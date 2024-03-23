package javademo;

import java.util.Scanner;

public class InputSystem {
	
  public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  int number1 ;
	  
	  
	  
//	  String name = "java basic";
	  String name ;
	  
	  System.out.println("Learn = ");
	  name = input.nextLine();
      System.out.println("Learn = " + name);

	  System.out.print("Enter any number = ");
	  number1 = input.nextInt();
	  
	  System.out.println("Number1 = " +number1);
  }
}
