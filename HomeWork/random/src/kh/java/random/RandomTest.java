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
			System.out.println("==== ���� ��/�� ���߱� ====");
			System.out.println("1. ���ӽ���");
			System.out.println("2. Score");
			System.out.println("3. ��������");
			System.out.print("���� > ");
			sel = sc.nextInt();

			switch (sel) {
			case 1: // Start Game
				int coin = r.nextInt(2) + 1; // 1~2, 1 or 2 // ��ǻ�Ͱ� ������ �ִ� ���� ��/�� ��
				int select = 0;

				while (true) {
					System.out.print("[��/��] �������ּ���(1.�ո� / 2.�޸�) : ");
					select = sc.nextInt();

					if (select == 1 || select == 2) { // 1 or 2�� ���������� �Է��� ���
						break;
					}
					System.out.println("1 �Ǵ� 2�� �Է����ּ���."); // 1 or 2�� �ƴ� �ٸ� ���ڸ� �Է��� ���
				}

				System.out.println("��� Ȯ�� : " + (coin == 1 ? "�ո�" : "�޸�"));

				if (coin == select) {
					System.out.println("����!!");
					win++;
				} else {
					System.out.println("��!!");
					lose++;
				}
				break;
			case 2: // Score
				System.out.println("<< ���� >>");
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
				break;
			case 3: // End Game
				isFinish = false;
				break;
			} // switch�� ����
		} // while ����
		sc.close();
	}

	public void exam1() { // ���� ���� �� ����
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		final int SCISSOR = 1, ROCK = 2, PAPER = 3;

		System.out.println("=== ���� ���� �� ���� ===");
		int computer = r.nextInt(3) + 1; // 1~3, ��ǻ�Ͱ� ������ �ִ� ����/����/��

		System.out.print("���ڸ� �����ϼ���(1.���� / 2.���� / 3.��) : ");
		int user = sc.nextInt(); // ������ �� ����/����/��

		System.out.println("======== ��� ========");

		System.out.println("����� " + (user == SCISSOR ? "����" : user == ROCK ? "����" : "��") + "�� �½��ϴ�.");
		System.out.println("��ǻ�ʹ� " + (computer == SCISSOR ? "����" : computer == ROCK ? "����" : "��") + "�� �½��ϴ�.");

		System.out.println("====================");

		// ������ �̱� ���
		if ((user == SCISSOR && computer == PAPER) || (user == ROCK && computer == SCISSOR)
				|| (user == PAPER && computer == ROCK))
			System.out.println("����� �̰���ϴ�. ��.��");

		// ��ǻ�Ͱ� �̱� ���
		else if ((user == SCISSOR && computer == ROCK) || (user == ROCK && computer == PAPER)
				|| (user == PAPER && computer == SCISSOR))
			System.out.println("����� �����ϴ�. ��.��");

		// ��� ���
		else
			System.out.println("�츰 �����ϴ�.");

		sc.close();
	}

	// Up & Down Game (1 ~ 99)
	public void test1() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		boolean isFinish = true;
		boolean isFirst = true;
		int answer = 0; // ��ǻ�� ��
		int myAnswer = 0; // ���� ���� �Է�
		int highScore = 0; // �ְ� ����
		int sel = 0; // �޴� ����
		int cnt = 1; // ���� Ƚ��

		while (isFinish) {
			System.out.println("== Up & Down Game ==");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("���� > ");

			sel = sc.nextInt();

			switch (sel) {
			case 1: // Start Game
				System.out.println("<< Game Start >>");
				answer = r.nextInt(99) + 1; // 1~99 ���� ����

				while (true) { // ���⶧ ���� �ݺ�
					System.out.print(cnt + " ȸ�� ��ȣ �Է� : ");
					myAnswer = sc.nextInt();

					if (myAnswer == answer) { // ������ ���� ���
						if (isFirst) {// ù ��
							highScore = cnt; // �ְ����� ����
							isFirst = false;
						} else if (highScore > cnt) // �ְ����� ����
							highScore = cnt;

						System.out.println("<< ���� >>");
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

			case 2: // ���� Ȯ��
				if (isFirst) // �ѹ��� ���� ���
					System.out.println("���� ����� �����ϴ�.");
				else // �����̶� �� ���
					System.out.println("���� �ְ� ����� " + highScore + "ȸ �Դϴ�.");
				break;

			case 3: // ���� ����
				isFinish = false;
				System.out.println("���� ����");
				break;

			default: // 1 ~ 3�� �ƴ� ���
				System.out.println("�߸� �Է��߽��ϴ�. 1~3�� �Է����ּ���.");
				break;
			} // switch ����

		} // while ����
		sc.close();
	}

	// Baskin Robbins 31 Game / 1 ~ 31�� ������ / �ѹ��� 1~3 �Է� ����
	public void test2() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		boolean isFinish = true;
		int computer = 0; // ��ǻ��
		int user = 0; // ����
		int win = 0, lose = 0; // score
		int sel = 0; // �޴� ����
		int cnt = 0; // ���� ��

		while (isFinish) {
			System.out.println("===== Baskin Robbins31 Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("���� > ");

			sel = sc.nextInt();

			switch (sel) {
			case 1: // Start Game
				System.out.println("<< Game Start >>");
				cnt = 0; // ���� �� �ʱ�ȭ

				while (true) { // 31�� �� ���� �ݺ�
					// user ��
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
						System.out.println("1~3���� ���� �Է����ּ���.");
						continue;
					}

					if (cnt >= 31) { // �й�
						System.out.println("31!");
						System.out.println("�й�!!!!!");
						lose++;
						break;
					}

					// computer ��
					System.out.println("<< Computer Turn >>");
					computer = r.nextInt(3) + 1; // 1 ~ 3 ����

					if (computer == 1 || computer == 2 || computer == 3) { // 1~3
						for (int i = 0; i < computer; i++) {
							cnt++;

							if (cnt >= 31)
								break;

							System.out.println(cnt + "!");
						}
					}

					if (cnt >= 31) { // �¸�
						System.out.println("31!");
						System.out.println("�¸��Ф�");
						win++;
						break;
					}
				}
				break;
			case 2: // score
				System.out.println("<< ����� ���� >>");
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
				break;
			case 3: // ���� ����
				isFinish = false;
				System.out.println("���� ����");
				break;
			default: // 1 ~ 3�� �ƴ� ���
				System.out.println("�߸� �Է��߽��ϴ�. 1~3�� �Է����ּ���.");
				break;
			} // switch ����

		} // while ����
		sc.close();

	}

	// Dice Game - ������ 1���� ���� // �ֻ��� 3�� ������ �������� ���� // �̱�� ���þ� ��� / ���� ���þ� �ұ� / ����
	// �ѹ���
	// ������ 0�� �� �ڵ� ���� ����
	public void test3() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		boolean isFinish = true; // ���� ����
		int computerScore = 0; // ��ǻ�� ����
		int userScore = 0, userMoney = 10000, btMoney = 0; // ���� ����, ���� �Ӵ�, ���� �Ӵ�
		int diceNum = 0; // �ֻ��� ��
		int win = 0, lose = 0, draw = 0; // score
		int sel = 0; // �޴� ����
		char bt = ' ', more = ' '; // �����ϱ�, �ٽ��ϱ�

		while (isFinish) {
			System.out.println("===== Dice Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("���� > ");

			sel = sc.nextInt();

			switch (sel) {
			case 1: // Start Game

				// �Ļ� üũ
				if (userMoney <= 0) {
					System.out.println("�ܾ��� �����ϴ�. bye ~~");
					continue; // �ٽ� �޴� ����
				}

				while (true) { // �Ļ��� �� ����
					System.out.println();
					System.out.println("<< Game Start >>");

					computerScore = 0; // ��ǻ�� ���� �ʱ�ȭ
					userScore = 0; // �� ���� �ʱ�ȭ

					// user ��
					for (int i = 0; i < 3; i++) { // 3ȸ �ֻ��� ������
						diceNum = r.nextInt(6) + 1; // �ֻ��� ������
						userScore += diceNum; // ������ ����
						System.out.println((i + 1) + "��° �ֻ��� �� : " + diceNum); // �� �ֻ��� �� ���
					}

					System.out.println("�� �ֻ��� �� �� : " + userScore); // ���� �� ���� ���
					System.out.print("���� �Ͻðڽ��ϱ�[y/n] : ");

					sc.nextLine();
					bt = sc.next().charAt(0);

					if (bt == 'y') { // �����ϴ°��
						while (true) {
							System.out.print("�󸶸� �����Ͻðڽ��ϱ�(���� �� ������ " + userMoney + "��) : ");
							btMoney = sc.nextInt(); // ���� �ݾ� �Է�

							if (btMoney > userMoney) { // ���� ���� �ݾ׺��� ���� �ݾ��� ���� ���
								System.out.println("�ݾ��� �����մϴ�. �ٽ� �Է����ּ���");

							} else // ���������� �Է� �� ��� ���� ����
								break;
						}

						// computer ��
						for (int i = 0; i < 3; i++) { // 3ȸ �ֻ��� ������
							diceNum = r.nextInt(6) + 1; // �ֻ��� ������
							computerScore += diceNum; // ��ǻ�� ���� ����
							System.out.println("��ǻ�� " + (i + 1) + "��° �ֻ��� �� : " + diceNum); // �� �ֻ��� �� ���
						}
						System.out.println("��ǻ�� �ֻ��� �� �� : " + computerScore); // ���� ��ǻ�� ���� ���

						// ��/�� �Ǵ�
						if (userScore > computerScore) { // win
							System.out.println("<< ��� >>");
							System.out.println("WIN");
							System.out.println("+" + btMoney + "��!!");
							userMoney += btMoney; // �ݾ� ó��
							win++;

						} else if (userScore < computerScore) { // lose
							System.out.println("<< ��� >>");
							System.out.println("LOSE");
							System.out.println("-" + btMoney + "��!!");
							userMoney -= btMoney; // �ݾ� ó��
							lose++;

						} else { // draw
							System.out.println("<< ��� >>");
							System.out.println("DRAW");
							draw++;
						}

						// �Ļ� ó��
						if (userMoney <= 0) {
							System.out.println("���� Bye~");
							break;
						}

						System.out.print("�ѹ� �� �Ͻðڽ��ϱ�[y/n] : ");

						sc.nextLine();
						more = sc.next().charAt(0);

						if (more == 'y') { // �ѹ� �� �ϱ�
							continue;
						} else // �׸� �ϱ�
							break;

					} // ���� �ϴ� ���

					else { // ���� �� �ϴ� ���
						System.out.println("�޴��� ���ư��ϴ�.");
						break;
					} // ���� �� �ϴ� ���

				} // while
				break;
			case 2: // score
				System.out.println("<< ����� ���� >>");
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
				System.out.println("DRAW : " + draw);
				System.out.println("�� ������ : " + userMoney + "��");
				break;
			case 3: // ���� ����
				isFinish = false;
				System.out.println("���� ����");
				break;
			default: // 1 ~ 3�� �ƴ� ���
				System.out.println("�߸� �Է��߽��ϴ�. 1~3�� �Է����ּ���.");
				break;
			} // switch ����

		} // while ����
		sc.close();
	}
}