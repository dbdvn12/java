
public class Test1 {
	
	public static void main(String[] args) {
	//int x=0;	int�� class, x�� ����, 0�� ��ü
	//String s=new String("Korea") String�� class, s�� ��ü ��������(�ּҰ�), 
								//Korea�� ��ü
	//�빮�ڷ� �����ϴ� String�� �������� class
		class Strudent {
			String name;
			int score;
		}
		
		Strudent s=new Strudent();
		s.name="��";
		s.score=86;
		
		System.out.println(s.name);
		System.out.println(s.score);
		
	}

}
