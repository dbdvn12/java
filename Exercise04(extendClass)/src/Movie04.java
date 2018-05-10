
public class Movie04 {
	String title;
	String directedBy;
	int runningTime;
	String releaseDate;
	public Movie04(String title, String directedBy, int runningTime, String releaseDate) {
		this.title=title;
		this.directedBy=directedBy;
		this.runningTime=runningTime;
		this.releaseDate=releaseDate;
	}
	public String chTime () {	
		String runTime=runningTime/60+"시간"+runningTime%60+"분";
		return runTime;
	}
	public StringBuffer sb () {
		StringBuffer sb=new StringBuffer(releaseDate);
		sb.insert(4, "년");
		sb.insert(7, "월");
		sb.insert(10, "일");
		return sb;		
	}
	@Override
	public String toString() {		
		return "제목:"+title+"\n감독:"+directedBy+"\n상영시간:"+chTime()+"\n개봉일:"+sb();
	}
	
}
