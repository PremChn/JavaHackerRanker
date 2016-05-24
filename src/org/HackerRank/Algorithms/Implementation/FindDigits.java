package org.HackerRank.Algorithms.Implementation;

import java.util.Scanner;

public class FindDigits {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter total no. of cases");
		int N = in.nextInt();
		
		
		int[] inputArray = new int[N];
		for(int i = 0; i < inputArray.length; i++){
			inputArray[i] = in.nextInt();
		}
		in.close();
	}
	
	public static int[] findDigits(int[] inputArray){
		for(int i = 0; i < inputArray.length; i++){
			int count = 0;
			int intLength = Integer.toString(inputArray[i]).length();
			for(int j = 0 ; j < intLength; j++){
				
			}
			return inputArray;
		}

		
	}

}
