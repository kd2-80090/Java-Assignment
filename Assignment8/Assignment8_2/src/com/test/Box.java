
package com.test;

public class Box<T> {
	private T obj;

	public Box() {
		
	}
	public Box(T obj) {
		this.obj = obj;
	}
	public T getT() {
		return this.obj;
	}
	public void setT(T t) {
		this.obj=t;
	}
}
