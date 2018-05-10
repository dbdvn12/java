import java.util.Scanner;

public class W03p05 {

	public static void main(String[] args) {
		Scanner ki=new Scanner(System.in);
		int n[]=new int[5];
		for(int i=0;i<n.length;i++) {
			n[i]=ki.nextInt();
		}
		min(n);
		System.out.println(min(n));
	}

	private static int min(int[] n) {
		int min=n[0];
		for(int i=0;i<n.length;i++) {			
			if(n[i]<min) min=n[i];
		}
		return min;
	}
}
