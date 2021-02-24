package apple.vo;

public class IPad extends Product {

	public IPad() {
		super();
	}

	public IPad(String name, String color, String code, int stock, int price, int productNum) {
		super(name, color, code, stock, price, productNum);
	}

	@Override
	public int getDiscount() {
		return 0;
	}
}
