package p1;

public class Test {
	public static void main(String[] args) {

		Student s1 = new GraduateStudent();
		s1.setName("Pooja");
		s1.setRollNo(101);
		s1.setCollege("IIT");

		Student s2 = new PostGraduateStudent();
		s2.setName("Raj");
		s2.setRollNo(103);
		s2.setCollege("IIT");

		s1.display(); // 
		s2.display();

	}

}
