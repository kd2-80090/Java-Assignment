package com.box;

import com.sunbeam.que1.Employee;

public class Box<T extends Employee> {
	private T obj;
	
	public Box() {
		this.obj = null;
	}
	public Box(T t) {
		this.obj = t;
	}

	public T getT() {
		return obj;
	}

	public void setT(T t) {
		obj = t;
	}
	
	public double getTotalSal() {
		return  obj.calcTotalSalary();
	}
}

