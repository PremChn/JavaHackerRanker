package org.HackerRank.Tutorial.ThirtyDaysOfCode;

import java.util.Scanner;

public class LetsReview {
	public static void main(String args[]){
		String evenString = "";
		String oddString = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. of test cases:");
		int N = in.nextInt();
		System.out.println("Enter input string:");
		String[] str = new String[N];
		for(int i = 0; i < str.length; i++){
			str[i] = in.next();
		}
		in.close();		
		for(int j = 0; j < str.length; j++){
			int strLength = str[j].length();
			String[] strArray = new String[strLength];		
			for(int k = 0; k < strLength; k++){
				strArray[k] = str[j].substring(k, k + 1);
			}
			
			for(int l = 0; l < strArray.length; l++){
				if(l%2 == 0){
					evenString += strArray[l];
				}
				else{
					oddString += strArray[l];
				}
				
			}
			System.out.print(evenString + " " + oddString);
			System.out.println();
			evenString = "";
			oddString = "";
		}
		
	}
	
}