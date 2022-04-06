package p1;

public class Mummy {

	void m1(int x) {
	}

	void m2(String y) {
	}

	void m3(Runnable run) {
	}

	public static void main(String[] args) {

		Mummy mummy = new Mummy();

		mummy.m1(99);

		mummy.m2("Java");

		// Creating an object for anonymous class
		Runnable runnable1 = new Runnable() {

			@Override
			public void run() {

				System.out.println("I am Anonymous Class object");

			}
		};

		Runnable runnable2 = () -> {
			System.out.println("I am Anonymous function i.e Lambda");
		};

		mummy.m3(runnable1);
		mummy.m3(runnable2);

	}

}
