
public class Point {
		
	int x;
	int y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		String s="x��ǥ��(x):"+x+"\ty��ǥ��(y):"+y;
		return s;
	}
}