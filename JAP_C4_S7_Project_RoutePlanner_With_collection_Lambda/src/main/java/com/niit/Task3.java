package com.niit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Task3 {

	public static final String fileName = "routes.csv";

	public static void main(String[] args) throws Exception {

		String[] routes = readAndDisplayRoutes();

		showDirectFlights(routes, "Delhi");
	}

	static void showDirectFlights(String[] routes, String fromCity) {

		ArrayList<String> directRoutes = new ArrayList<String>();

		for (String route : routes) {

			if (route.startsWith(fromCity)) {
				directRoutes.add(route);
			}
		}

		String[] directRoutArr = directRoutes.toArray(new String[0]);

		sortDirectFlights(directRoutArr);

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

	static void sortDirectFlights(String[] routes) {

		Comparator<String> destComparator = (route1, route2) -> {

			String dest1 = route1.split(",")[1];
			String dest2 = route2.split(",")[1];

			return dest1.compareTo(dest2);

		};

		Arrays.sort(routes, destComparator);
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
