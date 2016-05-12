package org.HackerRank.Algorithms.Warmup;

import java.util.Scanner;

public class SolveMeFirst {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first input");		
		int a = in.nextInt();
		System.out.println("Enter Second input");
		int b = in.nextInt();		
		in.close();
		int sum = SolveMe(a,b);
		System.out.println("Sum of two numbers: " + sum);		
	}
	
	public static int SolveMe(int a, int b){
		int c;
		c = a + b;
		return c;
	}
	
}
