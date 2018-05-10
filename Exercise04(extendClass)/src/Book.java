
public class Book {
	String title;
	int year;
	public Book(String title, int year) {
		this.title=title;
		this.year=year;
	}
	@Override
	public String toString() {		
		return "도서명: "+title+"\t출판년도: "+year;
	}
}
