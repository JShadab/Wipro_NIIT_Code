package fileDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextData {

	public static void main(String[] args) throws IOException {

		File file = new File("E:\\Farzi\\output.txt");

		FileWriter writer = new FileWriter(file, true);
		

		writer.write("Pusha jhukega nai....\n");
		writer.write("Kaccha badam, kach badam.\n");
		writer.write("Flower nahi, Fire hu main. \n");

		writer.close();
		
		System.out.println("Done");

	}

}
