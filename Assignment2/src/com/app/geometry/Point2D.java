package com.app.geometry;

public class Point2D {
		double x;
		double y;
		public Point2D() {
			this(0.0,0.0);
		}
		public Point2D(double x, double y) {
			this.x = x;
			this.y = y;
		}
		public double getX() {
			return x;
		}
		public void setX(double x) {
			this.x = x;
		}
		public double getY() {
			return y;
		}
		public void setY(double y) {
			this.y = y;
		}
		public String getDetails() {
			
			return "";
		}
		boolean isEqual() {
			if(10==10)
				return true;
			else
				return false;
		}
}
