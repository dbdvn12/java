package first;

import java.io.FileWriter;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) {
		
		try {
			FileWriter w = new FileWriter("C:/Temp/data.txt");
			w.write("안녕");
			w.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}		
	}
}
