package first;

import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) {
		try {
			FileWriter w=new FileWriter("C:/Temp/info.txt");
			w.write("빼앗긴\n들에도\n봄은\n오는가");
			w.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
			
	}
}
