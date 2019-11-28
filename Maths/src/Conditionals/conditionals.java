package Conditionals;

public class conditionals {

	public static void main(String[] args) {
	addOrMultiply(6,7,true);
	}
	private static void addOrMultiply(int a, int b, boolean c) {
		if(c==true) {
			System.out.println(a+b);
		}
		else {
			System.out.println(a*b);
		}
	}
}
