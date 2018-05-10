import javax.swing.JOptionPane;

public class Test1 {

	public static void main(String[] args) {
		
		int x=4;
		//int y=2*x*x-3*x+7;
		int y=f(x);
		System.out.println(x);
		System.out.println(y);
				
	}

	private static int f(int x) {	//static

		return 2*x*x-3*x+7;
	}

}
