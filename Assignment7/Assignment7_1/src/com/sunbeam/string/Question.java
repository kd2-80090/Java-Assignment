package com.sunbeam.string;


/*
 * Q1. Declare two Arrays of type String. Find the duplicate values of an array of string values. (Hint:
use equals())
 */
public class Question {
	public static void main(String[] args) {
		String []arr = new String[2];
		arr[0]= new String("sunbeam");
		arr[1] =new String("Sunbeam");
//		for(int i=0;i<2;i++)
//			System.out.println(arr[i]);
//		for(String ele:arr) {
//		if(ele.equals(ele+1))
//			System.out.println("Duplicate value = "+ele);
//		else
//			System.out.println("No Duplicate value = ");
//		}
		for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])) {
        			System.out.println("Duplicate value = "+arr[i]);
                }
                else {
        			System.out.println("No Duplicate value ");
                }
                    
            }
        }
//		System.out.println(arr[0]==arr[1]);
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
	}
}
