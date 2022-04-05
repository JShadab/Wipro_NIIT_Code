package custom_sorting;

public class Employee implements Comparable<Employee> {

	private int age;
	private String name;
	private double salary;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e2) {

		String name1 = this.getName();
		String name2 = e2.getName();

		return name1.compareTo(name2);
	}

}
