package org.HackerRank.Tutorial.ThirtyDaysOfCode;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. of rows and cols for 2D array");
		int rows = in.nextInt();
		int cols = in.nextInt();
		int[][] twoDArray = new int[rows][cols];
		System.out.println("Enter values for 2D array");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				twoDArray[i][j] = in.nextInt();
			}
		}
		System.out.println();
		System.out.println("Structure of 2D Array");
		System.out.println();
		for (int x = 0; x < rows; x++) {
			for (int y = 0; y < cols; y++) {
				System.out.print(twoDArray[x][y] + " ");
			}
			System.out.println();
		}
	/* There are 16 hour classes in 6X6 dimension array for the following input
		1 1 1 0 0 0
		0 1 0 0 0 0
		1 1 1 0 0 0
		0 0 2 4 4 0
		0 0 0 2 0 0
		0 0 1 2 4 0
	Sample structure of hour classes in a 6X6 dimension array
		1 1 1   1 1 0   1 0 0   0 0 0
		  1       0       0       0
		1 1 1   1 1 0   1 0 0   0 0 0

		0 1 0   1 0 0   0 0 0   0 0 0
		  1       1       0       0
		0 0 2   0 2 4   2 4 4   4 4 0

		1 1 1   1 1 0   1 0 0   0 0 0
		  0       2       4       4
		0 0 0   0 0 2   0 2 0   2 0 0

		0 0 2   0 2 4   2 4 4   4 4 0
		  0       0       2       0
		0 0 1   0 1 2   1 2 4   2 4 0 */
		
		int hourGlassRows = 4;
		int hourGlassCols = 4;
		int hourGlassDimension = hourGlassRows * hourGlassCols;
		int[] count = new int[hourGlassDimension];
		int x = 0;
		
		for (int i = 0; i < hourGlassRows; i++) {
			for (int j = 0; j < hourGlassCols; j++) {
				try {           
					count[x] = (twoDArray[i][j] + twoDArray[i][j + 1] + twoDArray[i][j + 2]) + (twoDArray[i + 1][j + 1])
							+ (twoDArray[i + 2][j] + twoDArray[i + 2][j + 1] + twoDArray[i + 2][j + 2]);
					x++;
				} catch (Exception e) {
				}
			}
		}

		Arrays.sort(count);

		System.out.println();
		System.out.print("The largest hour class sum = " + count[count.length - 1]);
		in.close();
	}

}
