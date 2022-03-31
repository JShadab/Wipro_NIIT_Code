package p1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		f1();
	}

	private static void f1() throws IOException {

		// chance for FileNotFoundException is 0.000000000001 %
		FileReader reader = new FileReader(new File("abc.txt"));

		System.out.println(reader.read());

	}
}
