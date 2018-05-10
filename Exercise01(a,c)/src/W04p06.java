
public class W04p06 {

	public static void main(String[] s) {
		boolean palindromeYN=palindromeYN(s[0]);
		System.out.println(palindromeYN);

	}

	private static boolean palindromeYN(String string) {
		if(string.charAt(0)==string.charAt(string.length()-1))	return true;
		else return false;
			
	}

}
