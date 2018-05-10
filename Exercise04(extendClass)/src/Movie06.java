
public class Movie06 {
	String title;
	String directedBy;
	int runningTime;
	String releaseDate;
	
	public Movie06(String title, String directedBy, int runningTime, String releaseDate) {
		this.title=title;
		this.directedBy=directedBy;
		this.runningTime=runningTime;
		this.releaseDate=releaseDate;
	}
	public Movie06() {
		
	}
	@Override
	public String toString() {
		return title+","+directedBy+","+runningTime+","+releaseDate;
	}
	
}
