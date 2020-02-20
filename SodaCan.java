public class SodaCan {
	private double height;
	private double radius;
	
	public SodaCan() {}
	public void setHeight(double newHeight) {
		height = newHeight;
	}
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	public double getSurfaceArea() {
		return (2 * (Math.PI) * radius * height) + (2 * (radius*radius) * Math.PI);
	}
	public double getVolume() {
		return ((Math.PI) * (radius*radius) * height);
	}

}

