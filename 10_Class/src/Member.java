
public class Member {
	public Member(String name, Date date) {
		this.name=name;
		this.date=date;
	}

	String name;
	Date date;
	@Override
	public String toString() {
		return "�̸�:"+name+"\t��������:"+date;
		
	}
}
