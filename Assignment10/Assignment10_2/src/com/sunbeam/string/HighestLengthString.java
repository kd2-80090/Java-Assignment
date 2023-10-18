package com.sunbeam.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 2. Create a list of strings. 
 * Find the string with highest length using Collections.max()
 */

public class HighestLengthString {
	public static void main(String[] args) {
		List<String>list = new ArrayList<>();
		Collections.addAll(list, "Nilesh","Sunbeam","Cat","Hello","WeAreHereToGetKNOWLEDGE");
		class HighestLenStringComparator implements Comparator<String> {
			@Override
			public int compare(String s1, String s2) {
				int diff = Integer.compare(s1.length(),s2.length());
				return diff;
			}
			
		}
		HighestLenStringComparator comparator = new HighestLenStringComparator();
		System.out.println(Collections.max(list, comparator));
	}
}
