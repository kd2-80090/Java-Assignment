package com.sunbeam.question2;

import java.util.Comparator;

class DComparator implements Comparator<Double>{

	@Override
	public int compare(Double s1, Double s2) {
		int diff = Double.compare(s1, s2);
		return diff;
	}
}
public class SelectionSort {
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					}
				}
			}
		}
	public static void main(String[] args) {
		Double arr[]=new Double[] {3.3,5.5,4.4,2.2,1.1};
		DComparator sortComparator = new DComparator();
		System.out.println("Before Sorting : ");
		System.out.print("[");
		for (Double element : arr) {
			System.out.print(" " + element+",");
		}
		System.out.println("]");
		SelectionSort.selectionSort(arr, sortComparator);
		System.out.println("\nAfter Sorting : ");
		System.out.print("[");
		for (Double element : arr) {
			System.out.print(" " + element+",");
		}
		System.out.println("]");
	}
}
