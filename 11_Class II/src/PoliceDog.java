
public class PoliceDog extends Dog{
	public PoliceDog(int height, double weight, String organ, String startDate) {
		super(height,weight);
		this.organ=organ;
		this.startDate=startDate;
	}
	String organ;
	String startDate;
	@Override
	public String toString() {
	
		return super.toString()+"\t기관:"+organ+"\t근무시작일:"+startDate;
	}
}
