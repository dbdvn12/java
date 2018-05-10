
public class PetDog extends Animal{
	private String breed;
	public PetDog(String id, int birthYear, String birthPlace, String breed) {
		super(id, birthYear, birthPlace);
		this.breed=breed;
	}
	@Override
	public String toString() {
		return super.toString()+"\tǰ��: "+breed;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	static String[] breedNames= {"������","��찳","������","��Ƽ��","ġ�Ϳ�","Ǫ��"};
	public String[] getBreedNames() {
		return breedNames;
	}
	
}
