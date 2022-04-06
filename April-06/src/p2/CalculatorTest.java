package p2;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculate add = new Calculate() {

			@Override
			public int calc(int x, int y) {

				int c = x + y;
				// System.out.println(c);
				return c;

			}
			
			@Override
			public void foo() {
				// TODO Auto-generated method stub
				
			}
		};
		
		//Calculate add = (x, y) -> (x + y);

		Calculate subtract = new Calculate() {

			@Override
			public int calc(int x, int y) {
				int c = x - y;
				// System.out.println(c);
				return c;

			}

			
		};

		Calculate multiply = new Calculate() {

			@Override
			public int calc(int x, int y) {
				int c = x * y;
				// System.out.println(c);
				return c;

			}
			
			
		};

		Calculate division = new Calculate() {

			@Override
			public int calc(int x, int y) {
				int c = x / y;
				// System.out.println(c);
				return c;

			}
			
		};

		add.calc(10, 3);
		subtract.calc(10, 3);
		multiply.calc(10, 3);
		division.calc(10, 3);

	}

}
