

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
		String s="국어:"+langScore+",영어:"+engScore+",수학:"+mathScore;
		return s;
	}
}
