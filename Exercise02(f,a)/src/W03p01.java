import java.util.Scanner;

public class W03p01 {
	public static void main(String[] args) {
		Scanner ki=new Scanner(System.in);
		int n1=ki.nextInt();
		int n2=ki.nextInt();
		int sum=sum(n1,n2);
		System.out.println(sum);
	}

	private static int sum(int n1, int n2) {
		
		return n1+n2;
	}
}
