
public class Person extends Object{	//Object�� ���Ŭ������ �θ�Ŭ����
	String name;					//extends Object�� �⺻���� ��ӵȴ�.
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
