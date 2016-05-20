package org.HackerRank.Tutorial.ThirtyDaysOfCode;

import java.util.Scanner;

public class Operators {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble();
		int tipPercent = scan.nextInt();
		int taxPercent = scan.nextInt();
		
		double totalCost = mealCost + ((mealCost * tipPercent)/100) + ((mealCost * taxPercent)/100);
		System.out.println("The total meal cost is " + Math.round(totalCost) + " dollars.");
		scan.close();
	}

}
