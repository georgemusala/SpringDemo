package org.koushik.javabrains;

public class Circle implements Shape{
	private Point center;
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw()
	{
		System.out.println("Drawing circle:");
		System.out.println("Center point = (" + getCenter().getX() + "," + getCenter().getY() + ")");
	}
}
