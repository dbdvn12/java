	
public class AuditionApplicant {
	String id;
	double score;
	
	public AuditionApplicant(String id) {
		this.id=id;
	}
	public void setExpertScore(int i) {
		score+=i;
	}
	public void clickLikesButton() {
		score+=1;
	}
	public double getScore() {
		return score; 
	}
	
	

}
