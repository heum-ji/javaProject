package com.khmarket.run;

//com.khmarket.vo 패키지의 Goods 클래스 내부 기능을 사용하기 위한 선언
import com.khmarket.vo.Goods;

// 문제 2 실행용 클래스
public class Start {

	public static void main(String[] args) {

		// 클래스 이름 약어 = new 클래스이름();
		Goods gs = new Goods();
		gs.printList(); // Goods 클래스의 printList() 메서드 실행

	}

}
