
public class PetDog extends Animal{
	private String breed;
	public PetDog(String id, int birthYear, String birthPlace, String breed) {
		super(id, birthYear, birthPlace);
		this.breed=breed;
	}
	@Override
	public String toString() {
		return super.toString()+"\t품종: "+breed;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	static String[] breedNames= {"진돗개","삽살개","동경이","말티즈","치와와","푸들"};
	public String[] getBreedNames() {
		return breedNames;
	}
	
}
