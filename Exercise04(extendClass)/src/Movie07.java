
public class Movie07 {
	String title;
	String directedBy;
	int runningTime;
	Date07 releaseDate;
	
	public Movie07(String title, String directedBy, int runningTime, Date07 releaseDate) {
		this.releaseDate=releaseDate;
		this.title=title;
		this.directedBy=directedBy;
		this.runningTime=runningTime;
	}
	@Override
	public String toString() {		
		return title+","+directedBy+","+runningTime+","+releaseDate;
	}

}
