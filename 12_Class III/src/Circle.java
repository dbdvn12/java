
public class Circle {
	static double PI=3.14;
	double radius;
	public void setRadius(double radius) {
		this.radius=radius;		
	}
	public double calculateArea() {
		return Circle.PI*radius*radius;
	}	
	
}
