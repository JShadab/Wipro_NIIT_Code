package com.niit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Task2 {

	public static final String fileName = "routes.csv";

	public static void main(String[] args) throws Exception {

		String[] routes = readAndDisplayRoutes();

		showDirectFlights(routes, "Paris");
	}

	static void showDirectFlights(String[] routes, String fromCity) {

		int count = 0;

		for (String route : routes) {
			if (route.startsWith(fromCity)) {
				count++;
			}

		}

		String[] directRoutes = new String[count];

		int index = 0;
		for (String route : routes) {

			if (route.startsWith(fromCity)) {
				directRoutes[index++] = route;
			}
		}

		if (directRoutes.length > 0) {

			String header = "From,To,Distance,Travel Time,Airfare";
			System.out.println(header);

			for (String route : directRoutes) {
				if (route.startsWith(fromCity)) {
					System.out.println(route);
				}

			}
		} else {

			String msg = "We are sorry. At this point of time, we don not have any information on flight originating from "
					+ fromCity;

			System.out.println(msg);

		}
	}

	private static String[] readAndDisplayRoutes() throws Exception {
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

//		for (String route : routeArr) {
//			System.out.println(route);
//
//		}

		return routeArr;

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