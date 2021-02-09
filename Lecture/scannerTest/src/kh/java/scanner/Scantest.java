package kh.java.scanner;

import java.util.Scanner;

public class Scantest {
	public void scan1() {
		Scanner sc = new Scanner(System.in); // 키보드값을 입력 받기위한 준비

		System.out.print("정수 1개를 입력해주세요 : ");
		int number = sc.nextInt(); // 키보드로 정수값을 입력 받음
		System.out.println("사용자 입력 값 : " + number);

		System.out.print("실수 1개를 입력해주세요 : ");
		double number2 = sc.nextDouble(); // 키보드로 실수값을 입력받음
		System.out.println("사용자 입력 값 : " + number2);
	}

	public void scan2() {
		Scanner sc = new Scanner(System.in); // 스캐너 사용 준비 완료
		// 문자열 입력 받는 방법 1 -> 공백 불가(띄어쓰기를 인지 할 수 없음)
		System.out.print("문자열 입력(띄어쓰기 불가능) : ");
		String str1 = sc.next(); // 키보드로 입력한 문자열을 str1에 대입(띄어쓰기 불가능)

		System.out.println(str1);

		System.out.print("문자열 입력(띄어쓰기 가능) : ");
		sc.nextLine(); // buffer에 남아있는 엔터 제거용 코드
		String str2 = sc.nextLine();

		System.out.println(str2);

		// 문자 입력 받기
		System.out.print("문자 1개 입력 : ");
		char ch1 = sc.next().charAt(0); // 문자열로 받아온 후 그 중 첫번째 글자
		System.out.println("입력한 문자는 : " + ch1);
		
		System.out.println("문자열을 입력해보세요 : ");
		char ch2 = sc.next().charAt(1);
		System.out.println(ch2);
	}

	public void scan3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력: ");
		String str1 = sc.nextLine();

		System.out.println(str1);
	}
	
	public void exam1() {
		// 이름(String), 나이(int), 주소(String), 키(double), 몸무게(double), 성별(Char)을 입력 받고 출력
		// 키는 정수, 몸무게는 소숫점 1번째 자리
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		System.out.print("키 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		System.out.println("이름 :" + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
		System.out.println("키 : " + (int) height);
		System.out.printf("몸무게 : %.1f\n", weight);
		System.out.println("성별 : " + gender);

	}
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = (double) sum / 3;

		System.out.printf("당신 성적의 총 합은 %d점이고 평균은 %.2f 입니다!\n", sum, avg);
	}
	
}
