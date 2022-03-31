package exception;

public class Test4 {

	public static void main(String[] args) {

		System.out.println("Before Main");

		f1();
		System.out.println("After Main");
	}

	private static void f1() {

		System.out.println("Before F1");

		int a = 10;
		int b = 0;

		try {
			System.out.println("TRY BLOCK");

			int c = a / b;
			System.out.println("Result = " + c);
			
		} catch (Exception e) {
			System.out.println("CATCH BLOCK");
		} finally {
			System.out.println("FINALLY BLOCK");
		}

		System.out.println("After F1");

	}

}
