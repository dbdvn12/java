public class Exer12 {
	
	
	public static void main(String[] args) {
		Robot robot1=new Robot("Robot-001",23.5,120);
		Robot robot2=new Robot("Robot-002",51,73);
		Robot robot3=new Robot("Robot-003",25.7,50);
		Robot robotArray[]= {robot1,robot2,robot3};
		
		
		Robot.printRobot(robotArray);
		
	}

}
