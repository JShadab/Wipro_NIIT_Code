package p2;

public class Employee extends Person {
	private int empId;

	void doWork() {
		System.out.println("Employee doWork()");
	}

	void sleep() {
		System.out.println("Employee sleep()");
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

}