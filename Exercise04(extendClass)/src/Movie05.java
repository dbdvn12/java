
public class Movie05 {
	
	String title;
	String directedBy;
	String runningTime;
	String releaseDate;
	
	String[] movieData;
	public Movie05(String movie) {
		movieData=movie.split(":");
		this.title=movieData[0];
		this.directedBy=movieData[1];
		this.runningTime=movieData[2];
		this.releaseDate=movieData[3];
	}
	@Override
	public String toString() {
		return title+","+directedBy+","+runningTime+","+releaseDate;
	}
	/*
	String[] movieData;
	String ats;
	public Movie05(String movie) {
		this.movieData=movie.split(":");
	}
	void arrayToString() {
		ats=Arrays.toString(movieData);
	}
	@Override
	public String toString() {
		return ats;
	}
	*/
	
}
