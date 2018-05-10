package modifyMidTest;

public class Test9 {
	public static void main(String[] args) {
		String	s="김철수:이영희:박동수:김정희"; // 예시임. 이름 개수를 4로 한정하지 말 것
		KorName	names[]=KorNameUtil.getKorNames(s);
		System.out.println(names[1].firstSyllable+"-"+names[1].secondSyllable+"-"+names[1].thirdSyllable);
	}
}
