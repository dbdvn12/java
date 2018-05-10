
public class Test1 {
	
	public static void main(String[] args) {
	//int x=0;	int는 class, x는 변수, 0은 객체
	//String s=new String("Korea") String은 class, s는 객체 참조변수(주소값), 
								//Korea는 객체
	//대문자로 시작하는 String과 같은것이 class
		class Strudent {
			String name;
			int score;
		}
		
		Strudent s=new Strudent();
		s.name="리";
		s.score=86;
		
		System.out.println(s.name);
		System.out.println(s.score);
		
	}

}
