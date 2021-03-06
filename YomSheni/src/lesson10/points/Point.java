package lesson10.points;

import java.io.Serializable;

/**
 * Point - a class with three versions 
 * @author erelsgl
 */
public class Point implements Serializable {
	private static final long serialVersionUID = 3;

	double x, y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
}
