public class Bank2 {
	public static void main(String[] args) {
		BankAccount ba1=new BankAccount("B-001");		
		deposit(ba1,1000); // 1000원 입금
		deposit(ba1,500); // 500원 입금
		withdraw(ba1,700); // 700원 인출
		
		BankAccount	ba2=new BankAccount("B-002");
		transferTo(ba1,ba2,300); // ba1계좌에서 ba2계좌로 300원 이체

		System.out.println(toString(ba1));
		System.out.println(toString(ba2));
	}

	private static String toString(BankAccount ba) {		
		String a="계좌번호:"+ba.id+",잔고:"+ba.balance+",포인트:"+ba.point;
		return a;
	}

	private static void transferTo(BankAccount ba1, BankAccount ba2, int money) {
		ba1.withdraw(money);
		ba2.deposit(money);
	}

	private static void withdraw(BankAccount ba1, int money) {
		ba1.balance-=money;
	}

	private static void deposit(BankAccount ba1, int money) {
		ba1.balance+=money;
		ba1.point+=money*0.01;
		
	}
}

