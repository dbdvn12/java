
public class pr4 {

	public static void main(String[] args) {
		
		int x[]= {56, 46, 12, 63, 12};
		double avg=average(x);
		System.out.println(avg);

	}

	private static double average(int[] x) {
		
		double sum=0;
		for(int i=0 ; i<x.length;i++)
			sum=sum+x[i];
		return sum/x.length;
	}

}
