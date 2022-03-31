package p1;

public class UncheckedDemo {

	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		int a = 10;
		int b = 0;

		// 0% chance for ArithmeticException
		if (b != 0) {
			int c = a / b;
			System.out.println(c);
		}

		// -------------------------------
		String s1 = "Java";
		System.out.println(s1.length()); // 4

		String s2 = null;
		// 0% NullPointerException
		if (s2 != null) {
			System.out.println(s2.length());
		}

		// -------------------------------

		int[] arr = { 6, 9, 8, 6 };
		System.out.println(arr.length);

		int i = 10;
		// 0% ArrayIndexOutOfBoundsException
		if (i >= 0 && i < arr.length) {
			System.out.println(arr[i]);
		}

	}

}
