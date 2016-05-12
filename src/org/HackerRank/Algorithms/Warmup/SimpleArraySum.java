package org.HackerRank.Algorithms.Warmup;

import java.util.Scanner;

public class SimpleArraySum {
	public static void main(String args[]){
		int ElementsInArray;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		ElementsInArray = in.nextInt();
		int[] InputArr =  new int[ElementsInArray];
		System.out.println("Enter Array Element:");
		for(int i = 0; i < InputArr.length; i++){
			InputArr[i] = in.nextInt();
		}
		in.close();
		System.out.println("Sum of Array Element: " + ArraySum(InputArr));
	}
	public static int ArraySum(int[] Arr){
		int temp = 0;
		for(int i = 0; i < Arr.length; i++){
			temp += Arr[i];
		}
		return temp;
	}

}
