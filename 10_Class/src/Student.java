

public class Student {
	public 
		String name;
		int score;
		char gender;
	
	public Student() {	//������ - ��ü�� �����ϴ� �Լ�
	}					//�⺻������
	
	public Student(String name, int score) {
		this.name=name;
		this.score=score;	//this. ���� ������ �� ��ü
	}
	
	public Student(String name, char gender) {
		this.name=name;
		this.gender=gender;
	}
	@Override
	public String toString() {
		String s="�л�=> �̸�:"+name+", ����:"+gender;
		return s;
	}
}
