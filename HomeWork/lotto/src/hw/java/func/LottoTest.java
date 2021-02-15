package hw.java.func;

import java.util.Random;
import java.util.Scanner;

public class LottoTest {

	public void lottoGame() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int[] comLottoArr = { 1, 10, 17, 33, 40, 45 }; // 고정 당첨 번호
		int[] userLottoArr = new int[6]; // 내 로또
		int userLottoNum = 0; // 내 로또 랜덤
		int temp = 0; // 정렬 저장용
		int cnt = 0; // 정답 카운트
		int resultSecond = 0; // 2등 당첨 수
		int resultThird = 0; // 3등 당첨 수
		int resultEtc = 0; // 4~6등..

		boolean allFinish = false; // 전체 프로그램 종료 체크

		while (!allFinish) {

			cnt++; // 정답 카운트 증가
			int result = 0; // 결과 초기화

			// comLottoArr 출력
			System.out.println("=== " + cnt + "회차 로또 당첨 번호===");
			for (int i = 0; i < comLottoArr.length; i++) {
				System.out.print(comLottoArr[i] + " ");
			}
			System.out.println();

			// userLotto 입력
			for (int i = 0; i < userLottoArr.length; i++) {
				userLottoNum = r.nextInt(45) + 1;

				boolean bool = true; // 중복 체크

				for (int j = 0; j < i; j++) {
					if (userLottoNum == userLottoArr[j]) {
						i--;
						bool = false;
						break;
					}

				}
				if (bool) {
					userLottoArr[i] = userLottoNum;
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
			System.out.println("=== " + cnt + "회차 로또 나의 번호===");
			for (int i = 0; i < userLottoArr.length; i++) {
				System.out.print(userLottoArr[i] + " ");
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
				resultEtc++;
				break;
			case 4:
				System.out.println("=== " + cnt + "회 3등 당첨을 축하합니다!!===");
				resultThird++;
				break;
			case 5:
				System.out.println("=== " + cnt + "회 2등 당첨을 축하합니다!!===");
				resultSecond++;
				break;
			case 6:
				System.out.println("=== " + cnt + "회 1등 당첨을 축하합니다!!===");
				System.out.println("현재까지 2등 : " + resultSecond);
				System.out.println("현재까지 3등 : " + resultThird);
				System.out.println("현재까지 꽝 : " + resultEtc);
				allFinish = true;
				break;
			} // 결과 출력 종료

		} // 전체 Lotto 게임 종료
		sc.close();
	}
}