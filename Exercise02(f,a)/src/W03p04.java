import java.util.Scanner;

public class W03p04 {

	public static void main(String[] args) {
		Scanner ki=new Scanner(System.in);
		int n[]=new int[5];
		for(int i=0;i<n.length;i++) {
			n[i]=ki.nextInt();
		}
		max(n);
		System.out.println(max(n));
	}

	private static int max(int[] n) {
		int max=0;
		for(int i=0;i<n.length;i++) {			
			if(n[i]>max) max=n[i];
		}
		return max;
	}
}
