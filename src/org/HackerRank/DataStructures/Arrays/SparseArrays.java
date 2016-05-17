package org.HackerRank.DataStructures.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SparseArrays {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter total no. of strings:");
		int strLen = in.nextInt();
		
		List<String> str = new ArrayList<String>();
		List<String> qry = new ArrayList<String>();
		System.out.println("Enter String:");
		for(int i = 0; i < strLen; i++){
			str.add(in.next());			
		}
		System.out.println("Enter Query:");
		int qryLen = in.nextInt();	
		for(int j = 0; j < qryLen; j++){
			qry.add(in.next());
		}
		in.close();
		
		for(String q : qry){
			int cnt = 0;
			for(String s : str){
				if(s.equals(q)) cnt++;
			}
			System.out.println(cnt);
		}
	} 

}
