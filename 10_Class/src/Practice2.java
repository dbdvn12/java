public class Practice2 {

	public static void main(String[] args) {
//		class Student{
//			String name;
//			char gender;
//			Student(String name, char gender) {
//				this.name=name;
//				this.gender=gender;
//			}
//		}
		Student s1=new Student("리",'남');
		Student s2=new Student("박", '남');
		Student s3=new Student("신", '여');
		
		System.out.println(s1.toString());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
