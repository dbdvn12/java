import javax.swing.JOptionPane;

public class Arithmetic {

	public static void main(String[] args) {
		String a;
		String b;
		a=JOptionPane.showInputDialog("ù° ���� �Է��ϼ���.");
		b=JOptionPane.showInputDialog("�ι�° ���� �Է��ϼ���.");
		
		double a1=Double.parseDouble(a);
		double b1=Double.parseDouble(b);
		double ab=a1+b1;
		double sub=a1-b1;
		double mul=a1*b1;
		double dis=a1/b1;
		
		JOptionPane.showMessageDialog(null, a1+"+"+b1+"="+ab+"\n"+a1+"-"+b1+"="+sub+"\n"+a1+"*"+b1+"="+mul+"\n"+a1+"/"+b1+"="+dis);
	}

}
