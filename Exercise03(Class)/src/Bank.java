
public class Bank {

	public static void main(String[] args) {
		BankAccount	ba1=new BankAccount("B-001");		
		ba1.deposit(1000); // 1000�� �Ա�
		ba1.deposit(500); // 500�� �Ա�
		ba1.withdraw(700); // 700�� ����
		
		BankAccount	ba2=new BankAccount("B-002");
		ba1.transferTo(ba2,300); // ba1���¿��� ba2���·� 300�� ��ü

		System.out.println(ba1);
		System.out.println(ba2);
	}

}