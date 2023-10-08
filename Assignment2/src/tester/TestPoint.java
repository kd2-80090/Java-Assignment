package tester;

import com.app.geometry.Point2D;
import java.lang.Math;

public class TestPoint {

	public static void main(String[] args) {
		Point2D point1 = new Point2D(4.8,5.6);
		Point2D point2 = new Point2D(7.2,6.3);
		Point2D point3 = new Point2D(7.2,6.3);
		System.out.println(point1.getDetails());
		System.out.println(point2.getDetails());
		System.out.println(point2.isEqual(point3));
		System.out.println(point3.getDetails());
		System.out.println(point2.getDetails());
		System.out.println("Distance is "+point2.calculateDistance(point3));
	}
}
