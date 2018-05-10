package first;

import java.io.FileWriter;
import java.io.IOException;

public class LineAdd {
	public static void main(String[] args) {
		String v=args[0];
		try {
			FileWriter w=new FileWriter("C:/Temp/memo.txt",true);
			w.write(v+"\n");
			w.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
