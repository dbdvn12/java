public class Practice3 {
	public static void main(String[] args) {
		Student s1=new Student("ȫ",'��');
		Student s2=new Student("��",'��');
		Student s3=new Student("��",'��');
		Student studentArray[]= {s1,s2,s3};
		
		for (Student student : studentArray) {
			System.out.println(student);
		}
	}
}
