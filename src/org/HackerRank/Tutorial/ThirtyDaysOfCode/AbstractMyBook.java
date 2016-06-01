package org.HackerRank.Tutorial.ThirtyDaysOfCode;

class AbstractMyBook extends AbstractBook {
	int Bookprice;

	AbstractMyBook(String title, String author, int bookPrice) {
		super(title, author);
		this.Bookprice = bookPrice;
	}

	void display() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + Bookprice);
	}

}