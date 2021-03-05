package kr.or.iei.vo;

public class Platinum extends Grade {

	public Platinum() {
		super();
	}

	public Platinum(String grade, String name, int point) {
		super(grade, name, point);
	}

	@Override
	public double getBonus() {
		return getPoint() * 0.1;
	}

}