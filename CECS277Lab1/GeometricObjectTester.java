package CECS277Lab1;
import java.util.ArrayList;
public class GeometricObjectTester {
	public static void main(String[] args) {
		ArrayList<GeometricObject> geoObj = new ArrayList<GeometricObject>();
		geoObj.add(new Circle("Circle 1", 5));
		geoObj.add(new Circle("Circle 2", 3));
		geoObj.add(new Circle("Circle 3", 10));
		geoObj.add(new Rectangle("Rectangle 1", 3, 4));
		geoObj.add(new Rectangle("Rectangle 2", 6, 7));
		geoObj.add(new Rectangle("Rectangle 3", 10, 12));
		geoObj.add(new Triangle("Triange 1", 1 ,2 ,3));
		geoObj.add(new Triangle("Triangle 2", 4, 6, 9));
		geoObj.add(new Triangle("Triangle 3", 9, 12, 14));
		Circle circle = new Circle();
		geoObj.add(circle);
		int index = geoObj.indexOf(circle);
		Object circle1 = geoObj.get(index);
		for(int i=0;i<geoObj.size()-1;i++) {
			if(circle1 instanceof Circle) {
				((Circle)circle1).getDiameter();
			}
			System.out.println(geoObj.get(i));
		}
	}
}
