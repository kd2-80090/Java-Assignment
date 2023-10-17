package com.inputstring;

import com.test.*;

public class InputString {
	String input;

	public InputString(String input) throws ExceptionLineTooLong {
		if(input.length()>80)
			throw new ExceptionLineTooLong("String lentgh should be less than 80 character");
		this.input = input;
	}

	@Override
	public String toString() {
		return " [input=" + input + "]";
	}
	
}