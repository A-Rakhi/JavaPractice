package javademo;

public class IncrementDecrement {
	public static void main(String[] args) {
		
		int x= 20;
		int y ;
		
		y = ++x ; //pre increment
		System.out.println(" pre increment y = " +y);
		
		y = x++ ; //post increment
		System.out.println("post increment y = " +y);
		
		y = x ;
		System.out.println("post increment y = " +y);
		
		y = --x ; //pre decrement
		System.out.println("pre decrement y = " +y);
		
		y = x-- ; //post decrement
		System.out.println("post decrement y = " +y);
		
		y = x ;
		System.out.println("post decrement y = " +y);
			
	}

}
