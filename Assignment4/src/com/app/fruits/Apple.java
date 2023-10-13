package com.app.fruits;

public class Apple extends Fruit {
	public Apple() {
		
	}

	public Apple(String name, double weignt, String color) {
		super(name, weignt, color);
	}

//	@Override
//	public String toString() {
//		return super.toString();
//	}
	
	@Override
	public String taste() {
		return "Apple is sweet n sour...!";
	}

	@Override
	public String toString() {
		return " : Apple " +super.toString()+", "+taste() + "]";
	}
}
