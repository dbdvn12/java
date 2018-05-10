
public class Test3 {

	public static void main(String[] args) {
//		int v[]= {23,45,62};
		double w[]= {3.14,4.23};
//		String n[]= {"±è","ÀÌ","¹Ú"};
		
		int x1=23,x2=45,x3=62;
		int v[]= {x1,x2,x3};
		
		String n1=new String("±è");
		String n2="ÀÌ";
		String n3="¹Ú";
//		String n[]= {n1,n2,n3};
		String n[]= {new String("±è"),new String("ÀÌ"),new String("¹Ú")};
	}

}
