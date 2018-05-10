package modifyMidTest;

public class NumberTool {
	public static int[] add(int[] a,int[] b) {
		int shortlen;
		int[] mlong;
		if(a.length>b.length) {
			shortlen=b.length;
			mlong=a;
		}
		else {
			shortlen=a.length;
			mlong=b;
		}
		int[] z=new int[mlong.length];
		for(int i=0;i<shortlen;i++) {
			z[i]=a[i]+b[i];
		}
		for(int i=shortlen;i<mlong.length;i++)
			z[i]=mlong[i];
		return z;
	}
}
