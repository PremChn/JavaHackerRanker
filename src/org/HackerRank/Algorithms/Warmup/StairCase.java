package org.HackerRank.Algorithms.Warmup;

import java.util.Scanner;

public class StairCase {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Size Stairs:");
		int SizeOfStairs = in.nextInt();
		in.close();
		for(int i = 1; i <= SizeOfStairs; i++){
			for(int j = 1; j <= SizeOfStairs; j++){
				int temp = i + j;
				if(temp > SizeOfStairs){
					System.out.print("#");
				}
				else{
					System.out.print(" ");
				}					
			}
			System.out.println();
		}
	}

}
