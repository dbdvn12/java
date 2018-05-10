
public class Animal {
	private String id;
	private int birthYear;
	private String birthPlace;
	public Animal(String id, int birthYear) {
		this.id=id;
		this.birthYear=birthYear;
	}
	public Animal(String id, int birthYear, String birthPlace) {
		this(id, birthYear);
		this.birthPlace=birthPlace;
	}
	@Override
	public String toString() {
		return "아이디: "+id+"\t출생년도: "+birthYear+"\t출생지역:"+birthPlace;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	
}
