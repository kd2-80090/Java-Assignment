package com.app.fruits;

public class Orange extends Fruit {
	public Orange() {
		
	}

	public Orange(String name, double weignt, String color) {
		super(name, weignt, color);
	}

//	@Override
//	public String toString() {
//		return super.toString();
//	}
	
	@Override
	public String taste() {
		return "Oranges are sour...!";
	}

	@Override
	public String toString() {
		return " : Orange ="+super.toString()+", "+taste()  + "]";
	}
}
