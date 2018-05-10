
public class BankAccount {
	String id;
	int balance;
	double point;
	
	public BankAccount(String id) {
		this.id=id;
	}

	public void deposit(int money) {
		balance+=money;
		point+=money*0.01;
	}

	public void withdraw(int money) {
		balance-=money;
	}

	public void transferTo(BankAccount aN, int money) {
		withdraw(money);
		aN.deposit(money);
	}
	@Override
	public String toString() {
		return "계좌번호:"+id+", 잔고:"+balance+", 포인트"+point;
		
	}

	
	
}
