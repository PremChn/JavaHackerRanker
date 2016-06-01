package org.HackerRank.Tutorial.ThirtyDaysOfCode;

import java.util.Scanner;

public class AbstractSolution {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String title = sc.next();
		String author = sc.next();
		int price = sc.nextInt();
		
		AbstractMyBook newNovel = new AbstractMyBook(title, author, price);
		newNovel.display();
	}

}
