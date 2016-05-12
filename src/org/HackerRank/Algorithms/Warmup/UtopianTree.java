package org.HackerRank.Algorithms.Warmup;

import java.util.Scanner;

public class UtopianTree {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. of Test Cases:");
		int noOfTestCases = in.nextInt();

		System.out.println("Enter initial height of the trees:");
		int[] treeFinalHeight = new int[noOfTestCases];
		int temp = 1;
		// To get input for test cases
		int[] noOfSeasons = new int[noOfTestCases];
		for (int i = 0; i < noOfSeasons.length; i++) {
			noOfSeasons[i] = in.nextInt();
		}

		for (int j = 0; j < noOfSeasons.length; j++) {
			if (noOfSeasons[j] == 0) {
				treeFinalHeight[j] = temp;
			} else if (noOfSeasons[j] == 1) {
				treeFinalHeight[j] = temp + temp;
			} else {
				for (int k = 1; k <= noOfSeasons[j]; k++) {
					if (k % 2 == 0) {
						temp = temp + 1;
					} else {
						temp = temp * 2;
					}

				}
				treeFinalHeight[j] = temp;
				temp = 1;
			}
		}

		for (int i = 0; i < treeFinalHeight.length; i++) {
			System.out.println(treeFinalHeight[i]);
		}
		in.close();
	}

}
