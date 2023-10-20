package com.sunbeam.employee;

public class Labor implements Emp{
	private double hour;
	private double rate;
	
	
	public Labor() {
		this(0.0,0.0);
	}
	
	public Labor(double hour, double rate) {
		this.hour = hour;
		this.rate = rate;
	}
	
	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public double getSal() {
		return this.hour*this.rate;
	}
	
	@Override
	public double calcIncentives() {
		if(this.hour>300.0)
			return 0.05*this.hour*this.rate;
		return 0.0;
	}
	
	
}
