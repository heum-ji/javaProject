package kh.java.func;

import java.util.Scanner;

public class Controll {

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= 대/소문자 변환 프로그램 =========");
		System.out.print("문자입력 : ");
		char ch = sc.next().charAt(0); // 문자 입력
		System.out.println("===== 결 과 =====");

		if (ch >= 'A' && ch <= 'Z') { // 영문자 (대문자)인 경우
			ch ^= 32; // 대/소문자 변환
			System.out.println("대문자를 입력 하였습니다.");
			System.out.print("소문자로 변환 : " + ch);
		} else if (ch >= 'a' && ch <= 'z') { // 영문자 (소문자)인 경우
			ch ^= 32; // 대/소문자 변환
			System.out.println("소문자를 입력 하였습니다.");
			System.out.print("대문자로 변환 : " + ch);
		} else { // 영문자가 아닌 경우
			System.out.println("잘못입력하셨습니다. 영문자를 입력해주세요");
		}

		sc.close();
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력 : ");
		int iNum = sc.nextInt(); // 정수 입력

		System.out.println("===== 결 과 =====");

		if (iNum == 0 || (iNum % 3 != 0 && iNum % 4 != 0)) // 3의 배수도, 4의 배수도 아닌 경우 + 0체크
			System.out.printf("[%d]은(는) 3의 배수도, 4의 배수도 아닙니다.", iNum);
		else if ((iNum % 3 == 0) && (iNum % 4 == 0)) // 3의 배수이면서 4의 배수인 경우
			System.out.printf("[%d]은(는) 3의 배수면서 4의 배수입니다.", iNum);
		else if (iNum % 3 == 0) // 3의 배수에만 해당하는 경우
			System.out.printf("[%d]은(는) 3의 배수입니다.", iNum);
		else // 4의 배수에만 해당하는 경우
			System.out.printf("[%d]은(는) 4의 배수입니다.", iNum);

		sc.close();
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1~3사이의 숫자를 입력하세요 : ");
		int num = sc.nextInt(); // 정수 입력

		switch (num) {
		case 1:
			System.out.print("1입력");
			break;
		case 2:
			System.out.print("2입력");
			break;
		case 3:
			System.out.print("3입력");
			break;
		default:
			System.out.print("1~3사이 숫자가 아닙니다.");
			break;
		}

		/*
		 * if (num == 1) System.out.print("1입력"); else if (num == 2)
		 * System.out.print("2입력"); else if (num == 3) System.out.print("3입력"); else
		 * System.out.print("1~3사이 숫자가 아닙니다.");
		 */

		sc.close();
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);

		System.out.println("장학금 지불 시스템입니다.");
		System.out.print("학점을 입력하세요(A, B, C, D, F) : ");
		char jumsu = sc.nextLine().charAt(0); // 학점 입력

		switch (jumsu) {
		case 'A': // 학점이 A인 경우
			System.out.println("수고하셨습니다. 장학금을 100% 지급해드리겠습니다.");
			break;
		case 'B': // 학점이 B인 경우
			System.out.println("아쉽군요. 장학금을 50%지급해드리겠습니다.");
			break;
		case 'C': // 학점이 C인 경우
			System.out.println("장학금을 바라시면 좀더 열심히 해주세요.");
			break;
		case 'D': // 학점이 D인 경우
			System.out.println("크흠.......");
			break;
		case 'F': // 학점이 F인 경우
			System.out.println("학사경고입니다!!!!");
			break;
		default: // 학점이 아닌 경우
			System.out.println("A, B, C, D, F 중 하나를 입력하세요");
			break;
		}

		sc.close();
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("일수를 알고싶은 달을 입력하세요 : ");
		int month = sc.nextInt(); // 달 입력

		switch (month) {
		case 1:
			System.out.printf("%d월달은 31일까지 있습니다\n", month);
			break;
		case 2:
			System.out.printf("%d월달은 28일까지 있습니다\n", month);
			break;
		case 3:
			System.out.printf("%d월달은 31일까지 있습니다\n", month);
			break;
		case 4:
			System.out.printf("%d월달은 30일까지 있습니다\n", month);
			break;
		case 5:
			System.out.printf("%d월달은 31일까지 있습니다\n", month);
			break;
		case 6:
			System.out.printf("%d월달은 30일까지 있습니다\n", month);
			break;
		case 7:
			System.out.printf("%d월달은 31일까지 있습니다\n", month);
			break;
		case 8:
			System.out.printf("%d월달은 31일까지 있습니다\n", month);
			break;
		case 9:
			System.out.printf("%d월달은 30일까지 있습니다\n", month);
			break;
		case 10:
			System.out.printf("%d월달은 31일까지 있습니다\n", month);
			break;
		case 11:
			System.out.printf("%d월달은 30일까지 있습니다\n", month);
			break;
		case 12:
			System.out.printf("%d월달은 31일까지 있습니다\n", month);
			break;
		default:
			System.out.println("1 ~ 12사이의 수를 입력하세요.");
			break;
		}

		/*
		 * // 31일 if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
		 * || month == 10 || month == 12) System.out.printf("%d월달은 31일까지 있습니다\n",
		 * month); else if (month == 4 || month == 6 || month == 9 || month == 11)
		 * System.out.printf("%d월달은 30일까지 있습니다\n", month); else if (month == 2)
		 * System.out.println("2월달은 28일까지 있습니다"); else
		 * System.out.println("1 ~ 12사이의 수를 입력하세요.");
		 */
		sc.close();
	}
}
