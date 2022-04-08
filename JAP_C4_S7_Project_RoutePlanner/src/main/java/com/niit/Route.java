package com.niit;

public class Route {

	private String source;
	private String destination;
	private int distance;
	private String TravelTime;
	private String Airfare;

	public Route(String source, String destination, int distance, String travelTime, String airfare) {
		super();
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		TravelTime = travelTime;
		Airfare = airfare;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getTravelTime() {
		return TravelTime;
	}

	public void setTravelTime(String travelTime) {
		TravelTime = travelTime;
	}

	public String getAirfare() {
		return Airfare;
	}

	public void setAirfare(String airfare) {
		Airfare = airfare;
	}

	@Override
	public String toString() {
		return "Route [source=" + source + ", destination=" + destination + ", distance=" + distance + ", TravelTime="
				+ TravelTime + ", Airfare=" + Airfare + "]";
	}

}
