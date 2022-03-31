package p1;

public class Student {

	// attribute | properties | fields | states
	private String name;
	private int rollNo;
	private String college;

	// Behavior
	void display() {
		System.out.println("Student having name = " + name + " and rollno = " + rollNo);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

}
