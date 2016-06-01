package org.HackerRank.Tutorial.ThirtyDaysOfCode;

abstract class AbstractBook {
	String title;
	String author;

	AbstractBook(String t, String a){
		title = t;
		author = a;
	}
	
	abstract void display();
}
