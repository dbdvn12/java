package modifyMidTest;

public class KorNameUtil {

	public static KorName[] getKorNames(String s) {
		String[] v=s.split(":");
		KorName[] names=new KorName[v.length];
		for(int i=0;i<v.length;i++) {
			char firstSyllable=v[i].charAt(0);
			char secondSyllable=v[i].charAt(1);
			char thirdSyllable=v[i].charAt(2);
			names[i]=new KorName(firstSyllable,secondSyllable,thirdSyllable);
		}
		return names;
	}

}
