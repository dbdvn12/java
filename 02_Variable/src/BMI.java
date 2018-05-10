import javax.swing.JOptionPane;

public class BMI {

	public static void main(String[] args) {
		String kg;
		String cm;
		kg=JOptionPane.showInputDialog("체중(kg)을 입력하세요.");
		cm=JOptionPane.showInputDialog("신장(cm)을 입력하세요.");
		
		double m=Integer.parseInt(cm)/100.0;
		double kg1=Integer.parseInt(kg);
		double bmi=kg1/(m*m);
		JOptionPane.showMessageDialog(null, "BMI = "+bmi);
	}

}
