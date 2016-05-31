package org.HackerRank.Tutorial.ThirtyDaysOfCode;

import java.util.Scanner;

public class Recursion {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter input for Factorial");
		int n = in.nextInt();
		System.out.println(Factorial(n));
		in.close();
	}

	public static int Factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * Factorial(n - 1);
		}
	}
}
