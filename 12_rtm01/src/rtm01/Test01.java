package rtm01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		int age=23;
		double height=175.6;
		char surname='김';
		String university="경성대학교";
		boolean flag=false;
//		int score[]= {87};
//		int score[]=new int[1];
//		score[0]=87;
//		int score[];
//		score=new int[1];
//		score[0]=87;
//		int sequence[]=new int[100];
//		for(int i=0;i<sequence.length;i++)
//			sequence[i]=i+1;
//		System.out.println(sequence[7]);
//		sum(3,4);
//		double stat[]=stat(3,4);
//		for (double d : stat) {
//			System.out.println(d);
//		}
//		int score[]= {3,4,5,6,8};
//		total(score);
//		stat(score);
//		int score2[]= {5,7,2,9,11,23};
//		concat(score,score2);
//		double x=5,y=9;
//		double z=x/y;
//		String str=String.format("%.2f", z);
//		System.out.println(str);
//		double q=x%y;
//		String x="1234";
//		String y="4321";
//		int sum=Integer.parseInt(x)+Integer.parseInt(y);
		Scanner ki=new Scanner(System.in);
//		int a;
//		a=ki.nextInt();
//		numString(a);
//		int b[] = new int[4];
//		for(int i=1;i<b.length;i++)
//			b[i]=ki.nextInt();
//		last(b);
		String s="대한독립만세";
		char c=s.charAt(2);
		int len=s.length();
		String prefix=s.substring(0, 2);
		String postfix=s.substring(s.length()-2, s.length());
		boolean flag1=s.matches("대학교");
		boolean flag2=s.startsWith("대한");
		boolean flag3=s.endsWith("대한");
		int pos=s.indexOf("독");
		int pos2=s.indexOf("독립");
		String a=ki.next();
		toCharArray(a);
		revserse(a);
		vowelCount(a);
	}

//	private static int last(int[] b) {
//		return b[b.length-1];
//	}

	private static int vowelCount(String a) {
		char[] b=a.toCharArray();
		int count=0;
		for(int i=0;i<b.length;i++) {
			char c=b[i];
			switch(c) {
				case 'a':case 'e':case 'i':case 'o':case 'u':case 'A':case 'E':case 'I':case 'O':case 'U':
					count++;
					break;
			}
		}
		return count;
	}

	private static String revserse(String a) {
		StringBuffer b=new StringBuffer();
		b.append(a);
		b=b.reverse();
		a=b.toString();
		return a;
	}

	private static char[] toCharArray(String a) {
		char[] b=a.toCharArray();
		return b;
	}

	private static String numString(int a) {
		String b=Integer.toString(a);
		return b;
		
	}

	private static int[] concat(int[] score, int[] score2) {
		int[] concat=new int[score.length+score2.length];
		System.arraycopy(score, 0, concat, 0, score.length);	//system.arraycopy(복사할소스,복사할소스의 어디서부터읽을지,저장할곳,어디서부터 저장할지,얼마나 복사할지)
		System.arraycopy(score2, 0, concat, score.length, score2.length);
		return concat;
	}

	private static int[] stat(int[] score) {
		int max=score[0];
		int min=score[0];
		int sum=0;
		for(int i=0;i<score.length;i++) {
			if(max<score[i]) max=score[i];
			if(min>score[i]) min=score[i];
			sum+=score[i];
		}
		int[] stat= {max,min,sum/score.length};
		return stat;
	}

	private static int total(int[] score) {
		int sum=0;
		for(int i=0;i<score.length;i++)
			sum+=score[i];
		return sum;
	}

	private static double[] stat(int i, int j) {
		double stat[]= {i+j,i-j,i*j,i/j};
		return stat;
		
	}

	private static void sum(int i, int j) {
		System.out.println(i+j);
		
	}
}
