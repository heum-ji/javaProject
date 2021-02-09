package kr.or.iei.start;

// kr.or.iei.vo 패키지의 Information 클래스 내부 기능을 사용하기 위한 선언
import kr.or.iei.vo.Information;

// 문제 1 실행용 클래스
public class Run {

	public static void main(String[] args) {

		// 클래스 이름 약어 = new 클래스이름();
		Information info = new Information();
		info.printInfo(); // information 클래스의 printInfo() 메서드 실행
	}

}