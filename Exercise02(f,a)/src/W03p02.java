import java.util.Scanner;

public class W03p02 {

	public static void main(String[] args) {
		Scanner ki=new Scanner(System.in);
		int n1=ki.nextInt();
		int n2=ki.nextInt();
		int min=min(n1,n2);
		System.out.println(min);
	}

	private static int min(int n1, int n2) {
		if(n1>n2) return n2;
		else return n1;
	}
}
