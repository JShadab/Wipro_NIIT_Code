package com.jap.ticketing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TicketingOperations {
	// This method reads the sample.csv file provided and returns a List
	public List<TicketingData> readTicketingData(String fileName) {
		File file = new File(fileName);

		List<TicketingData> allTicketingData = new ArrayList<TicketingData>();

		try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr);) {

			String line = null;

			int count = 1;

			while ((line = br.readLine()) != null) {
				if (count == 1) {
					count++;
					continue;
				}

				String[] properties = line.split(",");

				String scheduleNo = properties[0];
				String routeNo = properties[1];
				int ticketFromStopId = Integer.parseInt(properties[2]);
				int ticketFromStopSeqNo = Integer.parseInt(properties[3]);
				int ticketTillStopId = Integer.parseInt(properties[4]);
				int ticketTillStopSeqNo = Integer.parseInt(properties[5]);
				String ticketDate = properties[6];
				String ticketTime = properties[7];
				int totalTicketAmount = Integer.parseInt(properties[8]);
				float travelledKM = Float.parseFloat(properties[9]);

				TicketingData ticketingData = new TicketingData(scheduleNo, routeNo, ticketFromStopId,
						ticketFromStopSeqNo, ticketTillStopId, ticketTillStopSeqNo, ticketDate, ticketTime,
						totalTicketAmount, travelledKM);

				allTicketingData.add(ticketingData);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return allTicketingData;
	}

	// This method sorts the data based on the kms travelled by a bus (route)
	public List<TicketingData> sortByKmsTravelled(List<TicketingData> ticketingDataList) {

		Comparator<TicketingData> comparator = (o1, o2) -> {
			float diff = o2.getTravelledKM() - o1.getTravelledKM();

			if (diff > 0) {
				return 1;
			} else if (diff < 0) {
				return -1;
			} else {

				return 0;
			}
		};

		Collections.sort(ticketingDataList, comparator);

		return ticketingDataList;

	}

	// This method calculates the total revenue from ticket collection amount
	public double totalAmountCollected(final List<TicketingData> ticketingDataList) {

		TicketCollection ticketCollection = () -> {

			double total = 0;

			for (TicketingData ticketingData : ticketingDataList) {

				total = total + ticketingData.getTotalTicketAmount();
			}
			return total;
		};

		return ticketCollection.calculateTotalCollectionAmount();
	}

}
