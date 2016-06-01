package org.HackerRank.Tutorial.ThirtyDaysOfCode;

import java.util.Scanner;

public class InheritanceStudent extends InheritancePerson {
	private int[] testScores;
	private char letterGrade = ' ';

	InheritanceStudent(String firstName, String lastName, int id, int[] tScores) {
		super(firstName, lastName, id);
		this.testScores = tScores;
	}

	public char calculate() {
		int sum = 0;
		
		for (int i = 0; i < testScores.length; i++) {
			sum += testScores[i];
		}
		int avg = sum / testScores.length;
				
		if (avg >= 90 && avg <= 100) {
			letterGrade = 'O';
		} else if (avg >= 80 && avg < 90) {
			letterGrade = 'E';
		} else if (avg >= 70 && avg < 80) {
			letterGrade = 'A';
		} else if (avg >= 55 && avg < 70) {
			letterGrade = 'P';
		} else if (avg >= 40 && avg < 55) {
			letterGrade = 'D';
		} else if (avg < 40) {
			letterGrade = 'T';
		}
		return letterGrade;
	}

}
