package modifyMidTest;

public class Test7 {
	public static void main(String[] args) {
		int x[]= {1,1,1};
		int y[]= {2,2,2,2,2};
		int z[]=NumberTool.add(x,y);
		for (int i : z) {
			System.out.println(i);
		}
	}
}
