package org.HackerRank.Algorithms.Implementation;

import java.util.Scanner;

public class FindDigits {
	public static void main(String args[]){
		int counter = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter total no. of cases");
		int N = in.nextInt();		
		
		int[] inputArray = new int[N];
		for(int i = 0; i < inputArray.length; i++){
			inputArray[i] = in.nextInt();
		}
		for(int j = 0; j < inputArray.length; j++){
			int intLength = Integer.toString(inputArray[j]).length();
			String convertIntToString = Integer.toString(inputArray[j]);		
			for(int k = 0; k < intLength; k++){
				String stringDigit = convertIntToString.substring(k, k + 1);
				int intDigit = Integer.parseInt(stringDigit);
				if(intDigit == 0){
					counter += 0;
				}
				else if(inputArray[j] % intDigit == 0){
					counter++;
				}				
			}
			System.out.println(counter);
			counter = 0;
		in.close();
		}
	}
}