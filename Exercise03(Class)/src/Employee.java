
public class Employee {
	
	String id;
	int worktime;
	
	public Employee(String id) {
		this.id=id;
	}
	public void registerDaysWorked() {
		worktime+=8;
	}
	public void registerOvertimeWorkingHours(int i) {
		worktime+=i;
		
	}
	public int getSalaryEstimation() {
		return worktime*8000;
	}
}
