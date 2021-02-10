package kh.java.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public void random1() {
		Random r = new Random();
		int randomNumber = r.nextInt(10); // 0 1 2 3 4 5 6 7 8 9
		System.out.println(randomNumber);
		int randomNumber2 = r.nextInt(16); // 0 ~ 15
		System.out.println(randomNumber2);
		int randomNumber3 = r.nextInt(10) + 1; // 1 ~ 10
		System.out.println(randomNumber3);
		int randomNumber4 = r.nextInt(16) + 20; // 20 ~ 35
		System.out.println(randomNumber4);
	}

	public void coin() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int win = 0;
		int lose = 0;
		int sel = 0;
		boolean isFinish = true;
		while (isFinish) {
			System.out.println("==== 동전 앞/뒤 맞추기 ====");
			System.out.println("1. 게임시작");
			System.out.println("2. Score");
			System.out.println("3. 게임종료");
			System.out.print("선택 > ");
			sel = sc.nextInt();

			switch (sel) {
			case 1: // Start Game
				int coin = r.nextInt(2) + 1; // 1~2, 1 or 2 // 컴퓨터가 가지고 있는 동전 앞/뒤 답
				int select = 0;

				while (true) {
					System.out.print("[앞/뒤] 선택해주세요(1.앞면 / 2.뒷면) : ");
					select = sc.nextInt();

					if (select == 1 || select == 2) { // 1 or 2를 정상적으로 입력한 경우
						break;
					}
					System.out.println("1 또는 2를 입력해주세요."); // 1 or 2가 아닌 다른 숫자를 입력한 경우
				}

				System.out.println("결과 확인 : " + (coin == 1 ? "앞면" : "뒷면"));

				if (coin == select) {
					System.out.println("정답!!");
					win++;
				} else {
					System.out.println("땡!!");
					lose++;
				}
				break;
			case 2: // Score
				System.out.println("<< 전적 >>");
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
				break;
			case 3: // End Game
				isFinish = false;
				break;
			} // switch문 종료
		} // while 종료
		sc.close();
	}

	public void exam1() { // 가위 바위 보 게임
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		final int SCISSOR = 1, ROCK = 2, PAPER = 3;

		System.out.println("=== 가위 바위 보 게임 ===");
		int computer = r.nextInt(3) + 1; // 1~3, 컴퓨터가 가지고 있는 가위/바위/보

		System.out.print("숫자를 선택하세요(1.가위 / 2.바위 / 3.보) : ");
		int user = sc.nextInt(); // 유저가 낸 가위/바위/보

		System.out.println("======== 결과 ========");

		System.out.println("당신은 " + (user == SCISSOR ? "가위" : user == ROCK ? "바위" : "보") + "를 냈습니다.");
		System.out.println("컴퓨터는 " + (computer == SCISSOR ? "가위" : computer == ROCK ? "바위" : "보") + "를 냈습니다.");

		System.out.println("====================");

		// 유저가 이긴 경우
		if ((user == SCISSOR && computer == PAPER) || (user == ROCK && computer == SCISSOR)
				|| (user == PAPER && computer == ROCK))
			System.out.println("당신이 이겼습니다. ㅠ.ㅠ");

		// 컴퓨터가 이긴 경우
		else if ((user == SCISSOR && computer == ROCK) || (user == ROCK && computer == PAPER)
				|| (user == PAPER && computer == SCISSOR))
			System.out.println("당신이 졌습니다. ㅎ.ㅎ");

		// 비긴 경우
		else
			System.out.println("우린 비겼습니다.");

		sc.close();
	}

	// Up & Down Game (1 ~ 99)
	public void test1() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		boolean isFinish = true;
		boolean isFirst = true;
		int answer = 0; // 컴퓨터 답
		int myAnswer = 0; // 유저 정답 입력
		int highScore = 0; // 최고 점수
		int sel = 0; // 메뉴 선택
		int cnt = 1; // 맞춘 횟수

		while (isFinish) {
			System.out.println("== Up & Down Game ==");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("선택 > ");

			sel = sc.nextInt();

			switch (sel) {
			case 1: // Start Game
				System.out.println("<< Game Start >>");
				answer = r.nextInt(99) + 1; // 1~99 정답 설정

				while (true) { // 맞출때 까지 반복
					System.out.print(cnt + " 회차 번호 입력 : ");
					myAnswer = sc.nextInt();

					if (myAnswer == answer) { // 정답을 맞춘 경우
						if (isFirst) {// 첫 판
							highScore = cnt; // 최고점수 갱신
							isFirst = false;
						} else if (highScore > cnt) // 최고점수 갱신
							highScore = cnt;

						System.out.println("<< 정답 >>");
						break;
					} else if (myAnswer < answer) { // Up
						System.out.println("<< UP >>");
						cnt++;
					} else { // Down
						System.out.println("<< DOWN >>");
						cnt++;
					}
				} // while
				break;

			case 2: // 점수 확인
				if (isFirst) // 한번도 안한 경우
					System.out.println("아직 기록이 없습니다.");
				else // 한판이라도 한 경우
					System.out.println("현재 최고 기록은 " + highScore + "회 입니다.");
				break;

			case 3: // 게임 종료
				isFinish = false;
				System.out.println("게임 종료");
				break;

			default: // 1 ~ 3이 아닌 경우
				System.out.println("잘못 입력했습니다. 1~3을 입력해주세요.");
				break;
			} // switch 종료

		} // while 종료
		sc.close();
	}

	// Baskin Robbins 31 Game / 1 ~ 31될 떄까지 / 한번에 1~3 입력 가능
	public void test2() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		boolean isFinish = true;
		int computer = 0; // 컴퓨터
		int user = 0; // 유저
		int win = 0, lose = 0; // score
		int sel = 0; // 메뉴 선택
		int cnt = 0; // 현재 수

		while (isFinish) {
			System.out.println("===== Baskin Robbins31 Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("선택 > ");

			sel = sc.nextInt();

			switch (sel) {
			case 1: // Start Game
				System.out.println("<< Game Start >>");
				cnt = 0; // 현재 수 초기화

				while (true) { // 31될 때 까지 반복
					// user 턴
					System.out.println("<< Your Turn >>");
					System.out.print("Input Number : ");
					user = sc.nextInt();

					if (user == 1 || user == 2 || user == 3) { // 1~3
						for (int i = 0; i < user; i++) {
							cnt++;

							if (cnt >= 31)
								break;

							System.out.println(cnt + "!");
						}

					} else {
						System.out.println("1~3사이 값을 입력해주세요.");
						continue;
					}

					if (cnt >= 31) { // 패배
						System.out.println("31!");
						System.out.println("패배!!!!!");
						lose++;
						break;
					}

					// computer 턴
					System.out.println("<< Computer Turn >>");
					computer = r.nextInt(3) + 1; // 1 ~ 3 랜덤

					if (computer == 1 || computer == 2 || computer == 3) { // 1~3
						for (int i = 0; i < computer; i++) {
							cnt++;

							if (cnt >= 31)
								break;

							System.out.println(cnt + "!");
						}
					}

					if (cnt >= 31) { // 승리
						System.out.println("31!");
						System.out.println("승리ㅠㅠ");
						win++;
						break;
					}
				}
				break;
			case 2: // score
				System.out.println("<< 당신의 전적 >>");
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
				break;
			case 3: // 게임 종료
				isFinish = false;
				System.out.println("게임 종료");
				break;
			default: // 1 ~ 3이 아닌 경우
				System.out.println("잘못 입력했습니다. 1~3을 입력해주세요.");
				break;
			} // switch 종료

		} // while 종료
		sc.close();

	}

	// Dice Game - 소지금 1만원 시작 // 주사위 3번 던져서 총합으로 베팅 // 이기면 베팅액 얻기 / 지면 베팅액 잃기 / 비기면
	// 한번더
	// 소지금 0원 시 자동 게임 종료
	public void test3() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		boolean isFinish = true; // 게임 종료
		int computerScore = 0; // 컴퓨터 점수
		int userScore = 0, userMoney = 10000, btMoney = 0; // 유저 점수, 유저 머니, 배팅 머니
		int diceNum = 0; // 주사위 수
		int win = 0, lose = 0, draw = 0; // score
		int sel = 0; // 메뉴 선택
		char bt = ' ', more = ' '; // 베팅하기, 다시하기

		while (isFinish) {
			System.out.println("===== Dice Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("선택 > ");

			sel = sc.nextInt();

			switch (sel) {
			case 1: // Start Game

				// 파산 체크
				if (userMoney <= 0) {
					System.out.println("잔액이 없습니다. bye ~~");
					continue; // 다시 메뉴 선택
				}

				while (true) { // 파산할 떄 까지
					System.out.println();
					System.out.println("<< Game Start >>");

					computerScore = 0; // 컴퓨터 점수 초기화
					userScore = 0; // 내 점수 초기화

					// user 턴
					for (int i = 0; i < 3; i++) { // 3회 주사위 던지기
						diceNum = r.nextInt(6) + 1; // 주사위 던지기
						userScore += diceNum; // 내점수 증가
						System.out.println((i + 1) + "번째 주사위 값 : " + diceNum); // 각 주사위 값 출력
					}

					System.out.println("내 주사위 총 합 : " + userScore); // 최종 내 점수 출력
					System.out.print("배팅 하시겠습니까[y/n] : ");

					sc.nextLine();
					bt = sc.next().charAt(0);

					if (bt == 'y') { // 베팅하는경우
						while (true) {
							System.out.print("얼마를 배팅하시겠습니까(현재 내 소지금 " + userMoney + "원) : ");
							btMoney = sc.nextInt(); // 베팅 금액 입력

							if (btMoney > userMoney) { // 현재 보유 금액보다 높은 금액을 적는 경우
								System.out.println("금액이 부족합니다. 다시 입력해주세요");

							} else // 정상적으로 입력 한 경우 다음 진행
								break;
						}

						// computer 턴
						for (int i = 0; i < 3; i++) { // 3회 주사위 던지기
							diceNum = r.nextInt(6) + 1; // 주사위 던지기
							computerScore += diceNum; // 컴퓨터 점수 증가
							System.out.println("컴퓨터 " + (i + 1) + "번째 주사위 값 : " + diceNum); // 각 주사위 값 출력
						}
						System.out.println("컴퓨터 주사위 총 합 : " + computerScore); // 최종 컴퓨터 점수 출력

						// 승/패 판단
						if (userScore > computerScore) { // win
							System.out.println("<< 결과 >>");
							System.out.println("WIN");
							System.out.println("+" + btMoney + "원!!");
							userMoney += btMoney; // 금액 처리
							win++;

						} else if (userScore < computerScore) { // lose
							System.out.println("<< 결과 >>");
							System.out.println("LOSE");
							System.out.println("-" + btMoney + "원!!");
							userMoney -= btMoney; // 금액 처리
							lose++;

						} else { // draw
							System.out.println("<< 결과 >>");
							System.out.println("DRAW");
							draw++;
						}

						// 파산 처리
						if (userMoney <= 0) {
							System.out.println("거지 Bye~");
							break;
						}

						System.out.print("한번 더 하시겠습니까[y/n] : ");

						sc.nextLine();
						more = sc.next().charAt(0);

						if (more == 'y') { // 한번 더 하기
							continue;
						} else // 그만 하기
							break;

					} // 베팅 하는 경우

					else { // 베팅 안 하는 경우
						System.out.println("메뉴로 돌아갑니다.");
						break;
					} // 베팅 안 하는 경우

				} // while
				break;
			case 2: // score
				System.out.println("<< 당신의 전적 >>");
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
				System.out.println("DRAW : " + draw);
				System.out.println("내 소지금 : " + userMoney + "원");
				break;
			case 3: // 게임 종료
				isFinish = false;
				System.out.println("게임 종료");
				break;
			default: // 1 ~ 3이 아닌 경우
				System.out.println("잘못 입력했습니다. 1~3을 입력해주세요.");
				break;
			} // switch 종료

		} // while 종료
		sc.close();
	}
}