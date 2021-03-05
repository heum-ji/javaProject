package kr.or.iei.vo;

public class User {
	private String id;
	private String pw;
	private String name;
	private int age;
	private String phoneNum;

	public User() {
		super();
	}

	public User(String id, String pw, String name, int age, String phoneNum) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return getId() + "\t" + getName() + "\t" + getAge() + "\t" + getPhoneNum();
	}

}