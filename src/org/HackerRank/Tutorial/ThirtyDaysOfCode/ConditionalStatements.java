package org.HackerRank.Tutorial.ThirtyDaysOfCode;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int no = in.nextInt();
		if(no % 2 == 1){
			System.out.println("Weird");
		}
		else if(no >=2 && no <= 5){
			System.out.println("Not Weird");
		}
		else if(no >= 6 && no <= 20 ){
			System.out.println("Weird");
		}
		else if(no > 20){
			System.out.println("Not Weird");
		}
		in.close();
	}

}
