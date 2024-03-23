package javademo;

import java.util.Scanner;

public class LoopSum {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int m , n ;
		
		System.out.print("ENter first number = ");
		m = input.nextInt();
		
		System.out.print("ENter second number = ");

		n = input.nextInt();
		
		for (int i = m ; i <= n ; i++) {
			
			if(i%2==0) //for even number
			{
				sum = sum+i;
				System.out.println(i);

			}
		}
		System.out.println("sum = " +sum);
	}

}
