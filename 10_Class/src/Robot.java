
public class Robot {
		
	String id;
	double weight;
	int height;
	public Robot(String id, double weight, int height) {
		this.id=id;
		this.weight=weight;
		this.height=height;
	}
	public Robot() {
		
	}
	@Override
	public String toString() {
		String s="id="+id+"\tweight="+weight+"\theight"+height;
		return s;
	}
	
	public static void printRobot(Robot[] robotArray) {
		for (Robot robot : robotArray) {
			System.out.println(robot);
		}
		
	}
}
