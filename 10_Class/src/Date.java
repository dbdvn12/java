

public class Date {
	int year;
	int month;
	int day;
	public Date(int year,int month, int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	public Date() {
		
	}
	@Override
	public String toString() {
		String a=year+"³â\t"+month+"¿ù\t"+day+"ÀÏ";
		return a;
	}
}
