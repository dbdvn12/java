public class Practice56 {

	public static void main(String[] args) {
		Score v1=new Score(85,71,68);
		Score v2=new Score(93,84,75);
		Score scoreArray[]= {v1,v2};
		
		for (Score score : scoreArray) {
			System.out.println(score);
		}
		
	}

}
