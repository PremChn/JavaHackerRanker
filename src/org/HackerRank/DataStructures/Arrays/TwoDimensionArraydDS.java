package org.HackerRank.DataStructures.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionArraydDS {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		int cols = in.nextInt();
		int[][] arr = new int[rows][cols];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				arr[i][j] = in.nextInt();
			}
		}
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				System.out.print(arr[i][j] + "  ");			
			}
			System.out.println();
		}
		int[] count = new int[4*4];

	    int x = 0;
	    for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 4; j++) {
	            try {
	                count[x] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + 
	                		   arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
	                x++;
	            } catch (Exception e) {
	            }
	        }
	    }

	    Arrays.sort(count);
	    System.out.print(count[count.length-1]);
	}

}
