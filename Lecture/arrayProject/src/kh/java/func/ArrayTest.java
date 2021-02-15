package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
	public void test1() {
		// 정수형 변수 5개를 선언하여 순서대로 1,2,3,4,5를 대입

		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		int num7 = 7;
		int num8 = 8;
		int num9 = 9;
		int num10 = 10;

		// 1번
		int[] arr = new int[10]; // 길이가 5인 정수형 배열 선언
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;

		// 2번
		// int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 3번
		int[] arr3 = new int[10];

		for (int i = 0; i < 10; i++) {
			arr3[i] = i + 1;
		}

		// 길이 3인 문자열 배열 선언 후 값 대입
		String[] arr4 = new String[3];
		arr4[0] = "Hello";
		arr4[1] = "Hi";
		arr4[2] = "안녕하세요";

		String[] arr5 = { "Hello", "Hi", "안녕하세요" };

		for (int i = 0; i < 10; i++) {
			System.out.println(arr3[i]);
		}
	}

	// 실습 1
	public void exam1() {
		String[] fruitArr = { "딸기", "복숭아", "키위", "사과", "바나나" };

		// 1-1
		System.out.println("1-1 배열 인덱스를 이용해서 바나나 출력");
		System.out.println(fruitArr[4]);

		// 1-2
		System.out.println("1-2 for문을 쓰지 않고 전체 출력");
		System.out.println(fruitArr[0]);
		System.out.println(fruitArr[1]);
		System.out.println(fruitArr[2]);
		System.out.println(fruitArr[3]);
		System.out.println(fruitArr[4]);

		// 1-3
		System.out.println("1-3 for문을 이용하여 전체 출력");
		for (int i = 0; i < fruitArr.length; i++) {
			System.out.println(fruitArr[i]);
		}
	}

	// 실습 2
	public void exam2() {
		int[] arrNum = new int[100];

		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = i + 1;
			System.out.println(arrNum[i]);
		}
	}

	// 실습 3
	public void exam3() {
		Scanner sc = new Scanner(System.in);

		int[] subjectArr = new int[4];

		System.out.print("국어 점수 : ");// 국어 점수
		subjectArr[0] = sc.nextInt();
		System.out.print("영어 점수 : ");// 영어 점수
		subjectArr[1] = sc.nextInt();
		System.out.print("수학 점수 : ");// 수학 점수
		subjectArr[2] = sc.nextInt();
		subjectArr[3] = subjectArr[0] + subjectArr[1] + subjectArr[2]; // 합계

		System.out.println("===== 성적 =====");
		System.out.printf("국어 점수 : %d\n영어 점수 : %d\n수학 점수 : %d\n합계 : %d\n평균 : %.2f\n", subjectArr[0], subjectArr[1],
				subjectArr[2], subjectArr[3], subjectArr[3] / 3.0f);

		sc.close();
	}

	public void exam4() {
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		int[] iArr = new int[5];

		for (int i = 0; i < iArr.length; i++) {
			System.out.print(i + 1 + "번째 숫자 입력 : ");
			iArr[i] = sc.nextInt();
		}

		// 낮은 수가 앞으로 오게 정렬
		// 버블정렬
		for (int i = 0; i < iArr.length - 1; i++) {

			for (int j = 0; j < iArr.length - i - 1; j++) {

				if (iArr[j] > iArr[j + 1]) {
					temp = iArr[j];
					iArr[j] = iArr[j + 1];
					iArr[j + 1] = temp;
				}
			}
		}

		// 출력
		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}

		sc.close();
	}

	public void lottoTest() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int[] userLottoArr = new int[6]; // 내 로또
		int[] comLottoArr = new int[6]; // 컴퓨터 로또
		int userLottoNum = 0;
		int comLottoNum = 0;
		int result = 0; // 결과
		int temp = 0; // 정렬 저장용

		boolean allFinish = false; // 전체 프로그램 종료 체크

		while (!allFinish) {
			// userLotto 시작
			for (int i = 0; i < userLottoArr.length; i++) {

				System.out.print((i + 1) + "번째 번호 입력 : ");
				userLottoNum = sc.nextInt();

				if (userLottoNum >= 1 && userLottoNum <= 45) { // 1 ~ 45

					boolean bool = true; // 중복 체크

					// 중복 거르기
					for (int j = 0; j < i; j++) {
						if (userLottoNum == userLottoArr[j]) {
							System.out.println("중복입니다. 다시 입력해주세요.");
							i--;
							bool = false;
							break;
						}

					}
					if (bool) { // 중복 아닌 경우만 입력
						userLottoArr[i] = userLottoNum;
					}

				} else {
					System.out.println("1 ~ 45 중 하나를 입력 하세요");
					i--;
				}
			} // userLotto 입력 끝

			// userLotto 버블 정렬
			for (int i = 0; i < userLottoArr.length - 1; i++) {

				for (int j = 0; j < userLottoArr.length - i - 1; j++) {

					if (userLottoArr[j] > userLottoArr[j + 1]) {
						temp = userLottoArr[j];
						userLottoArr[j] = userLottoArr[j + 1];
						userLottoArr[j + 1] = temp;
					}
				}
			}

			// userLotto 출력
			System.out.println("User 로또!!!");
			for (int i = 0; i < userLottoArr.length; i++) {
				System.out.print(userLottoArr[i] + " ");
			}
			System.out.println();

			// comLotto 입력
			for (int i = 0; i < comLottoArr.length; i++) {
				comLottoNum = r.nextInt(45) + 1;

				boolean bool = true; // 중복 체크

				for (int j = 0; j < i; j++) {
					if (comLottoNum == comLottoArr[j]) {
						i--;
						bool = false;
						break;
					}

				}
				if (bool) {
					comLottoArr[i] = comLottoNum;
				}
			} // comLotto 입력 끝

			// comLotto 버블 정렬
			for (int i = 0; i < comLottoArr.length - 1; i++) {

				for (int j = 0; j < comLottoArr.length - i - 1; j++) {

					if (comLottoArr[j] > comLottoArr[j + 1]) {
						temp = comLottoArr[j];
						comLottoArr[j] = comLottoArr[j + 1];
						comLottoArr[j + 1] = temp;
					}
				}
			}

			// comLotto 출력
			System.out.println("Com 로또!!!");
			for (int i = 0; i < comLottoArr.length; i++) {
				System.out.print(comLottoArr[i] + " ");
			}
			System.out.println();

			// 결과 처리
			for (int i = 0; i < userLottoArr.length; i++) {

				for (int j = 0; j < comLottoArr.length; j++) {

					if (userLottoArr[i] == comLottoArr[j]) { // 맞춘 경우
						result++;
						break;
					}
				}
			}

			// 결과 출력
			System.out.println("맞은 갯수 : " + result);

			switch (result) {
			case 0:
			case 1:
			case 2:
			case 3:
				System.out.println("꽝");
				break;
			case 4:
				System.out.println("3등!!");
				break;
			case 5:
				System.out.println("2등!!");
				break;
			case 6:
				System.out.println("1등!!");
				break;
			}

			// replay 시작
			while (true) {
				System.out.print("한번 더 하시겠습니까(1.yes 2.no)");
				int replay = sc.nextInt();

				if (replay == 1) {
					result = 0; // 맞은 갯수 초기화
					break;
				} else if (replay == 2) {
					allFinish = true; // 전체 종료
					break;
				} else {
					System.out.println("1 혹은 2를 입력해주새요");
				}
			} // replay 끝
		} // 전체 Lotto 게임 종료
		sc.close();
	}
}