package javademo;

import java.util.Scanner;

public class ControlStatement {
	public static void main(String[] agrs) 
	{
		Scanner input = new Scanner(System.in);
		
//		int age ;
//		
//		System.out.print("ENter age = ");
//		age = input.nextInt();
//		
//		if(age>= 18) {
//			System.out.println("Valid Voter");
//		}
//		else {
//			System.out.println("Invalid Voter");
//		}
		
        int num ;
		
		System.out.print("ENter num = ");
		num = input.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Num is even");
		}
		else {
			System.out.println("Num is odd");
		}
		
	}

}
