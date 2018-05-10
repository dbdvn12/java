import java.util.Scanner;

public class W03p07 {

	public static void main(String[] args) {
		
		Scanner ki=new Scanner(System.in);
		int x[]=new int[3];
		int y[]=new int[3];
		int z[]=new int[3];
		
		for(int i=0;i<x.length;i++) {
			x[i]=ki.nextInt();
		}
		
		for(int i=0;i<y.length;i++) {
			y[i]=ki.nextInt();
		}
		
		for(int i=0;i<z.length;i++) {
			z[i]=ki.nextInt();
		}
		
		int add[]=add(add(x,y),z);
		
		for(int i=0;i<add.length;i++) {
			System.out.println(add[i]+" ");
		}

	}

	private static int[] add(int[] x, int[] y) {
		int add[]=new int[3];
		for (int i=0;i<add.length;i++) {
			add[i]=x[i]+y[i];			
		}
		return add;
	}

}
