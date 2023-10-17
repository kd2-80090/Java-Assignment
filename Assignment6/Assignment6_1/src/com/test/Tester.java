package com.test;

import java.io.InputStream;

import com.inputstring.InputString;

public class Tester {
	public static void main(String[] args) {
		try {
			InputString string1 = new InputString("okayyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
//			System.out.println(string1);
		}
		catch(ExceptionLineTooLong e)
		{
//			e.printStackTrace();
		System.out.println(e);
		}
	}
}
