package com.niit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.niit.entity.Booking;
import com.niit.entity.Flight;
import com.niit.entity.Passenger;
import com.niit.enums.FlightType;

public class Main {

	public static void main(String[] args) {

		Flight flight1 = new Flight(101, "New Delhi", "Mumbai", FlightType.DOMESTIC, 2300);
		Flight flight2 = new Flight(102, "Lucknow", "Pune", FlightType.DOMESTIC, 4500);
		Flight flight3 = new Flight(403, "London", "Paris", FlightType.INTERNATIONAL, 41000);
		Flight flight4 = new Flight(765, "Russia", "Ukrain", FlightType.INTERNATIONAL, 6000);

		List<Flight> allFlights = new ArrayList<Flight>();
		allFlights.add(flight1);
		allFlights.add(flight2);
		allFlights.add(flight3);
		allFlights.add(flight4);

		Passenger passenger1 = new Passenger("Shad", 35, "9876543210");
		Passenger passenger2 = new Passenger("Raj", 25, "1234567890");

		List<Passenger> allPassengers = new ArrayList<Passenger>();
		allPassengers.add(passenger1);
		allPassengers.add(passenger2);

		Booking booking1 = new Booking(flight1, allPassengers, "10-04-2022");
		Booking booking2 = new Booking(flight3, allPassengers, "09-04-2022");
		Booking booking3 = new Booking(flight4, allPassengers, "08-04-2022");

		Booking searchedBooking = Booking.searchBooking(booking2.getPnr());

		if (searchedBooking != null) {
			searchedBooking.display();
		} else {
			System.out.println("Invalid PNR..");
		}

		System.out.println(Booking.getBookings());

		Booking.cancelBooking(booking2.getPnr());

		System.out.println(Booking.getBookings());

	}

}
