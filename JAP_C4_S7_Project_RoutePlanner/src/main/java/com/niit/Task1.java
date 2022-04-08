package com.niit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Task1 {

	public static final String fileName = "routes.csv";

	public static void main(String[] args) throws Exception {

		readAndDisplayRoutes();
	}

	private static void readAndDisplayRoutes() throws Exception {
		int size = lineCount();

		String[] routeArr = new String[size];

		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String line = null;

		int index = 0;
		while ((line = br.readLine()) != null) {

			if (index == 0) {
				index++;
				continue;
			}

			routeArr[index - 1] = line;
			index++;
		}

		br.close();

		for (String route : routeArr) {
			System.out.println(route);

		}

	}

	static int lineCount() throws Exception {

		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		long count = br.lines().count() - 1;

		br.close();

		return (int) count;
	}

}
