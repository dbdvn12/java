
public class PetDog extends Dog{
	public PetDog(int height, double weight, String address, String owner) {
		super(height,weight);
		this.address=address;
		this.owner=owner;
	}
	String address;
	String owner;
	@Override
	public String toString() {
	
		return super.toString()+"\t林家:"+address+"\t林家:"+owner;
	}
}
