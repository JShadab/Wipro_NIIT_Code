package p3;

public class Child extends Parent {

	@Override
	public float foo() {
		System.out.println("Child#foo");
		return 0;
	}

	@Override
	protected Cow shad() {
		System.out.println("Child#shad");
		return null;
	}
	
	@Override
	final void hello() {

		System.out.println("Parent#hello");

	}
	
}
