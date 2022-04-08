package com.niit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
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
