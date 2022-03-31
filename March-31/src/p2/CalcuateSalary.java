package p2;

public class CalcuateSalary {

	public static void main(String[] args) {

		double total;
		try {
			total = calcSalary(-100);
			System.out.println("Your total salary is : " + total);
		} catch (MyException e) {
			e.printStackTrace();
		}

	}

	private static double calcSalary(int basic) throws MyException {

//		if(basic <= 0) {
//			System.out.println("Brother, basic salary cannot be zero or negative");
//			return 0;
//		}

		if (basic <= 0) {

			MyException exp = new MyException("Mr. basic salary cannot be zero or negative");

			throw exp;
		}

		double total = 2 * basic + 50;

		return total;
	}

}
