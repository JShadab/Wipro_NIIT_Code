package p1;

public class Employee implements Comparable<Employee> {

	private String name;
	private int age;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee e) {

		Employee e1 = this;
		Employee e2 = e;
		// return (e1.getAge() - e2.getAge());
		// return e1.getName().compareTo(e2.getName());

		double sal1 = e1.getSalary();
		double sal2 = e2.getSalary();

		if (sal1 > sal2) {
			return 1;
		} else if (sal1 < sal2) {
			return -1;
		} else {
			return 0;
		}
	}

}
