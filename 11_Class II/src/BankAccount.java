
public class BankAccount {
	private String id;
	private String name;
	private String password;
	private int balance;
	public BankAccount(String id, String name, String password) {
		this.id=id;
		this.name=name;
		this.password=password;
	}
	@Override
	public String toString() {
		return id+","+name+","+balance; // 보안 유지를 위해 비밀번호(password) 필드의 값은 출력하지 않는다.
	}
	public void deposit(int money){ // 외부에 공개된 deposit() 함수를 호출함으로써 아래 setBalance()를 통해서만 balance의 값이 변경하도록 함.
		setBalance(balance+money);
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public void withdraw(int money) {
		setBalance(balance-money);
		
	}
	
}
