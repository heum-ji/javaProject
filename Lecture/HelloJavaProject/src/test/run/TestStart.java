package test.run;

//import test.func.Func; // test.func 패키지의 Func 클래스 내부 기능을 사용하기 위한 선언
import test.func.func1.Function;

// 실행 클래스 생성
public class TestStart {
	// 실행용 메인메소드
	public static void main(String[] args) {
		/*
		 * func1()메소드 내부에 소스코드를 실행하고 싶다.
		 * func1()메소드가 포함되어있는 클래스 이름 : Func
		 * Func 클래스가 소속되어있는 패키지 : test.func
		 */
		
		// 클래스 이름 약어 = new 클래스이름();
		//Func f = new Func();
		// 약어.실행하고 싶은 메소드이름();
		//f.func1();
		//f.func2();
		//f.func1();

		/*
		 * 실습
		 * 1. 패키지생성 test.func.func1
		 * 2. 클래스 생성 Function 
		 * 3. Function클래스 내 메소드 생성
		 * public void test() {
		 *  
		 * }
		 * 
		 * 4.메소드 내부 소스코드 작성
		 * 본인이름 출력
		 * 
		 * 5.실행했을때 본인 이름 출력될 수 있도록 실행 메소드 코드 수정
		 */
		
		Function fc = new Function();
		fc.test();

	}

}
