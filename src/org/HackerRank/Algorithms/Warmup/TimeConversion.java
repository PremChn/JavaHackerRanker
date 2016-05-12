package org.HackerRank.Algorithms.Warmup;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter time in 12 hours format:");
		String Time = in.nextLine();
		in.close();
	    String[]  TimeArray = Time.split(":");
	    String AM_PM = TimeArray[2].substring(2);
	    System.out.println(AM_PM);
	    String Minutes = TimeArray[2].substring(0, 2);
	    System.out.println(Minutes);
	    int Hour = Integer.parseInt(TimeArray[0]);
	    if(AM_PM.equals("PM") && Hour != 12){
	    	Hour = Hour + 12;
	    }
	    if(TimeArray[0].equals("12") && AM_PM.equals("AM")){
	    	Hour = 00;
	    }
	    System.out.println("Military Time: " + String.format("%02d", Hour) + ":" + TimeArray[1] + ":" + Minutes );	    	       
	}
}
