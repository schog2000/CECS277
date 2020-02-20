package CECS277Lab1;
public class Circle extends GeometricObject {
	private double radius;
	public Circle() {
		
	}
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getDiameter() {
		return getRadius() * 2;
	}
	public double getArea() {
		return (Math.PI * getRadius() * getRadius());
	}
	public double getPerimeter() {
		return (getDiameter() * Math.PI);
	}
	public String toString() {
		String circle = "";
		return circle += "Area of circle: " + getArea() + "\nPerimeter of circle: " + getPerimeter() + "\nDiameter: " + getDiameter();
	}

}
