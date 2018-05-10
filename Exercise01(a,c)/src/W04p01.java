
public class W04p01 {

	public static void main(String[] s) {
		char x[]=s[0].toCharArray();
		char y[]=s[1].toCharArray();
		System.out.println(equals(x,y));
		
	}

	private static boolean equals(char[] x, char[] y) {
		String a=new String(x);
		String b=new String(y);
		if(a.compareTo(b)==0)	return true;
		else 	return false;
		
				
	}

}
