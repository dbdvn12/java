public class Person {
	String id;
	String name;
	public Person(String id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return id+","+name;
	}
}