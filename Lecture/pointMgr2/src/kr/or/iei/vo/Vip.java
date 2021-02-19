package kr.or.iei.vo;

//실버와 변수 구성 같음 / 보너스 7%
public class Vip {
	private String grade;
	private String name;
	private int point;

	public Vip() {

	}

	public Vip(String grade, String name, int point) {

		this.grade = grade;
		this.name = name;
		this.point = point;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public double getBonus() {
		return 0.07 * point;
	}
}
