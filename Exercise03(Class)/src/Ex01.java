import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
			
		Student s;
		s=new Student("ÀÌ¿µÈñ",95);
		System.out.println(s);
		String v=getString(s);
		Student sArray[]= {s};
		
		String v1=getString(sArray);
		System.out.println(v1);
		
		Student s1=new Student("±èÃ¶¼ö", 91);
		Student	s2=new Student("¹Ú¿µÈñ", 92);
		Student s3=new Student("È«±æµ¿", 88);
		Student w[]= {s1,s2,s3};
		double a=getAverage(w);
		System.out.println(a);
		int[] n=getScore(w);
	}
	private static int[] getScore(Student[] w) 
	{
		int n[]=new int[w.length];
		for (int i=0; i>w.length;i++) {
			n[i]=w[i].score;
		}
		return n;
	}
	private static String getString(Student s) 
	{
		String a=s.name+","+s.score;
		return a;
	}
	private static String getString(Student[] sArray) 
	{
		String a=sArray[0].name+","+sArray[0].score;
		return a;
		
	}
	private static double getAverage(Student[] w) 
	{
		int sum = 0;
//		for (int i=0;i<w.length;i++) {						
//			sum+=w[i].score;
//		}
		for (Student student : w) {
			sum+=student.score;
		}
		return sum/w.length;
	}

}