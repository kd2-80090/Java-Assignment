package com.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesterRandomNoSum {
	
	public static void main(String[] args) {
		Random r = new Random();
		Stream<Integer> strm  = Stream.generate(() -> r.nextInt(10)).limit(10);
		List<Integer>randomNumbers = strm.collect(Collectors.toList());
		randomNumbers.forEach(ele->System.out.println("Random Numbers : " +ele));
		
		int sum =  randomNumbers.stream().reduce(0, (a,e)->a+e);
		System.out.println("Sum of 10 random numbers = "+sum);		
		
//		int sum = strm.reduce(0, (a,e) -> a+e);
//		System.out.println("Sum = "+sum);	
		
//		Streams are immutable
//		Once called Terminal operations you can't access that stream further
	}
}
