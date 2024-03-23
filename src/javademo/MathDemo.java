package javademo;

public class MathDemo {
	
	public static void main(String[] args)
	{
		int x = 40;
		int y = 10;
		int  n = -30;
		
		int maximum = Math.max(x, y);
		System.out.println("maximum = " +maximum);
		
		int absolute = Math.abs(n);
		System.out.println("absolute = " +absolute);
		
		double power = Math.pow(x, y);
		System.out.println("power = " +power);
		
		int round = Math.round(5.7f);
		System.out.println("round = " +round);
	
		double Pi = Math.PI;
		System.out.println("pi = " +Pi);
	}

}
