package kr.or.iei.func;

public class TestClass implements Cloneable {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void func1() {
		System.out.println("테스트구문!");
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
