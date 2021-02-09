package kh.java.func;

import java.util.Scanner;

public class ForTest {

	// 안녕하세요 5번 출력하기
	public void test1() {
		for (int i = 0; i < 5; i++) // i가 0 ~ 4 까지 5번 반복
			System.out.println("안녕하세요");
	}

	// 몇번 출력할 지 물어본 후 입력받은 횟수만큼 안녕하세요 출력
	// ex) 몇 번 출력하시겠습니까? 3 입력 시 안녕하세요 3번 출력
	public void test2() {

		Scanner sc = new Scanner(System.in); // Scanner 사용 준비

		System.out.print("몇 번 출력하시겠습니까?");
		int limitNum = sc.nextInt(); // limit 횟수 입력

		for (int i = 0; i < limitNum; i++) // 입력 받은 limitNum 횟수 만큼 반복
			System.out.println("안녕하세요");

		sc.close(); // Scanner 사용 종료
	}

	// 구구단 2단 출력하기
	public void test3() {
		System.out.println("2단입니다.");

		for (int i = 0; i < 9; i++) { // i가 0 ~ 8 까지 9번 반복
			System.out.printf("2 * %d = %d\n", i + 1, 2 * (i + 1)); // i가 0부터 이므로 +1 처리
		}
	}

	// 입력 받은 구구단 출력하기
	public void test4() {
		Scanner sc = new Scanner(System.in); // Scanner 사용 준비

		System.out.print("몇단을 출력하시겠습니까? ");
		int dan = sc.nextInt(); // 출력할 구구단 입력 받기

		System.out.printf("%d단 입니다.\n", dan); // 출력할 구구단 안내 츨력

		for (int i = 0; i < 9; i++) { // i가 0 ~ 8 까지 9번 반복
			System.out.printf("%d * %d = %d\n", dan, i + 1, dan * (i + 1)); // i가 0부터 이므로 +1 처리
		}
		sc.close(); // Scanner 사용 종료
	}

	// 입력한 5개의 정수의 합 구하기
	public void test5() {
		Scanner sc = new Scanner(System.in); // Scanner 사용 준비

		int sum = 0; // // 입력한 5개의 정수의 합 저장용 변수 sum을 선언하고 0으로 초기화

		for (int i = 0; i < 5; i++) { // i가 0 ~ 4까지 5번 반복
			System.out.print("정수 값을 입력하시오 : ");
			sum += sc.nextInt(); // 입력받은 정수 값을 sum에 더하기

		}
		System.out.println("입력한 5개의 정수의 합 : " + sum); // 최종 입력 받은 5개의 정수의 합 sum 출력
		sc.close(); // Scanner 사용 종료
	}

	// 두 정수 사이의 정수들의 합 출력하기
	public void test6() {
		Scanner sc = new Scanner(System.in); // Scanner 사용 준비

		int sum = 0; // 두 정수의 사이의 정수 합 저장용 변수 sum을 선언하고 0으로 초기화

		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt(); // 첫번째 정수 입력
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt(); // 두번째 정수 입력

		if (num2 > num1) { // 두번째 수가 더 큰 경우
			for (int i = num1; i < num2 + 1; i++) { // 첫번째 수 ~ 두번째 수 까지 반복
				sum += i;
			}
		} else { // 첫번째 수가 더 큰 경우
			for (int i = num2; i < num1 + 1; i++) { // 두번째 수 ~ 첫번째 수 까지 반복
				sum += i;
			}
		}

		if (num2 > num1) // 두번째 수가 더 큰 경우 출력
			System.out.printf("%d ~ %d의 정수의 합 : %d\n", num1, num2, sum);
		else // 첫번째 수가 더 큰 경우 출력
			System.out.printf("%d ~ %d의 정수의 합 : %d\n", num2, num1, sum);

		sc.close(); // Scanner 사용 종료
	}

	// 1 ~ 입력한 정수까지의 짝수들의 합 구하기
	public void test7() {
		Scanner sc = new Scanner(System.in); // Scanner 사용 준비

		int sum = 0; // 짝수 저장용 sum 변수를 선언하고 0으로 초기화

		System.out.print("숫자 입력 : ");
		int num = sc.nextInt(); // 숫자 입력 받음

		for (int i = 1; i < num + 1; i++) { // 1 ~ 입력받은 num 까지 반복
			if (i % 2 == 0) { // 짝수인 경우만 sum 증가
				sum += i;
			}

		}
		System.out.printf("짝수들의 합은 : %d\n", sum); // 최종 짝수들의 합 sum 출력

		sc.close(); // Scanner 사용 종료
	}
}
