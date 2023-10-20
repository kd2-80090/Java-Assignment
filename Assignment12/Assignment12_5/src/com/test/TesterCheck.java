package com.test;

import com.functioninterface.Check;

public class TesterCheck {
	public static <T> int countIf(T[] arr,T key, Check<T> c) {
		int count = 0;
		for(T ele: arr) {
			if(c.compare(ele,key)) 
			count++;
		}	
		return count;
		}
	public static void main(String[] args) {
		Double [] arr = {4.4, 7.7, 9.9, 2.2, 5.5, 6.6,4.4};
		Double key = 4.4; 
		int cnt = countIf(arr, key, (e,k)-> e.equals(k));
		System.out.println("Count = " + cnt); // 4 (because 4 elements in array are greater than given key i.e. 50)

	}
}
