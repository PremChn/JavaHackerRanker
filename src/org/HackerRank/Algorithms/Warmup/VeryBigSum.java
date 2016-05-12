package org.HackerRank.Algorithms.Warmup;

import java.util.Scanner;

public class VeryBigSum {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int NoOfElement = in.nextInt();
		long [] InputArray = new long[NoOfElement];
		System.out.println("Enter Array Elements:");
		for(int i = 0; i < InputArray.length; i++){
			InputArray[i] = in.nextLong();
		}
		in.close();		
		System.out.println("Sum of Big Number: " + SumBigNum(InputArray));
	}
	
	public static long SumBigNum(long[] Array){
		long temp = 0;
		for(int i = 0; i < Array.length; i++){
			temp = temp + Array[i];
		}
		System.out.println(temp);
		return temp;
	}

}
