package com.app.fruits;

public class Fruit {
	private String color;
	private double weignt;
	private String name;
	boolean isFresh=true;
	
	public Fruit() {
		this("Fruit",10,"White");
	}

	public Fruit(String name, double weignt, String color) {
		this.name = name;
		this.weignt = weignt;
		this.color = color;
//		boolean isFresh;
//		this.isFresh = isFresh;
	}
	
	
	@Override
	public String toString() {
		String s;
		if(isFresh==true)
			s="Fruits are fresh";
		else
			s="Fruits are not fresh";
		return "Fruit [Name =" + name + ", Weignt=" + weignt + ", Color=" + color +", "+s;
	}

	public String taste(){
		return "";
	}
	public String getColor() {
		return color;
	}

	public double getWeignt() {
		return weignt;
	}

	public String getName() {
		return name;
	}

	public boolean getisFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	
}
