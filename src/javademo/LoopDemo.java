package javademo;

public class LoopDemo {
	public static void main(String[] args) {
		
		int m = 1;
		int n = 1;
		
//		for(int i =1 ; i<=10; i++) {
//			System.out.println(i+" Hello, For");
//		}
		
		while(m<=10) {
  		    System.out.println(m+" Hello, while");
  		    m++;
		}
		
		do {
  		    System.out.println(n+" Hello, Do while");
  		    n++;

		}
		while(n<=10);
	}

}
