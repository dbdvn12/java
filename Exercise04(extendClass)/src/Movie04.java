
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
		String runTime=runningTime/60+"�ð�"+runningTime%60+"��";
		return runTime;
	}
	public StringBuffer sb () {
		StringBuffer sb=new StringBuffer(releaseDate);
		sb.insert(4, "��");
		sb.insert(7, "��");
		sb.insert(10, "��");
		return sb;		
	}
	@Override
	public String toString() {		
		return "����:"+title+"\n����:"+directedBy+"\n�󿵽ð�:"+chTime()+"\n������:"+sb();
	}
	
}
