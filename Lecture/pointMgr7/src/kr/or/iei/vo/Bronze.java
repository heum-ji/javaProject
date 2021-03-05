package kr.or.iei.vo;

public class Bronze extends Grade {

	public Bronze() {
		super();
	}

	public Bronze(String grade, String name, int point) {
		super(grade, name, point);
	}

	@Override
	public double getBonus() {
		return getPoint() * 0.01;
	}
}
