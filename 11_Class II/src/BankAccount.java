
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
		return id+","+name+","+balance; // ���� ������ ���� ��й�ȣ(password) �ʵ��� ���� ������� �ʴ´�.
	}
	public void deposit(int money){ // �ܺο� ������ deposit() �Լ��� ȣ�������ν� �Ʒ� setBalance()�� ���ؼ��� balance�� ���� �����ϵ��� ��.
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
