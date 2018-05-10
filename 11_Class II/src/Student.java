
public class Student extends Person{
//	String id;
//	String name;
	String department;
	int schoolYear;
	public Student(String id, String name, String department, int schoolYear) {
//		this.id=id;
//		this.name=name;
		super(id,name);	//상속받은 객체는 가장위에 써야한다.
		this.department=department;
		this.schoolYear=schoolYear;
	}
	@Override
	public String toString() {
		return super.toString()+","+department+","+schoolYear;
	}
	
}
