
public class Main {

	public static void main(String[] args) {

		int i = 10;
		int j = 10;

		boolean b1 = i == j;
		System.out.println(b1); // true

		System.out.println("----------------------------");
		
		Customer c1 = new Customer(1, "Prakhar", "pp@gmail.com");
		Customer c2 = new Customer(2, "Prakhar", "pp@gmail.com");

		boolean b2 = c1 == c2; // it always check their addresses
		System.out.println(b2); // false
		
		boolean b3 = c1.equals(c2); // it always check their content
		System.out.println(b3); // ?
		
		
	}

}
