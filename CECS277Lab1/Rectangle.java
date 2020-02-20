package CECS277Lab1;
public class Rectangle extends GeometricObject {
	private double width;
	private double height;
	public Rectangle(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return getHeight() * getWidth();
	}
	public double getPerimeter() {
		return (2 * getHeight()) + (2 * getWidth());
	}
	public String toString() {
		String rectangle = "";
		return rectangle += "Area of Rectangle: " + getArea() + "\nPerimeter of Rectangle: " + getPerimeter();
	}
}
