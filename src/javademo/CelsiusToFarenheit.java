package javademo;

import java.util.Scanner;

public class CelsiusToFarenheit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double cels , result;
		
		System.out.print("Enter celsius : ");
		cels = input.nextDouble();
		
		result = 1.8 * cels + 32;
		
		System.out.print("Farenheit = " +result);

		
	}
}
