
public class AudiApp {

	public static void main(String[] args) {
		AuditionApplicant		applicant=new AuditionApplicant("A-001"); // ����� ������
		applicant.setExpertScore(23); // ������ �� ���� 23�� ���
		applicant.clickLikesButton(); // ���� �� ���� 1�� �߰�
		applicant.clickLikesButton(); // ���� �� ���� 1�� �߰�
		applicant.clickLikesButton(); // ���� �� ���� 1�� �߰�
		System.out.println(applicant.getScore()); // ����� ������ ����
		System.out.println(getApplicantScore(applicant)); // ����� ������ ����
	}

	private static double getApplicantScore(AuditionApplicant applicant) {
		return applicant.score;
	}

}
