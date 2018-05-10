package first;

import java.io.FileReader;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		try {
			Scanner iF;
			iF=new Scanner(new FileReader("C:/Temp/info.txt"));
			while(iF.hasNext()){
				System.out.println(iF.nextLine());
			}
		iF.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}