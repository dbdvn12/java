
public class Movie03 {
	String title;
	String directedBy;
	int runningTime;
	String releaseDate;
	public Movie03(String title, String directedBy, int runningTime, String releaseDate) {
		this.title=title;
		this.directedBy=directedBy;
		this.runningTime=runningTime;
		this.releaseDate=releaseDate;
	}
	@Override
	public String toString() {
		return title+","+directedBy+","+runningTime+","+releaseDate;
	}
}
