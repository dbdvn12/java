
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
		String s="이름:"+name+"\t성별:"+gender+"\t나이:"+age+"\t시력:"+eyeSight+"\t외국인 여부:"+foreighner;
		return s;
	}
}
