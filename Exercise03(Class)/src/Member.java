
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
		return "�̸�: "+name+"\tȸ��������: "+registrationDate+"\tȸ������: "+birthDate;
	}
}
