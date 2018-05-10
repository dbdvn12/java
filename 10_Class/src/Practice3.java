public class Practice3 {
	public static void main(String[] args) {
		Student s1=new Student("È«",'³²');
		Student s2=new Student("±è",'³²');
		Student s3=new Student("ÀÌ",'¿©');
		Student studentArray[]= {s1,s2,s3};
		
		for (Student student : studentArray) {
			System.out.println(student);
		}
	}
}
