package org.HackerRank.Tutorial.ThirtyDaysOfCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesAndMaps {
	public static void main(String args[]){
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter total no. of contents in Dictionary:");
		int N = in.nextInt();
		System.out.println("Enter Name and Phone Number: ");
		for(int i = 0; i < N; i++){
			String name = in.next();
			int phoneNo = in.nextInt();
			phoneBook.put(name, phoneNo);
		}
		//phoneBook.forEach((name, phoneNo) -> System.out.println("Key : " + name + " Value : " + phoneNo));
		while(in.hasNext()){
            String s = in.next();
            // Write code here
            phoneBook.forEach((name, phoneNo) -> {       	
	            if(s.equals(name)){        		
	        		System.out.println(name + "=" + phoneNo);
	        	}
	            else{
	            	System.out.println("Not found");
	            }
            });         
        }
		
		in.close();
	}

}
