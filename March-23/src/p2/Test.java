package p2;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee();

		e1.doWork(); // OK of Employee class
		e1.eat(); // OK of Person class
		e1.sleep(); // OK of Employee class
	}

}
