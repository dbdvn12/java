
public class Ex03 {

	public static void main(String[] args) {
		Date regitDate=new Date(2016, 5, 1);
		Date birthDate=new Date(1998, 12, 31);
		Member m=new Member("ȫ�浿", regitDate, birthDate);
//		Member m=new Member("ȫ�浿", new Date(2016,5,1), new Date(1998,12,31));
		System.out.println(m);
		birthDate.month=11;
//		m.birthDate.month=11;
		System.out.println(m);
	}

}
