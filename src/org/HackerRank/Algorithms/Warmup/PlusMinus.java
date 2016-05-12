package org.HackerRank.Algorithms.Warmup;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int ArraySize = in.nextInt();
		System.out.println("Enter Array Elements:");
		int[] InputArray = new int[ArraySize];		
		for(int i = 0; i < InputArray.length; i++){
			InputArray[i] = in.nextInt();
		}
		in.close();
		double[] PlusMinus = PlusMinusSolution(InputArray);
		for(int i = 0; i < PlusMinus.length; i++){
			System.out.println(String.format("%.6f", PlusMinus[i]));
		}
	
		
	}
	public static double[] PlusMinusSolution(int[] Array){
		double PositiveCount = 0;
		double NegativeCount = 0;
		double ZeroCount = 0;
		int ArrayLength = Array.length;
		double[] SolutionArray = new double[3];
		for(int i = 0; i < ArrayLength; i++){
			if (Array[i] > 0){
				PositiveCount += 1;
			}
			else if (Array[i] < 0){
				NegativeCount += 1;
			}
			else {
				ZeroCount += 1;
			}				
		}
		SolutionArray[0] = PositiveCount / ArrayLength;
		SolutionArray[1] = NegativeCount / ArrayLength;
		SolutionArray[2] = ZeroCount / ArrayLength;
		return SolutionArray;
	}

}
