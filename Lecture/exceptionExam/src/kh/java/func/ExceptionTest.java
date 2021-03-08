package kh.java.func;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionTest {
	Scanner sc;

	public ExceptionTest() {
		super();
		sc = new Scanner(System.in);
	}

	public void main() {
	}

	public void exceptionTest1() {
		int num = 0;
		while (true) {
			System.out.print("숫자를 입력 하세요 : ");
			try {
				num = sc.nextInt();
				System.out.println("테스트구문");
			} catch (Exception e) {
				System.out.println("에러~~");
				sc.nextLine();
				continue;
			}
			System.out.println("입력하신 숫자는 " + num + "입니다.");
		}
	}

	public void exceptionTest2() {
		System.out.print("첫번쨰 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();

		// 숫자 2개를 입력 받아 num1 / num2 한 결과를 출력
		// 예외 처리가 아니라 소스코드를 변경해서 예외상황 제거
		if (num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
		} else {
			System.out.println("나누기 결과는 : " + num1 / num2);
		}
	}

	public void exceptionTest3() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("test.txt");
	}

}