public class Test3 {
	public static void main(String[] args) {
		Product p1=new Product("P001", "칫솔", 10); // 상품ID, 상품명, 재고수량
		System.out.println(p1);
		Product p2=new Product("P002", "비누", 55); // 상품ID, 상품명, 재고수량
		System.out.println(p2);
		Product p3=new Product("P003", "화장지", 23); // 상품ID, 상품명, 재고수량
		System.out.println(p3);
		Product p4=new Product("P004", "샴푸", 8); // 상품ID, 상품명, 재고수량
		System.out.println(p4);
		Product p5=new Product("P005", "면도기", 21); // 상품ID, 상품명, 재고수량
		System.out.println(p5);
	}
}