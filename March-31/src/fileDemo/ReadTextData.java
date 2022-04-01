package fileDemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextData {

	public static void main(String[] args) throws IOException {

		File file = new File("E:\\Farzi\\output.txt");

		FileReader reader = new FileReader(file);

		int x = -1;

		//Reading data char by char
		while ((x = reader.read()) != -1) {

			System.out.print((char) x);
		}
		
		reader.close();

	}

}
