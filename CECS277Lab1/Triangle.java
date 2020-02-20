package CECS277Lab1;
public class Triangle extends GeometricObject {
	private double side1=1.0;
	private double side2=1.0;
	private double side3=1.0;

	
	public Triangle(String name, double side1, double side2, double side3) {
		super(name);
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1=side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2=side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3=side3;
	}
	public double getPerimeter() {
		return side1+side2+side3;
	}
	
	public double getArea(){
		return (Math.sqrt(getPerimeter()*(getPerimeter()-getSide1())*(getPerimeter()-getSide2())*(getPerimeter()-getSide3())));
	}
	public String toString() {
		return "Area of a triangle: "+getArea()+"\nPerimeter of a triangle: "+getPerimeter();
	}

}
