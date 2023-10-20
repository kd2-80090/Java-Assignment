package com.test;

import java.util.stream.IntStream;

public class TesterIntStream {
	
	public static void main(String[] args) {
		//Stream <Integer> wrapper type stream,
		//IntStream primitive type stream
//		IntStream strm1 = IntStream.range(1, 10);			
		//for --exclusive 10 --use IntStream.range(1,10)
		
		IntStream strm1 = IntStream.rangeClosed(1, 10);		//inclusive 10
		//for --inclusive 10 --use IntStream.range(1,10)

		int total = strm1.sum();
		System.out.println("Total of Number from 1 to 10 = "+total);
		IntStream strm2 = IntStream.rangeClosed(1, 10);
		System.out.println(strm2.summaryStatistics());
	}
}
