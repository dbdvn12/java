import java.util.Scanner;

public class W03p08 {

	public static void main(String[] args) {
		
		Scanner ki=new Scanner(System.in);
		char x[]=ki.next().toCharArray();
		char z[]=prefix(x,3);
		System.out.println(z);

	}

	private static char[] prefix(char[] x, int i) {
		char a[]=new char[i];
		for(int s=0; s<i; s++) {
			a[s]=x[s];
		}
		return a;
	}

}
