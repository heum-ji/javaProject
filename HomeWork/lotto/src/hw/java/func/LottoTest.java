package hw.java.func;

import java.util.Random;
import java.util.Scanner;

public class LottoTest {

	public void lottoGame() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int[] comLottoArr = { 1, 10, 17, 33, 40, 45 }; // ���� ��÷ ��ȣ
		int[] userLottoArr = new int[6]; // �� �ζ�
		int userLottoNum = 0; // �� �ζ� ����
		int temp = 0; // ���� �����
		int cnt = 0; // ���� ī��Ʈ
		int resultSecond = 0; // 2�� ��÷ ��
		int resultThird = 0; // 3�� ��÷ ��
		int resultEtc = 0; // 4~6��..

		boolean allFinish = false; // ��ü ���α׷� ���� üũ

		while (!allFinish) {

			cnt++; // ���� ī��Ʈ ����
			int result = 0; // ��� �ʱ�ȭ

			// comLottoArr ���
			System.out.println("=== " + cnt + "ȸ�� �ζ� ��÷ ��ȣ===");
			for (int i = 0; i < comLottoArr.length; i++) {
				System.out.print(comLottoArr[i] + " ");
			}
			System.out.println();

			// userLotto �Է�
			for (int i = 0; i < userLottoArr.length; i++) {
				userLottoNum = r.nextInt(45) + 1;

				boolean bool = true; // �ߺ� üũ

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
			} // userLotto �Է� ��

			// userLotto ���� ����
			for (int i = 0; i < userLottoArr.length - 1; i++) {

				for (int j = 0; j < userLottoArr.length - i - 1; j++) {

					if (userLottoArr[j] > userLottoArr[j + 1]) {
						temp = userLottoArr[j];
						userLottoArr[j] = userLottoArr[j + 1];
						userLottoArr[j + 1] = temp;
					}
				}
			}

			// userLotto ���
			System.out.println("=== " + cnt + "ȸ�� �ζ� ���� ��ȣ===");
			for (int i = 0; i < userLottoArr.length; i++) {
				System.out.print(userLottoArr[i] + " ");
			}
			System.out.println();

			// ��� ó��
			for (int i = 0; i < userLottoArr.length; i++) {

				for (int j = 0; j < comLottoArr.length; j++) {

					if (userLottoArr[i] == comLottoArr[j]) { // ���� ���
						result++;
						break;
					}
				}
			}

			// ��� ���
			System.out.println("���� ���� : " + result);

			switch (result) {
			case 0:
			case 1:
			case 2:
			case 3:
				System.out.println("��");
				resultEtc++;
				break;
			case 4:
				System.out.println("=== " + cnt + "ȸ 3�� ��÷�� �����մϴ�!!===");
				resultThird++;
				break;
			case 5:
				System.out.println("=== " + cnt + "ȸ 2�� ��÷�� �����մϴ�!!===");
				resultSecond++;
				break;
			case 6:
				System.out.println("=== " + cnt + "ȸ 1�� ��÷�� �����մϴ�!!===");
				System.out.println("������� 2�� : " + resultSecond);
				System.out.println("������� 3�� : " + resultThird);
				System.out.println("������� �� : " + resultEtc);
				allFinish = true;
				break;
			} // ��� ��� ����

		} // ��ü Lotto ���� ����
		sc.close();
	}
}