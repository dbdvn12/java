
public class W04p03 {
	public static void main(String[] s) {
		char x[]=s[0].toCharArray();
		char y[]=s[1].toCharArray();
		System.out.println(concat(x,y));
	}

	private static char[] concat(char[] x, char[] y) {
		String a=new String(x)+new String(y);
		char[] b=a.toCharArray();
		return b;
	}
}
