package maths;

public class Maths {
	public static void main(String[] args) {
		System.out.println(sum(6, 12));
		System.out.println(multiply(6, 12));
		System.out.println(subtract(18, 12));
		divide(6, 10);
		
	}
	private static int sum(int a, int b) {
		return a + b;
	}
	private static int multiply(int c, int d) {
		return c*d;
	}
	private static int subtract(int e, int f) {
		return e-f;
	}
	private static void divide(double g, double h) {
		
		if(g<=h) {
			double answer=g/h;
			System.out.println(answer);
			
		}
		else {
			System.out.println("This division cannot be performed.");
		}
	
	}
	
}
