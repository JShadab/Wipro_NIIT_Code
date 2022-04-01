package com.jap.filedemo;

import java.io.*;

public class ReadWriteFile {

	public static void main(String[] args) {
		ReadWriteFile readWriteFile = new ReadWriteFile();
		try {
			readWriteFile.readDataFromFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// create object of Readers and writers
	public void readDataFromFile() throws IOException {

		/*********************** Read the data *****************/

		File file = new File("E:\\Farzi\\pc1\\input.txt");

		FileReader reader = new FileReader(file);

		BufferedReader br = new BufferedReader(reader);

		String line = null;

		String content = "";

		// Reading data line by line
		while ((line = br.readLine()) != null) {

			content = content + line;
		}

		reader.close();

		/*********************** Split and Transform the data *****************/

		String[] names = content.split(",");

		String updatedContent = "";

		for (String name : names) {
			String updateName = transform(name);
			updatedContent = updatedContent + updateName + ",";
		}

		/*********************** Write the data *****************/

		File output = new File("E:\\Farzi\\pc1\\output.txt");

		FileWriter writer = new FileWriter(output);

		writer.write(updatedContent);

		writer.close();
		
		System.out.println("Done");

	}

	private String transform(String name) {
		String[] words = name.split(" ");

		String updatedName = "";

		for (String word : words) {
			char firstChar = word.charAt(0);
			firstChar = Character.toUpperCase(firstChar);

			String allOthers = word.substring(1);

			String finalStr = firstChar + allOthers;

			updatedName = updatedName + finalStr + " ";

		}

		return updatedName.trim();
	}
}
