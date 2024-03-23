package javademo;

import java.util.Scanner;

public class FahrenheitToCelsius {
  
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		double fahren , result;
		
		System.out.print("Enter fahrenheit = ");
		fahren = input.nextDouble();
		
		result =   (fahren - 32) * 5 / 9 ;
		System.out.println("Fahrenheit to Celsius = " + result);
	}
}
