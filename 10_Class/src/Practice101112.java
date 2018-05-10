public class Practice101112 {
	
	public static void main(String[] args) {
		
		Date d1=new Date(2016,12,31);
		Date d2=new Date(2017,3,2);
		Date dateArray[]= {d1,d2};
		for (Date date : dateArray) {
			System.out.println(date);
		}
	}

}
