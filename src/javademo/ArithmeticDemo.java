package javademo;

import java.util.Scanner;

public class ArithmeticDemo {
  public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  
	  int num1 , num2 , res ;
	  
//	  int num1 = 55;
//	  int num2 = 20;
//	  int res ; 

	  System.out.print("Enter First Num = ");
	  num1 = input.nextInt();
	  System.out.print("Enter Second Num = ");
	  num2 = input.nextInt();
	  
	  res = num1 + num2;
	  System.out.println("Sum = "+res);
	  
	  res = num1 - num2;
	  System.out.println("Sub = "+res);
	  res = num1 * num2;
	  System.out.println("Multi = "+res);
	  res = num1 / num2;
	  System.out.println("Div = "+res);
	  res = num1 % num2;
	  System.out.println("Remainder = " +res);
	  
	  //AssignmentOperator
	  
	  int x = 8;
	  int y = 6;
	  
	  x+=y; // x =x+y = 11
	  System.out.println("x = " +x);
	  
	  x-=y; // x =x-y = 11
	  System.out.println("x = " +x);
	  x*=y; // x =x*y = 48
	  System.out.println("x = " +x);
	  x/=y; // x =x+y = 8
	  System.out.println("x = " +x);
	  x%=y; // x =x+y = 2
	  System.out.println("x = " +x);

  }
}
