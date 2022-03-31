package p2;

public class Person {
	private String name;

	void sleep() {
		System.out.println("Person sleep()");
	}

	void eat() {
		System.out.println("Person eat()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}