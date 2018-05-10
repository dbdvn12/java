
public class EBook extends Book{
	double fileSize;
	public EBook(String title, int year, double fileSize) {
		super(title, year);
		this.fileSize=fileSize;
	}
	@Override
	public String toString() {
		return super.toString()+"\t파일크기: "+fileSize;
	}
}
