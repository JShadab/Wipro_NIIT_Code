package p2;

public class CalculatorTestWithLambda {

	public static void main(String[] args) {

		Calculate add = (x, y) -> (x + y);

		Calculate subtract = (x, y) -> (x - y);

		Calculate multiply = (x, y) -> (x * y);

		Calculate division = (x, y) -> (x / y);

		add.calc(10, 3);
		subtract.calc(10, 3);
		multiply.calc(10, 3);
		division.calc(10, 3);

	}

}
