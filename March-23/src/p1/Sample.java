package p1;

public class Sample {

	static public void isPhoneNoValid(String phone) {

		if (phone.startsWith("+")) {
			phone = phone.substring(1);
		}

		String regrex = "(91)?[0-9]{10}";
		boolean isMatched = phone.matches(regrex);

		System.out.println(isMatched);
	}

	public static void main(String[] args) {

		String phone = "+919876543213";

		isPhoneNoValid(phone);

	}

}