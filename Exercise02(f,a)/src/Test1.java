
public class Test1 {
	public static void main(String[] args) {
		char x[]= {'s','e','o','u','l'};
		String a=new String(x);
		String s1=a.replaceAll("a", "");
		String s2=s1.replaceAll("e", "");
		String s3=s2.replaceAll("i", "");
		String s4=s3.replaceAll("o", "");
		String s5=s4.replaceAll("u", "");
		System.out.println(s5);
		
	}
}
