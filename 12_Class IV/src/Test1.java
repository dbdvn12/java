
public class Test1 {
	public static void main(String[] args) {
		try {
			User user=new User("ksu123","1234");
			System.out.println("유저생성");
		} catch (Exception e) {			
			System.out.println(e.getMessage());
		}
		System.out.println("작업 완료");
	}
}
