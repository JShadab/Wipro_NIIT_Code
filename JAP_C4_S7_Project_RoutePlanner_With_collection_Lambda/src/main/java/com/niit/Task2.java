package com.niit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Task2 {

	public static final String fileName = "routes.csv";

	public static void main(String[] args) throws Exception {

		String[] routes = readAndDisplayRoutes();

		showDirectFlights(routes, "Paris");
	}

	static void showDirectFlights(String[] routes, String fromCity) {

		ArrayList<String> directRoutes = new ArrayList<String>();

		for (String route : routes) {

			if (route.startsWith(fromCity)) {
				directRoutes.add(route);
			}
		}

		if (directRoutes.size() > 0) {

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

		return routeList.toArray(new String[0]);

	}

}
