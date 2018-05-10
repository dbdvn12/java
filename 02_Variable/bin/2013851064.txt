import javax.swing.JOptionPane;

public class F2C {

	public static void main(String[] args) {
		String f;
		f=JOptionPane.showInputDialog("화씨(F) 온도값을 입력하세요");
		
		double f1;
		f1=Integer.parseInt(f);
		
		double c;
		c=(f1-32)*5.0/9.0;	
		
		String t=String.format("%.2f", c);
		
		JOptionPane.showMessageDialog(null, "화씨 "+f1+"(F)도는 섭씨 "+t+"(C)도 입니다.");		
	}
}
