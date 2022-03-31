package wrapper;

public class Sample2 {

	public static void main(String[] args) {

		// convert number to String

		int x = 10;
		String str1 = x + "";
		// OR
		String str2 = String.valueOf(x);

		// convert a String int a number

		String str = "Abc";

		int y = Integer.parseInt(str);
		System.out.println(y);
		
		double z = Double.parseDouble(str);
		System.out.println(z);

	}

}
