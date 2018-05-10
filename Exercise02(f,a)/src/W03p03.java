import java.util.Scanner;

public class W03p03 {
	public static void main(String[] args) {
		Scanner ki=new Scanner(System.in);
		int n[]=new int[5];
		for(int i=0;i<n.length;i++) {
			n[i]=ki.nextInt();
		}
		int sum=sum(n);
		System.out.println(sum);
	}

	private static int sum(int[] n) {
		int sum=0;
		for(int i=0 ; i<n.length;i++)
			sum=sum+n[i];
		return sum;
	}
}
