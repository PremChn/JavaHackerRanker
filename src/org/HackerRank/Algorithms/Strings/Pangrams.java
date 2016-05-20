package org.HackerRank.Algorithms.Strings;

import java.util.Scanner;

public class Pangrams {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String pangramTestString = in.nextLine();
		in.close();
		if (pangramsFinder(pangramTestString.toUpperCase().replaceAll(" ", ""))) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}

	}

	public static boolean pangramsFinder(String S) {
		if (S.length() < 26) {
			return false;
		} else {
			for (char ch = 'A'; ch <= 'Z'; ch++) {

				if (S.indexOf(ch) < 0) {
					return false;
				}
			}

			return true;
		}
	}
}
