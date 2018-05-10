
public class W05p06 {
	public static void main(String[] s) {
		Movie06 movies[]=new Movie06[5];
		movies[0]=new Movie06("매트릭스","워쇼스키형제",136,"19990331");
		movies[1]=new Movie06("아바타","제임스 캐머런",161,"20091210");
		movies[2]=new Movie06("인셉션","크리스토퍼 놀란",148,"20100708");
		movies[3]=new Movie06("소스코드","덩컨 존스",93,"20110311");
		movies[4]=new Movie06("13층","조세프 루스넥",100,"19990416");
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
