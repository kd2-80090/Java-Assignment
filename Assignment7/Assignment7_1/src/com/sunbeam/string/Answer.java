package com.sunbeam.string;

public class Answer {
	public static void main(String[] args) {
		String []arr = new String[2];
		arr[0]= new String("sunbeam");
		arr[1] =new String("sunbeam");
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
	}
}
