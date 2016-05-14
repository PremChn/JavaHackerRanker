package org.HackerRank.Java.Introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
	static Scanner input = new Scanner(System.in);
	static boolean flag = true;
	static int breadth = input.nextInt();
	static int height = input.nextInt();

	static{
	    try{
	        if(breadth <= 0 || breadth <= 0){
	            flag = false;
	            throw new Exception("Breadth and height of parallelogram must be positive");
	        }
	        else{
	        	int AreaOfParallelogram = breadth * breadth;
	    		System.out.println("Area of parallelogram: " + AreaOfParallelogram);
	        }
	    }catch(Exception e){
	        System.out.println(e);
	    }

	}
	public static void main(String args[]){
		
	}
}
