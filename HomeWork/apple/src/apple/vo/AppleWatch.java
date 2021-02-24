package apple.vo;

public class AppleWatch extends Product {

	public AppleWatch() {
		super();
	}

	public AppleWatch(String name, String color, String code, int stock, int price, int productNum) {
		super(name, color, code, stock, price, productNum);
	}

	@Override
	public int getDiscount() {
		return 0;
	}
}
