package apple.vo;

public class IPhone extends Product {

	public IPhone() {
		super();
	}

	public IPhone(String name, String color, String code, int stock, int price, int productNum) {
		super(name, color, code, stock, price, productNum);
	}

	@Override
	public int getDiscount() {
		return 0;
	}
}
