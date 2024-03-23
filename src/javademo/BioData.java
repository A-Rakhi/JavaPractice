package javademo;

public class BioData {
	
	public static void main(String [] args) {
		
		boolean b ;
		int i ;
		char c = 'a' ;
		float f = 10.52f;

		b = true;
		i = 19 ;
		
		System.out.println("Hello Word \t Java");
		
		System.out.println("BOOLEAN b = " +b);
		System.out.printf("boolean b = %b\n", b);
		System.out.println("i = " +i);
		System.out.println("f = " +f);
		System.out.printf("f = %.1f\n" , f); //format specifier
		System.out.println("character c = " +c);
	}

}
