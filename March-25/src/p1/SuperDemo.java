package p1;

public class SuperDemo {
	public static void main(String[] args) {

		C v1 = new C();

	}

}

class A {
	A() {
		super(); // It will call its Parent class constructor.
		System.out.println("Class A Constructor");
	}

}

class B extends A {
	B() {
		super(); // It will call its Parent class constructor.
		System.out.println("Class B Constructor");
	}

	int x;

}

class C extends B {
	C() {
		super(); // It will call its Parent class constructor.
		System.out.println("Class C Constructor");
	}

}
