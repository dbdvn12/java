

public class Score {
	public
		int langScore;
		int engScore;
		int mathScore;
	
	public Score(int langScore, int engScore, int mathScore) {
		this.langScore=langScore;
		this.engScore=engScore;
		this.mathScore=mathScore;
	}

	public Score() {
		
	}

	@Override
	public String toString() {
		String s="����:"+langScore+",����:"+engScore+",����:"+mathScore;
		return s;
	}
}
