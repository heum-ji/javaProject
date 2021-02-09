package kh.java.func;

import java.util.Scanner;

public class WhileTest {
	public void test1() {
		int i = 0;
		while (i < 5) {
			System.out.println(i + "번째 출력");
			i++;
		}
	}

	public void test2() {
		Scanner sc = new Scanner(System.in); // Scanner 사용 준비

		System.out.print("몇단을 출력하시겠습니까? ");
		int dan = sc.nextInt(); // 출력할 구구단 입력 받기

		System.out.printf("%d단 입니다.\n", dan); // 출력할 구구단 안내 츨력

		int i = 0;

		while (i < 9) { // 9번 반복
			System.out.printf("%d * %d = %d\n", dan, i + 1, dan * (i + 1)); // i가 0부터 이므로 +1 처리
			i++;
		}

		sc.close(); // Scanner 사용 종료

	}
}
