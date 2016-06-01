package org.HackerRank.Tutorial.ThirtyDaysOfCode;

import java.util.Scanner;

public class ScopeSolution {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++){
			a[i] = sc.nextInt();
		}
		
		ScopeDifference D = new ScopeDifference(a);
		D.computeDifference();
		System.out.println(D.maximumDifference);
		sc.close();
		
	}

}
