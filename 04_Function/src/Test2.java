
public class Test2 {
	public static void main(String[] args) {
		int x=44, y=55;
		
		int z=max(x,y);
		System.out.println(z);
	}

	private static int max(int x, int y) {
		if(x>y) return x;
		else return y;
	}
}
