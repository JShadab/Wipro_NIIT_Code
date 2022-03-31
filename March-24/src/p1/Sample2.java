package p1;

public class Sample2 extends Abc {
	
	@Override
	void m1() {
		System.out.println("m1() of class Sample2");
	}
	
	//Final method cannot be overridden.
	@Override
	void m2() {
		System.out.println("m2() of class Sample2");
	}
	

}
