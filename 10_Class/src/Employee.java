
public class Employee {
	public Employee(String name, char gender, int age, double eyeSight, boolean foreighnerYN) {
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.eyeSight=eyeSight;
		this.foreighner=foreighnerYN;
	}
	String name;
	char gender;
	int age;
	double eyeSight;
	boolean foreighner;
	@Override
	public String toString() {
		String s="�̸�:"+name+"\t����:"+gender+"\t����:"+age+"\t�÷�:"+eyeSight+"\t�ܱ��� ����:"+foreighner;
		return s;
	}
}
