package apple.vo;

public class MacBook extends Product {

	public MacBook() {
		super();
	}

	public MacBook(String name, String color, String code, int stock, int price, int productNum) {
		super(name, color, code, stock, price, productNum);
	}

	public MacBook(String name, String color, int stock, int price) {
		super(name, color, stock, price);
		// TODO Auto-generated constructor stub
	}
}
