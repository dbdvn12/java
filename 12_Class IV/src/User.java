
public class User {
	String id;
	String password;
	public User(String id, String password) throws Exception {
		if(password.length()<6) {
			Exception e=new Exception("����� ª��");
		throw e;
		}
		this.id=id;
		this.password=password;
	}
	
}
