
public class W05p07 {

	public static void main(String[] args) {
		Date07 releaseDate=new Date07();
		releaseDate.year=1999;
		releaseDate.month=3;
		releaseDate.day=31;
		Movie07 movie=new Movie07("��Ʈ����","���Ű����",136,releaseDate);
		System.out.println(movie);
	}

}
