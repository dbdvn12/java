import javax.swing.JOptionPane;

public class BMI {

	public static void main(String[] args) {
		String kg;
		String cm;
		kg=JOptionPane.showInputDialog("ü��(kg)�� �Է��ϼ���.");
		cm=JOptionPane.showInputDialog("����(cm)�� �Է��ϼ���.");
		
		double m=Integer.parseInt(cm)/100.0;
		double kg1=Integer.parseInt(kg);
		double bmi=kg1/(m*m);
		JOptionPane.showMessageDialog(null, "BMI = "+bmi);
	}

}
