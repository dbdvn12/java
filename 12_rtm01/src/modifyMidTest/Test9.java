package modifyMidTest;

public class Test9 {
	public static void main(String[] args) {
		String	s="��ö��:�̿���:�ڵ���:������"; // ������. �̸� ������ 4�� �������� �� ��
		KorName	names[]=KorNameUtil.getKorNames(s);
		System.out.println(names[1].firstSyllable+"-"+names[1].secondSyllable+"-"+names[1].thirdSyllable);
	}
}
