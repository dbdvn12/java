
public class Test2 {
	public static void main(String[] args) {
		System.out.println(Circle.PI);
		Circle circle=new Circle();
		circle.setRadius(5);
		System.out.println(circle.calculateArea());
	}
}
