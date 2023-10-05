package org.HackerRank.Java.Introduction;

import java.util.Scanner;

public class JavaEndOfFile {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int lineNumber = 1;
		String Fileoutput = " ";
		while(sc.hasNext()){
			
			String input = sc.nextLine();
			Fileoutput += lineNumber + " " + input + "\n";
			lineNumber++;
		}
		System.out.println(Fileoutput);
		sc.close();
	}
}
