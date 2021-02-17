package kh.java.func;

public class TV {
	// 속성 : 크기, 전원, 볼륨, 채널 -> 변수
	// 크기 -> 데이터타입 : int, 변수명 : size
	// 전원 -> 데이터타입 : boolean, 변수명 : power
	// 볼륨 -> 데이터타입 : int, 변수명 : vol
	// 채널 -> 데이터타입 : int, 변수명 : ch

	// 전역변수는 선언 시 자동으로 초기화
	// 숫자(정수*4, 실수*2) > 0, 문자(''), 논리 > false, 참조형 > null
	int size;
	boolean power;
	int vol;
	int ch;

	// 기능 : 전원 on/off, 볼륨조절, 채널변경 -> 메소드
	// 전원 on/off -> 메소드이름 : power
	// 볼륨조절 -> 메소드이름 : volUp(), volDown()
	// 채널변경 -> 메소드 이름 : chUp(), chDown(), chChange()
	public void power() {
		power = !power;
		if (power) {
			System.out.println("전원이 켜졌습니다.");
		} else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}

	public void volUp() {
		if (vol != 100) {
			vol++;
		}
		System.out.println("현재 볼륨 : " + vol);
	}

	public void volDown() {
		if (vol != 0) {
			vol--;
		}
		System.out.println("현재 볼륨 : " + vol);
	}

	public void chUp() {
		ch++;
		System.out.println("현재 채널 : " + ch);
	}

	public void chDown() {
		ch--;
		System.out.println("현재 채널 : " + ch);
	}

	public void chChange(int chNum) {
		ch = chNum;
		System.out.println("현재 채널 : " + ch);
	}
}