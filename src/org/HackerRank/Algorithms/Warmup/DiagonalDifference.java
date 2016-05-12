package org.HackerRank.Algorithms.Warmup;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Rows/Colums of a Matrix: ");
		int rows = scanner.nextInt();
		int cols = rows;
		int[][] matrix = new int[rows][cols];

		System.out.println("Enter the elements in Matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		System.out.println("\nMatrix is : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("\n");
		}

		// Logic to calculate sum of diagonal one
		int Sum_of_Diagonal_One = 0;
		for (int i = 0, j = 0; i < rows && j < cols; i++, j++) {
			Sum_of_Diagonal_One += matrix[i][j];
		}

		// Logic to calculate sum of diagonal two
		int Sum_of_Diagonal_Two = 0;
		for (int i = 0, j = cols - 1; i < rows && j < cols; i++, j--) {
			Sum_of_Diagonal_Two += matrix[i][j];
		}
		
		System.out.println("Sum of diagonal one elements = " + Sum_of_Diagonal_One + " ,Sum of diagonal two elements = "
				+ Sum_of_Diagonal_Two);
		System.out.println(
				"Sum of diagonal one and diagonal two element is " + (Sum_of_Diagonal_One + Sum_of_Diagonal_Two));
		System.out.println("Diagonal Difference is " + (Math.abs(Sum_of_Diagonal_One - Sum_of_Diagonal_Two)));
	}
}
