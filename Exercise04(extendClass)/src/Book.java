
public class Book {
	String title;
	int year;
	public Book(String title, int year) {
		this.title=title;
		this.year=year;
	}
	@Override
	public String toString() {		
		return "������: "+title+"\t���ǳ⵵: "+year;
	}
}
