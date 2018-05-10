
public class Practice04 {

	public static void main(String[] args) {
		try {
			Robot robot=new Robot("R123");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
