package com.niit.entity;

import java.util.List;
import java.util.Map;
import java.util.Random;

import com.niit.exceptions.NoSeatAvailableException;

public class Booking {

	private Flight flight;
	private List<Passenger> passengers;
	private String travelDate;
	private String pnr;
	private double totalFare;

	public Booking(Flight flight, List<Passenger> passengers, String travelDate) {
		super();
		this.setFlight(flight);
		this.passengers = passengers;
		this.travelDate = travelDate;
		
		updateSeatAvailability();

		generatePNR();	

		calculateTotalFare();
	}

	private void updateSeatAvailability() {

		Map<String, Integer> map = flight.getTravelDateVsSeats();
		Integer availableSeats = map.get(travelDate);

		if (availableSeats == null || availableSeats == 0 || availableSeats < passengers.size()) {
			throw new NoSeatAvailableException("No Flighta are available for " + travelDate + " date");
		}

		availableSeats = availableSeats - passengers.size();

		map.put(travelDate, availableSeats);

	}

	private void calculateTotalFare() {
		totalFare = flight.getFare() * passengers.size();

	}

	public double getTotalFare() {
		return totalFare;
	}

	private void generatePNR() {

		Random random = new Random(6);

		int rand = random.nextInt();

		this.pnr = travelDate + "_" + flight.getOrigin() + "_" + flight.getDestination() + "_" + rand;

	}

	public String getPnr() {
		return pnr;
	}

	public String getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public void display() {

		System.out.println(
				"PNR: " + getPnr() + "  Travel Date: " + getTravelDate() + "  Flight Number: " + flight.getFlightNum());
		System.out.println();

		System.out.println("Origin: " + flight.getOrigin() + "   Destination: " + flight.getDestination() + "   Type: "
				+ flight.getFlightType());
		System.out.println();

		System.out.println("Passangers Details:");
		System.out.println("--------------------");
		System.out.println("S.No. Name            Age    Phone ");

		int count = 1;
		for (Passenger passenger : passengers) {
			System.out.println("#" + count++ + ".   " + passenger.getName() + "      " + passenger.getAge() + "     "
					+ passenger.getPhone());
		}
		System.out.println();

		System.out.println("------------------------------------------------------");
		System.out.println("Total Fare: " + getTotalFare());

	}

}
