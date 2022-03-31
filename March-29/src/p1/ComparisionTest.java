package p1;

public class ComparisionTest {

	public static void main(String[] args) {
		/************************* numeric comparison ***************************/

		int x = 10;
		int y = 15;

		boolean b1 = x > y;

		/************************* String comparison ***************************/

		String s1 = "Java";
		String s2 = "Python";

		int result1 = s1.compareTo(s2); // if +ve then s1 > s2. If -ve then s1 < s2 and If zero thats means equals
		System.out.println("String Comparison: " + result1);
		/************************* Employee comparison ***************************/

		Employee e1 = new Employee();
		e1.setAge(24);
		e1.setName("Pannu");
		e1.setSalary(1234);

		Employee e2 = new Employee();
		e2.setAge(27);
		e2.setName("Sai Teja");
		e2.setSalary(876);

		// boolean b2 = e1 > e2; //C.E

		int result2 = e1.compareTo(e2);
		System.out.println("Employee Comparison: " + result2);

	}

}
