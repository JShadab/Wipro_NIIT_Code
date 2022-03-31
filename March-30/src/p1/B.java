package p1;

public class B extends A {

	int i = 10; // member variable
	
	int j = 15;

	public void display() {
		
		String i ="Java"; // local variable

		System.out.println(i); // Java
		
		System.out.println(j); 
		
		System.out.println(this.i); // 10
		
		System.out.println(super.i);  // 2.3

	}
	
	public static void main(String[] args) {
		
		B obj = new B();
		
		obj.display();
	}

}
