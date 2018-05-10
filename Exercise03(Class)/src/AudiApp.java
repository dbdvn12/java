
public class AudiApp {

	public static void main(String[] args) {
		AuditionApplicant		applicant=new AuditionApplicant("A-001"); // 오디션 참가자
		applicant.setExpertScore(23); // 전문가 평가 점수 23점 등록
		applicant.clickLikesButton(); // 관객 평가 점수 1점 추가
		applicant.clickLikesButton(); // 관객 평가 점수 1점 추가
		applicant.clickLikesButton(); // 관객 평가 점수 1점 추가
		System.out.println(applicant.getScore()); // 오디션 참가자 점수
		System.out.println(getApplicantScore(applicant)); // 오디션 참가자 점수
	}

	private static double getApplicantScore(AuditionApplicant applicant) {
		return applicant.score;
	}

}
