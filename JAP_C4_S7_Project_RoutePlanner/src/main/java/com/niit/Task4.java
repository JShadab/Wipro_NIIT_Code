package com.niit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;

public class Task4 {

	public static final String fileName = "routes.csv";

	public static void main(String[] args) throws Exception {

		String[] routes = readAndDisplayRoutes();

		String source = "Delhi";
		String destination = "London";

		displayeConnectRoutes(routes, source, destination);
	}

	static void displayeConnectRoutes(String[] routes, String source, String destination) {

		// Direct Routes
		String directRoute = getDirectRoute(routes, source, destination);

		if (directRoute != null) {
			String header = "From,To,Distance,Travel Time,Airfare";
			System.out.println(header);

			System.out.println(directRoute);

		}

		// InDirect Routes
		String[] inDirectRoutes = getInDirectRoutes(routes, source, destination);

		for (String inDirectRoute : inDirectRoutes) {

			System.out.println(inDirectRoute);

		}

	}

	static String getDirectRoute(String[] routes, String fromCity, String destCity) {

		String directRoute = null;

		for (String route : routes) {
			if (route.contains(fromCity) && route.contains(destCity)) {
				directRoute = route;
				break;
			}

		}

		return directRoute;

	}

	static String[] getInDirectRoutes(String[] routes, String fromCity, String destCity) {

		String[] inDirectRoutes = new String[2];

		for (String route : routes) {
			if (route.contains(fromCity) && !route.contains(destCity)) {

				String newFromCity = route.split(",")[1];

				String routeTemp = getDirectRoute(routes, newFromCity, destCity);

				if (routeTemp != null) {
					inDirectRoutes[0] = route;
					inDirectRoutes[1] = routeTemp;
				}
			}

		}

		return inDirectRoutes;

	}

	static void sortDirectFlights(String[] routes) {

		Comparator<String> destComparator = new Comparator<String>() {

			@Override
			public int compare(String route1, String route2) {

				String dest1 = route1.split(",")[1];
				String dest2 = route2.split(",")[1];

				return dest1.compareTo(dest2);
			}
		};

		Arrays.sort(routes, destComparator);
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
