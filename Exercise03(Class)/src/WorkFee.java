
public class WorkFee {
	public static void main(String[] args) {
	Employee emp=new Employee("E-123"); // 직원
	emp.registerDaysWorked(); // 근무일 1일 추가
	emp.registerDaysWorked(); // 근무일 1일 추가
	emp.registerOvertimeWorkingHours(3); // 초과 근무 3시간 등록
	System.out.println(emp.getSalaryEstimation()); // 현시점 급여 계산
	}
}