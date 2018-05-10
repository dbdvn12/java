
public class BankAccount01 {
	String id;
	String name;
	String password;
	int balance;
	
	public BankAccount01(String id, String name, String password) {
		this.id=id;
		this.name=name;
		this.password=password;
	}
	public BankAccount01(String id, String name, String password, int balance) {
		this(id,name,password);
		this.balance=balance;
	}
	@Override
	public String toString() {
		return id+","+name+","+password+","+balance;
	}
	
}
