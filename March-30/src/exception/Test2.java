package exception;

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println("Before Main");

		f1();
		System.out.println("After Main");
	}

	private static void f1() {
		
		System.out.println("Before F1");

		int a = 10;
		int b = 0;

		int c = a / b;

		System.out.println("Result = " + c);
		
		System.out.println("After F1");

	}

}
