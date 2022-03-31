package p1;

import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) {

		String name = "Shadab Ahmad Khan";

		System.out.println(name);
		System.out.println(name.length());// 17

		char ch = name.charAt(2);
		System.out.println(ch);// 'a'

		int index = name.indexOf('a');
		System.out.println(index); // 2

		int lastIndex = name.lastIndexOf('a');
		System.out.println(lastIndex); // 15

		System.out.println("-----------------------------------");
		String x = "I Love ";
		String y = "JAVA";

		String p = x + y;
		System.out.println(p);

		String q = x.concat(y);
		System.out.println(q);

		System.out.println("-----------------------------------");

		boolean b1 = name.contains("Khan");
		System.out.println(b1);// true

		boolean b2 = name.contains("Sharma");
		System.out.println(b2);// false

		boolean b3 = name.startsWith("Shad");
		System.out.println(b3);// true

		boolean b4 = name.endsWith("han");
		System.out.println(b4);// true

		System.out.println("-----------------------------------");

		String a = name.substring(7, 12);
		System.out.println(a);// Ahmad

		String b = name.substring(13);
		System.out.println(b);// Khan

		System.out.println("-----------------------------------");
		String str = name.replace('a', 'z');
		System.out.println(str);// Shzdzb Ahmzd Khzn

		String str1 = "  Papa Mummy     ";
		System.out.println(str1 + ", " + str1.length());// 17

		String str2 = str1.trim();
		System.out.println(str2 + ", " + str2.length());

		System.out.println("-----------------------------------");

		String[] words = name.split(" ");
		System.out.println(Arrays.toString(words));

		System.out.println("-----------------------------------");

		String s1 = "Java";
		String s2 = "Java";

		boolean b11 = s1 == s2; //  reference equality  -> TRUE
		boolean b12 = s1.equals(s2); // object/content equality -> TRUE

		String s3 = new String("Python");
		String s4 = new String("PYTHON");

		boolean b21 = s3 == s4;  //  reference equality  -> FALSE
		boolean b22 = s3.equals(s4); // object/content equality -> FALSE
		boolean b23 = s3.equalsIgnoreCase(s4); // object/content equality -> TRUE

	}
}
