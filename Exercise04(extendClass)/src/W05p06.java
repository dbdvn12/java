
public class W05p06 {
	public static void main(String[] s) {
		Movie06 movies[]=new Movie06[5];
		movies[0]=new Movie06("��Ʈ����","���Ű����",136,"19990331");
		movies[1]=new Movie06("�ƹ�Ÿ","���ӽ� ĳ�ӷ�",161,"20091210");
		movies[2]=new Movie06("�μ���","ũ�������� ���",148,"20100708");
		movies[3]=new Movie06("�ҽ��ڵ�","���� ����",93,"20110311");
		movies[4]=new Movie06("13��","������ �罺��",100,"19990416");
//		movies[5]=new Movie06(s[0],s[1],Integer.parseInt(s[2]), s[3]);
		printMovieGuinness(movies);
	}

	private static void printMovieGuinness(Movie06[] movies) {
		Movie06 mLong=movies[0];
		
		for(int i=0;i<movies.length;i++) {
			if(movies[i].runningTime>mLong.runningTime) 
				mLong=movies[i];
		}
		System.out.println(mLong);

		Movie06 mShort=movies[0];
		for(int i=0;i<movies.length;i++) {
			if(movies[i].runningTime<mShort.runningTime)
				mShort=movies[i];
		}
		System.out.println(mShort);
		
	}
	
}
