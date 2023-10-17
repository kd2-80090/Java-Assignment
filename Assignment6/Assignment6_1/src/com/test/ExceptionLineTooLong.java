package com.test;

import java.util.Arrays;

public class ExceptionLineTooLong extends Exception{
	private String fieldInput;
	public ExceptionLineTooLong() {
		
	}
//	public ExceptionLineTooLong(String fieldInput) {
//		super();
//		this.fieldInput = fieldInput;
//	}
	public ExceptionLineTooLong(String message) {
		super(message);
		this.fieldInput = fieldInput;
	}
	@Override
	public String toString() {
		return "ExceptionLineTooLong ["+getMessage()+" Input=" + fieldInput + "]";
	}
	
}