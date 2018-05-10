

public class Student {
	public 
		String name;
		int score;
		char gender;
	
	public Student() {	//생성자 - 객체를 생성하는 함수
	}					//기본생성자
	
	public Student(String name, int score) {
		this.name=name;
		this.score=score;	//this. 현재 생성된 이 객체
	}
	
	public Student(String name, char gender) {
		this.name=name;
		this.gender=gender;
	}
	@Override
	public String toString() {
		String s="학생=> 이름:"+name+", 성별:"+gender;
		return s;
	}
}
