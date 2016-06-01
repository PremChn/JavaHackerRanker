package org.HackerRank.Tutorial.ThirtyDaysOfCode;

import java.util.Scanner;

public class InheritanceSolution {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		InheritanceStudent s = new InheritanceStudent(firstName, lastName, id,testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
		scan.close();
	}
	
}
