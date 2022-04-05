package custom_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortDemo2 {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setAge(23);
		e1.setName("Kajal");
		e1.setSalary(1234);

		Employee e2 = new Employee();
		e2.setAge(21);
		e2.setName("Jayasree");
		e2.setSalary(3425);

		Employee e3 = new Employee();
		e3.setAge(24);
		e3.setName("Raj");
		e3.setSalary(897);

		List<Employee> empList = new ArrayList<>();

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);

		System.out.println("Before Sorting List: " + empList);

		Collections.sort(empList);

		System.out.println("After Sorting List: " + empList);

	}

}
