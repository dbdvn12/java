import java.util.Scanner;

public class W03p09 {

	public static void main(String[] args) {
		Scanner ki=new Scanner(System.in);
		char x[]=ki.next().toCharArray();
		char z[]=consonant(x);
		System.out.println(z);
	}

	private static char[] consonant(char[] x) {
		String s=new String(x);
		String s1=s.replaceAll("a", "");
		String s2=s1.replaceAll("e", "");
		String s3=s2.replaceAll("i", "");
		String s4=s3.replaceAll("o", "");
		String s5=s4.replaceAll("u", "");
		String s6=s5.replaceAll("A", "");
		String s7=s6.replaceAll("E", "");
		String s8=s7.replaceAll("I", "");
		String s9=s8.replaceAll("O", "");
		String s0=s9.replaceAll("U", "");
		
		char a[]=s9.toCharArray();
		
		
		return a;
	}
}
