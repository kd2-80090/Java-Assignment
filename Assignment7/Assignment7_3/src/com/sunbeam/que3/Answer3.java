package com.sunbeam.que3;

import java.util.Scanner;

public class Answer3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuilder reversed = new StringBuilder(input).reverse();
        String rev=reversed.toString();
        if(input.equals(rev)) {
        	System.out.println("String is pallindrome");
        	
        }else
        System.out.println("String is not pallindrome");

	}
}
