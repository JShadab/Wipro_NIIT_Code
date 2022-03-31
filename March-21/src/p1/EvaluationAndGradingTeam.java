package p1;

public class EvaluationAndGradingTeam {

	int calculateTotalMarks(Student student) {

		int[] marks = student.getMarks();
		int totalMarks = 0;

		for (int mark : marks) {
			totalMarks = totalMarks + mark;
		}

		return totalMarks;

	}

	int findStudentAverageMark(Student student) {

		int[] marks = student.getMarks();
		
		int totalMarks = calculateTotalMarks(student);

		return totalMarks / marks.length;

	}

	double findTheClassAverageMarks(Class clazz) {

		Student[] allStudents = clazz.getStudents();

		double total = 0;
		for (Student student : allStudents) {
			int totalMarksForEachStudent = calculateTotalMarks(student);

			total = total + totalMarksForEachStudent;
		}

		return total / allStudents.length;

	}

}