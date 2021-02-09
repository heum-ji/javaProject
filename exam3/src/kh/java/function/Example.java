package kh.java.function;

import java.util.Scanner;

public class Example {

	// 문제 3
	public void exam1() {
		Scanner sc = new Scanner(System.in); // 키보드 입력 준비

		System.out.print("첫번 째 정수 입력 : ");
		int iNum1 = sc.nextInt(); // 첫번째 정수를 입력
		System.out.print("두번 째 정수 입력 : ");
		int iNum2 = sc.nextInt(); // 두번째 정수를 입력
		System.out.println("========== 결과 ==========");

		System.out.println("더하기 결과 : " + (iNum1 + iNum2)); // 두 정수의 더하기(+) 결과 출력
		System.out.println("빼기 결과 : " + (iNum1 - iNum2)); // 두 정수의 빼기(-) 결과 출력
		System.out.println("곱하기 결과 : " + iNum1 * iNum2); // 두 정수의 곱하기(*) 결과 출력
		System.out.println("나누기 몫 : " + iNum1 / iNum2); // 두 정수의 나누기의 몫(/) 출력
		System.out.println("나누기 나머지 : " + iNum1 % iNum2); // 두 정수의 나누기(%)의 나머지 출력
	}

	// 문제 4
	public void exam2() {
		Scanner sc = new Scanner(System.in); // 키보드 입력 준비

		System.out.print("가로 길이 입력 : ");
		double width = sc.nextDouble(); // 실수형 가로 길이 입력
		System.out.print("세로 길이 입력 : ");
		double height = sc.nextDouble(); // 실수형 세로 길이 입력
		System.out.println("========== 결과 ==========");

		System.out.println("면적 : " + width * height); // 면적 출력 (가로 * 세로)
		System.out.println("둘레 : " + 2 * (width + height)); // 둘레 출력 (2 * (가로 + 세로))
	}

	// 문제 5
	public void exam3() {
		Scanner sc = new Scanner(System.in); // 키보드 입력 준비

		System.out.print("영어단어 입력 : ");
		String engWord = sc.next(); // 문자열 입력

		System.out.println("첫번째 문자 : " + engWord.charAt(0)); // 첫번째 문자 - 컴퓨터는 Index 0부터 시작
		System.out.println("두번째 문자 : " + engWord.charAt(1)); // 두번째 문자
		System.out.println("세번째 문자 : " + engWord.charAt(2)); // 세번째 문자
	}
}