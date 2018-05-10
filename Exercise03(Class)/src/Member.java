
public class Member {
	String name;
	Date registrationDate;
	Date birthDate;
	public Member(String name, Date registDate, Date birthDate) {
		this.name=name;
		this.registrationDate=registDate;
		this.birthDate=birthDate;
	}	
	
	@Override
	public String toString() {
		return "이름: "+name+"\t회원가입일: "+registrationDate+"\t회원생일: "+birthDate;
	}
}
