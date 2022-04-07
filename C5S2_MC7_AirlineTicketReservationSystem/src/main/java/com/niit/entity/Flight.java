package com.niit.entity;

import java.util.HashMap;
import java.util.Map;

import com.niit.enums.FlightType;

public class Flight {

	private int flightNum;

	private String origin;
	private String destination;
	private FlightType flightType;
	private double fare;

	private final Map<String, Integer> travelDateVsSeats = new HashMap<String, Integer>();

	public Flight(int flightNum, String origin, String destination, FlightType flightType, double fare) {
		super();
		this.flightNum = flightNum;
		this.origin = origin;
		this.destination = destination;
		this.flightType = flightType;
		this.fare = fare;

		populateSeats();
	}

	private void populateSeats() {

		travelDateVsSeats.put("07-04-2022", 30);
		travelDateVsSeats.put("08-04-2022", 30);
		travelDateVsSeats.put("08-04-2022", 0);
		travelDateVsSeats.put("10-04-2022", 50);
		travelDateVsSeats.put("11-04-2022", 30);
	}

	public int getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(int flightNum) {
		this.flightNum = flightNum;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public FlightType getFlightType() {
		return flightType;
	}

	public void setFlightType(FlightType flightType) {
		this.flightType = flightType;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public Map<String, Integer> getTravelDateVsSeats() {
		return travelDateVsSeats;
	}

	@Override
	public String toString() {
		return "Flight [flightNum=" + flightNum + ", origin=" + origin + ", destination=" + destination
				+ ", flightType=" + flightType + ", fare=" + fare + "]";
	}

}
