package first;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Test3 {
	public static void main(String[] args) {
		try {
			while(true) {
				String v=JOptionPane.showInputDialog("메모 입력");
				if(v!=null) {
					FileWriter w=new FileWriter("C:/Temp/memo.txt",true);
					w.write(v+"\n");
					w.close();
				}
				else break;
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
