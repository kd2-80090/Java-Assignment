package com.sunbeam.question1;

public class FindMinimum {
	public static <T extends Number> T findMin(T[] arr) {
			T min = arr[0];
			for (int i=0;i<arr.length;i++) {
					if(arr[i].doubleValue()<min.doubleValue()) {
						min=arr[i];
				}
			}
			return min;
		}
	public static void main(String[] args) {
		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		System.out.println("First Array : ");
		for (Integer integer : arr1) {
			System.out.print(integer+", ");
		}
		Integer min1 = findMin(arr1);
		System.out.println("\nMinimum value : "+min1);
		
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		System.out.println("Second Array : ");
		for (Double double1 : arr2) {
			System.out.print(double1+", ");
		}
		Double min2 = findMin(arr2);
		System.out.println("\nMinimum value : "+min2);
		}

}
