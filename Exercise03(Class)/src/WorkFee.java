
public class WorkFee {
	public static void main(String[] args) {
	Employee emp=new Employee("E-123"); // ����
	emp.registerDaysWorked(); // �ٹ��� 1�� �߰�
	emp.registerDaysWorked(); // �ٹ��� 1�� �߰�
	emp.registerOvertimeWorkingHours(3); // �ʰ� �ٹ� 3�ð� ���
	System.out.println(emp.getSalaryEstimation()); // ������ �޿� ���
	}
}