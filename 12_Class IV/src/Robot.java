
public class Robot {
	String id;
	public Robot(String id) throws Exception {
		if(id.length()!=5) {
			throw new Exception("id ���� ����");
		}
		this.id=id;
	}
	
}
