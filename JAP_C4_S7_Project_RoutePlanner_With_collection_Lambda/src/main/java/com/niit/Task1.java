package com.niit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Task1 {

	public static final String fileName = "routes.csv";

	public static void main(String[] args) throws Exception {

		readAndDisplayRoutes();
	}

	private static void readAndDisplayRoutes() throws Exception {

		ArrayList<String> routeList = new ArrayList<String>();

		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String line = null;

		while ((line = br.readLine()) != null) {

			routeList.add(line);
		}

		br.close();

		for (String route : routeList) {
			System.out.println(route);

		}

	}

}
