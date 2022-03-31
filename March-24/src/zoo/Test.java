package zoo;

public class Test {

	public static void main(String[] args) {

		Lion lion = new Lion();
		lion.eat();
	//	lion.fly();

		Cow cow = new Cow();
		cow.eat();
	//	cow.fly();

		Crow crow = new Crow();
		crow.eat();
	//	crow.fly();

		// Compile time error
//		Animal animal = new Animal();
//		animal.eat();
		
		Kite kite= new Kite();
		kite.fly();
	}

}
