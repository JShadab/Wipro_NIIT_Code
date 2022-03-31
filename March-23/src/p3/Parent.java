package p3;

public class Parent {

	public float foo() {

		System.out.println("Parent#foo");
		return 0;
	}

	protected Animal shad() {

		System.out.println("Parent#shad");
		return null;
	}

	final void hello() {

		System.out.println("Parent#hello");

	}

}
