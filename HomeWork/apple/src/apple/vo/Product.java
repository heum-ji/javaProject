package apple.vo;

public abstract class Product {
	private String name;
	private String color;
	private String code;
	private int stock;
	private int price;
	private int productNum;
	private int buyCnt;

	public Product() {
		super();
	}

	public Product(String name, String color, String code, int stock, int price, int productNum) {
		super();
		this.name = name;
		this.color = color;
		this.code = code;
		this.stock = stock;
		this.price = price;
		this.productNum = productNum;
		buyCnt = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public int getBuyCnt() {
		return buyCnt;
	}

	public void setBuyCnt(int buyCnt) {
		this.buyCnt = buyCnt;
	}

	public abstract int getDiscount();

}