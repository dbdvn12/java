
public class Test4 {
	public static void main(String[] args) {
		BankAccount ba1=new BankAccount("KSB-1234", "ȫ�浿", "feiO40bsjl");
		BankAccount ba2=new BankAccount("KSB-1235", "��ö��", "qp8zn0");
		System.out.println(ba2);
		ba2.deposit(100000);
		ba1.setPassword("qweras");
		System.out.println(ba1);
		System.out.println(ba2);
		ba2.withdraw(3000);
		System.out.println(ba2);
//		System.out.println(ba2.id+" ������ ��й�ȣ="+ba2.password);
		System.out.println(ba1.getPassword());
	}
}
