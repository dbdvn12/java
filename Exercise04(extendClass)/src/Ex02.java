
public class Ex02 {

	public static void main(String[] args) {
		Animal a=createAnimal("A-123",2011,"�̱� ����");
		System.out.println(a);
		PetDog s=new PetDog("A-567", 2013, "�λ�", "��Ƽ��");
		System.out.println(s);
		System.out.println(s.getBreedNames());
	}

	private static Animal createAnimal(String id, int birthYear, String birthPlace) {
		Animal s=new Animal(id, birthYear, birthPlace);
		return s;
	}
}
