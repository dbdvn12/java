
public class Person extends Object{	//Object는 모든클래스의 부모클래스
	String name;					//extends Object가 기본으로 상속된다.
	String id;
	public Person(String id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return id+","+name;
	}
}
