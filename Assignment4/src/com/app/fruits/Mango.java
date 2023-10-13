package com.app.fruits;

public class Mango extends Fruit {
	public Mango() {
		
	}

	public Mango(String name, double weignt, String color) {
		super(name, weignt, color);
	
	}

//	@Override
//	public String toString() {
//		return super.toString();
//	}
	
	@Override
	public String taste() {
		return "Mangoes are sweet...!";
	}

	@Override
	public String toString() {
		return " : Mango "+super.toString()+", "+ taste() + "]";
	}
}
