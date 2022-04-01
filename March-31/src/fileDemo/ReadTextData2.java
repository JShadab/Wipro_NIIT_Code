package fileDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextData2 {

	public static void main(String[] args) throws IOException {

		File file = new File("E:\\Farzi\\output.txt");

		FileReader reader = new FileReader(file);

		BufferedReader br = new BufferedReader(reader);

		String line = null;

		// Reading data line by line
		while ((line = br.readLine()) != null) {

			System.out.println(line);
		}

		reader.close();

	}

}
