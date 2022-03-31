package p1;

public class Student {

	private String name;

	private int rollNumber;
	private Class clazz;
	
	private int[] marks;
	
	public Student() {
		setMarks(new int[3]);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Class getCourse() {
		return clazz;
	}

	public void setCourse(Class course) {
		this.clazz = course;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
}
