package kh.java.practice;

import java.util.Scanner;

public class Sample {
	// 문제 8
	public void sample1() {
		Scanner sc = new Scanner(System.in); // 키보드 입력 준비

		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0); // 문자 1개 입력

		System.out.printf("%c의 유니코드 값 : %d", ch, (int) ch); // 해당 문자의 유니코드 값 출력 - char형을 int형으로 형변환
	}

	public void sample2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수 입력 : ");
		double kor = sc.nextDouble(); // 실수형 국어 점수 입력
		System.out.print("수학 점수 입력 : ");
		double math = sc.nextDouble(); // 실수형 수학 점수 입력
		System.out.print("영어 점수 입력 : ");
		double eng = sc.nextDouble(); // 실수형 영어 점수 입력

		double sum = kor + math + eng; // 국어, 수학, 영어 총점 구하기
		double avg = sum / 3.0; // 국어, 수학, 영어 평균 구하기

		System.out.println("========== 결과 ==========");
		System.out.printf("총점 : %d\n", (int) sum); // 실수형 총점을 정수로 출력
		System.out.printf("평균 : %d\n", (int) avg); // 실수형 평균을 정수로 출력
	}

	public void test1() {
		int num1 = 10, num2 = 0;
		String str = "hello";

		num1 += 20;
		num2 += 10;
		num1 /= num2;
		num2 *= num1;
		str += num2; // str : hello30
		num2 -= num1; // 27

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(str);

	}

	public void test2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수 입력 : ");
		int iNum1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int iNum2 = sc.nextInt();

		String str = (iNum1 % 2) == 0 ? iNum2 % 2 == 0 ? "두 수 모두 짝수이다" : "하나는 홀수이고 하나는 짝수이다." : "두 수 모두 홀수이다";
		System.out.println(str);
		sc.close();
	}

	public void test3() {
		int kor = 87;
		int math = 55;
		int eng = 68;

		int sum = kor + math + eng;
		double avg = sum / 3.0;

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

		// if
		if (avg >= 60) {
			System.out.println("합격");
		}
		// else
		else {
			System.out.println("불합격");
		}

		// if - else if - else
		if (avg >= 60) {
			System.out.println("합격");
		} else if (avg >= 40) {
			System.out.println("보충 수업");
		} else {
			System.out.println("불합격");
		}
		// 중첩 if문
		String grade = "";
		if (kor >= 80) {
			grade = "A";
			if (kor >= 95) {
				grade += "+";
			} else if (kor >= 85) {
				grade += "0";
			} else {
				grade += "-";
			}
		} else if (kor >= 60) {
			grade = "B";
			if (kor >= 75) {
				grade += "+";
			} else if (kor >= 65) {
				grade += "0";
			} else {
				grade += "-";
			}

		} else {
			grade = "C";
		}
		System.out.println("국어 성적은 " + grade + " 입니다.");

	}
}
