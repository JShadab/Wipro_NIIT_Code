package com.jap.salesanalyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class performs the file reading and stores the data in SalesRecord array
 */
public class SalesAnalysis {
	
	  SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yy");
	  
	// This method reads a file and returns the count of lines in the file
	// omit any headers present in the file
	public int countOfSalesRecords(String fileName) {
		int recordCount = -1;

		File file = new File(fileName);

		// try with resource
		try (FileReader reader = new FileReader(file); BufferedReader br = new BufferedReader(reader);) {

			recordCount = (int) br.lines().count() - 1; // remove the header line

		} catch (Exception e) {
			e.printStackTrace();
		}

		return recordCount;
	}

	// This method reads a file and adds each line of the file into the
	// corresponding SalesRecord object
	public SalesRecord[] readRecords(String fileName, int recordCount) throws ParseException {
		SalesRecord[] salesData = new SalesRecord[recordCount];

		File file = new File(fileName);

		// array to hold the sales records

		// try with resource
		try (FileReader reader = new FileReader(file); BufferedReader br = new BufferedReader(reader);) {

			String line = null;

			int index = 0;

			// Reading data line by line
			while ((line = br.readLine()) != null) {

				if (index != 0) {

					String[] data = line.split(",");

					Date date = formatter.parse(data[0]);
					int customer_id = Integer.parseInt(data[1]);
					int product_category = Integer.parseInt(data[2]);
					String payment_method = data[3];
					double amount = Double.parseDouble(data[4]);
					double time_on_site = Double.parseDouble(data[5]);
					int clicks_in_site = Integer.parseInt(data[6]);

					SalesRecord record = new SalesRecord(date, customer_id, product_category, payment_method, amount,
							time_on_site, clicks_in_site);

					salesData[index - 1] = record;

				}
				index++;

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return salesData;
	}

	public static void main(String[] args) throws ParseException {
		SalesAnalysis salesAnalysis = new SalesAnalysis();
		// read the file purchase_details.csv
		String fileName = "src/main/resources/purchase_details.csv";

		int recordCount = salesAnalysis.countOfSalesRecords(fileName);
		salesAnalysis.readRecords(fileName, recordCount);

	}
}
