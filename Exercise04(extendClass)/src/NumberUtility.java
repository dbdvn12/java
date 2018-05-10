
public class NumberUtility {
	int x;
	int y;
	public NumberUtility(int x, int y) {
		this.x=x;
		this.y=y;		
	}
	static int add (int x,int y) {
		return x+y;
	}
	public static int abs(int i) {
		return Math.abs(i);
		
	}
	public static int add(int[] a) {
		int sum = 0;
		for (int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	public static Stat stat(int[] a) {
		int max=a[0],min=a[0],sum = 0;
		for (int i=0;i<a.length;i++) {
			if(max<a[i]) max=a[i];
			if(min>a[i]) min=a[i];
			sum+=a[i];
		}
		Stat stat=new Stat();
		stat.max=max;
		stat.min=min;
		stat.sum=sum;
		stat.avg=sum/a.length;
		return stat;
	}
}
