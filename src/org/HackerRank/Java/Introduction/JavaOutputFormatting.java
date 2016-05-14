package org.HackerRank.Java.Introduction;

import java.util.Scanner;

public class JavaOutputFormatting {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String[] s = new String[3];
		int[] x = new int[3];	
		System.out.println("Enter Integer:");
		for(int i = 0; i < s.length; i++){	
						
			s[i] = in.next();
			
			x[i] = in.nextInt();
		}
		in.close();
		System.out.println("================================");
		for(int j = 0; j < s.length; j++){
			System.out.format("%.15s", s[j]);
			System.out.format("%1602d%n", x[j]);
		}
		System.out.println("================================");
	}

}
