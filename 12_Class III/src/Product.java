public class Product {
	String id;
	String name;
	int stockAmount;
	static int totalStockAmount;
	public Product(String id, String name, int stockAmount) {
		this.id=id;
		this.name=name;
		this.stockAmount=stockAmount;
		Product.totalStockAmount+=stockAmount;
	}
	@Override
	public String toString() {
	return id+","+name+","+stockAmount+", ÃÑÀç°í·®="+totalStockAmount;
	}
}