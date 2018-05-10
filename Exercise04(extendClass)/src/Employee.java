
public class Employee extends Person{
	String jobTitle;
	int annualIncome;
	boolean foreignerYN;
	
	public Employee(String id, String name, String jobTitle, int annualIncome, boolean foreignerYN) {
		super(id,name);
		this.jobTitle=jobTitle;
		this.annualIncome=annualIncome;
		this.foreignerYN=foreignerYN;
	}
	@Override
	public String toString() {
		return super.toString()+","+jobTitle+","+annualIncome+","+foreignerYN;
	}
	
}
