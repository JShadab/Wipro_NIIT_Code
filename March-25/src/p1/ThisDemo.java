package p1;

public class ThisDemo {
	public static void main(String[] args) {

	//	Animal a1 = new Animal();
		 Animal a2 = new Animal(5);
		// Animal a3 = new Animal(5, 10);

	}

}

class Animal {

	Animal() {
		this(9);
		System.out.println("Default Constructor");
	}

	Animal(int x) {
		this(x, 88);
		System.out.println("1 parameter Constructor");
	}

	Animal(int x, int y) {
		System.out.println("2 parameter Constructor");
	}

}
