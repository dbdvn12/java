
public class Bank {

	public static void main(String[] args) {
		BankAccount	ba1=new BankAccount("B-001");		
		ba1.deposit(1000); // 1000원 입금
		ba1.deposit(500); // 500원 입금
		ba1.withdraw(700); // 700원 인출
		
		BankAccount	ba2=new BankAccount("B-002");
		ba1.transferTo(ba2,300); // ba1계좌에서 ba2계좌로 300원 이체

		System.out.println(ba1);
		System.out.println(ba2);
	}

}
