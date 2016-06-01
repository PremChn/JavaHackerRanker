package org.HackerRank.Tutorial.ThirtyDaysOfCode;

import java.util.Arrays;

public class ScopeDifference {
	private int[] elements;
	public int maximumDifference;
	
	ScopeDifference(int[] elements){
		this.elements = elements;
	}

	public int computeDifference(){
		Arrays.sort(elements);
		maximumDifference = elements[(elements.length) - 1] - elements[0];
		return maximumDifference;
	}
}
