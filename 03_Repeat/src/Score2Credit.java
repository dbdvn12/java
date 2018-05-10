import javax.swing.JOptionPane;

public class Score2Credit {

	public static void main(String[] args) {
		String score;
		
		
		
		do {
			score=JOptionPane.showInputDialog("성적값(0-100)을 입력하세요.(종료는 0)");
			int s=Integer.parseInt(score);
			String credit;
			if(s>=90) credit="A";
			else if(s>=80) credit="B";
			else if(s>=70) credit="C";
			else if(s>=60) credit="D";
			else if(s==0) break;
			else credit="F";
		
			JOptionPane.showMessageDialog(null, score+"(점)은 "+credit+"(학점)입니다.");
		}while(score=="0");
	}

}
