package kr.or.iei.vo;

public class Vvip extends Silver {

	public Vvip() {
		super();
	}

	public Vvip(String grade, String name, int point) {
		super(grade, name, point);
	}

	@Override
	public double getBonus() {
		return 0.1 * getPoint();
	}
}
