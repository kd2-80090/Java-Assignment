package com.app.geometry;

import java.lang.Math;

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
			String sx,sy;
			sx=Double.toString(this.x);
			sy=Double.toString(this.y);
			return "Point = ("+sx+","+sy+")";
		}
		public boolean isEqual(Point2D p) {
			if(p.x==this.x && p.y==this.y)
				return true;
			else
				return false;
		}
		public double calculateDistance(Point2D p) {
			double distance,x_sq,y_sq;
			x_sq = p.x-this.x;
			y_sq = p.y-this.y;
			distance = Math.sqrt((x_sq*x_sq)-(y_sq*y_sq));
			return distance;
		}
}
