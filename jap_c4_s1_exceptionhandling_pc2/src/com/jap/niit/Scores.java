package com.jap.niit;

import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {

		int N = 10;

		String[] nameOfSchools = new String[N];
		String[] scores = new String[N];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < N; i++) {

			System.out.println("Enter School name:");
			nameOfSchools[i] = scanner.next();

			System.out.println("Enter score:");
			scores[i] = scanner.next();

		}

		// String[] nameOfSchools = { "DAV", "RSK", "Treamis", "Candor", "Oak", "UAV",
		// "BCGS", "BCBS", "Baldwin", "NPS" };
		// String[] scores = { "56", "78", "55", "6", "44", "33", "82", "77", "8", "76"
		// };
		/************ for average score ********************/
		int sum = 0;

		int highestScore = 0;
		int hightesScoreIndex = -1;

		for (int i = 0; i < N; i++) {

			String scoreStr = scores[i];

			try {
				int score = Integer.parseInt(scoreStr);

				if (score > highestScore) {
					highestScore = score;
					hightesScoreIndex = i;
				}

				sum = sum + score;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}

		}

		int avg = sum / N;

		System.out.println("The average score of the 10 schools is: " + avg);

		/************ for Highest score ********************/
		if (hightesScoreIndex >= 0 && hightesScoreIndex < N) {
			String schoolName = nameOfSchools[hightesScoreIndex];
			System.out.println("The highest scorer in the quiz is: " + schoolName + " with score of: " + highestScore);
		}

	}

}
