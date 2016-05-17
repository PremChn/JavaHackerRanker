package org.HackerRank.DataStructures.Arrays;

import java.util.Scanner;

public class ArrayDS {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int n = in.nextInt();
		int[] Arr = new int[n];
		System.out.println("Enter Array Elements:");
		for(int i = 0; i < Arr.length; i++){
			Arr[i] = in.nextInt();			
		}
		int[] SolutionArray = reverseArray(Arr);
		for(int k = 0; k < SolutionArray.length; k++)
			System.out.print(SolutionArray[k] + " ");
		
	}
	
	public static int[] reverseArray(int[] Array){
		int SourceArrayLength = Array.length;
		int[] TargetArray = new int[SourceArrayLength];
		for(int j = 1; j <= SourceArrayLength; j++){
			TargetArray[j - 1] = Array[SourceArrayLength - j];
		}
		return TargetArray;
		
	}

}
