
public class Dog {
	int height;
	double weight;
	
	public Dog(int height, double weight) {
		this.height=height;
		this.weight=weight;
	}

	@Override
	public String toString() {
		
		return "����:"+height+"\tü��:"+weight;
	}
}
