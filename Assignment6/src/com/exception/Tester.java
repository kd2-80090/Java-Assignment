package com.exception;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try {
//			InputString string1 = new InputString("okay");
//			System.out.println(string1);
			InputString string2 = new InputString("hbbbbbbbbbbbbbbbbhvjddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddbbbbbbbbbbbbbbbbbbbbbbbdvs");	
		
		}
		catch(ExceptionLineTooLong e)
		{
//			e.printStackTrace();
		System.out.println(e);
		}
	}
}
