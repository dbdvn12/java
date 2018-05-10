
public class Member {
	public Member(String name, Date date) {
		this.name=name;
		this.date=date;
	}

	String name;
	Date date;
	@Override
	public String toString() {
		return "이름:"+name+"\t가입일자:"+date;
		
	}
}
