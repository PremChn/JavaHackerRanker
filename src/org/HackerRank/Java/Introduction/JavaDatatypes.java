package org.HackerRank.Java.Introduction;

import java.util.Scanner;

public class JavaDatatypes {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no. of test cases: ");
		int noOfTestCases = sc.nextInt();
		for(int i = 0; i < noOfTestCases; i++){
			try{
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if(x >= -128 && x <= 128) System.out.println(" byte");
				if(x >= -Math.pow(2, 15) && x <= Math.pow(2,  15) - 1) System.out.println("* short");
				if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1) System.out.println("* int");
				if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1) System.out.println("* long");
			}
			catch(Exception e){
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}
			
		}
		sc.close();
	}

}
