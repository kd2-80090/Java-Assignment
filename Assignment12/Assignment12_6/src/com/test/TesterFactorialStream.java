package com.test;

import java.util.stream.Stream;

public class TesterFactorialStream {
	
	public static void main(String[] args) {
		Stream<Integer> strm  = Stream.iterate(1, ele ->ele+1).limit(6);
		Integer factorial = strm.reduce(1, (a,e) -> a*e);
		System.out.println("Factorial of 6 = "+factorial);
	}
}
