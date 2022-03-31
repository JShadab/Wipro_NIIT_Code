package p2;

interface A {

	int i = 10;
	public static final int j = 15;

	void m1();

	public abstract void m2();
	
	// From Java8

	default void m3() {
	}

	default void m4() {
	}

	static void m5() {
	}

	static void m6() {
	}

}