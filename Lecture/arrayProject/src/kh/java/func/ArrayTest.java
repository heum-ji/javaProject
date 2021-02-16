package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
	public void test1() {
		// ������ ���� 5���� �����Ͽ� ������� 1,2,3,4,5�� ����

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

		// 1��
		int[] arr = new int[10]; // ���̰� 5�� ������ �迭 ����
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

		// 2��
		// int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 3��
		int[] arr3 = new int[10];

		for (int i = 0; i < 10; i++) {
			arr3[i] = i + 1;
		}

		// ���� 3�� ���ڿ� �迭 ���� �� �� ����
		String[] arr4 = new String[3];
		arr4[0] = "Hello";
		arr4[1] = "Hi";
		arr4[2] = "�ȳ��ϼ���";

		String[] arr5 = { "Hello", "Hi", "�ȳ��ϼ���" };

		for (int i = 0; i < 10; i++) {
			System.out.println(arr3[i]);
		}
	}

	// �ǽ� 1
	public void exam1() {
		String[] fruitArr = { "����", "������", "Ű��", "���", "�ٳ���" };

		// 1-1
		System.out.println("1-1 �迭 �ε����� �̿��ؼ� �ٳ��� ���");
		System.out.println(fruitArr[4]);

		// 1-2
		System.out.println("1-2 for���� ���� �ʰ� ��ü ���");
		System.out.println(fruitArr[0]);
		System.out.println(fruitArr[1]);
		System.out.println(fruitArr[2]);
		System.out.println(fruitArr[3]);
		System.out.println(fruitArr[4]);

		// 1-3
		System.out.println("1-3 for���� �̿��Ͽ� ��ü ���");
		for (int i = 0; i < fruitArr.length; i++) {
			System.out.println(fruitArr[i]);
		}
	}

	// �ǽ� 2
	public void exam2() {
		int[] arrNum = new int[100];

		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = i + 1;
			System.out.println(arrNum[i]);
		}
	}

	// �ǽ� 3
	public void exam3() {
		Scanner sc = new Scanner(System.in);

		int[] subjectArr = new int[4];

		System.out.print("���� ���� : ");// ���� ����
		subjectArr[0] = sc.nextInt();
		System.out.print("���� ���� : ");// ���� ����
		subjectArr[1] = sc.nextInt();
		System.out.print("���� ���� : ");// ���� ����
		subjectArr[2] = sc.nextInt();
		subjectArr[3] = subjectArr[0] + subjectArr[1] + subjectArr[2]; // �հ�

		System.out.println("===== ���� =====");
		System.out.printf("���� ���� : %d\n���� ���� : %d\n���� ���� : %d\n�հ� : %d\n��� : %.2f\n", subjectArr[0], subjectArr[1],
				subjectArr[2], subjectArr[3], subjectArr[3] / 3.0f);

		sc.close();
	}

	public void exam4() {
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		int[] iArr = new int[5];

		for (int i = 0; i < iArr.length; i++) {
			System.out.print(i + 1 + "��° ���� �Է� : ");
			iArr[i] = sc.nextInt();
		}

		// ���� ���� ������ ���� ����
		// ��������
		for (int i = 0; i < iArr.length - 1; i++) {

			for (int j = 0; j < iArr.length - i - 1; j++) {

				if (iArr[j] > iArr[j + 1]) {
					temp = iArr[j];
					iArr[j] = iArr[j + 1];
					iArr[j + 1] = temp;
				}
			}
		}

		// ���
		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}

		sc.close();
	}

	public void lottoTest() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int[] userLottoArr = new int[6]; // �� �ζ�
		int[] comLottoArr = new int[6]; // ��ǻ�� �ζ�
		int userLottoNum = 0;
		int comLottoNum = 0;
		int result = 0; // ���
		int temp = 0; // ���� �����

		boolean allFinish = false; // ��ü ���α׷� ���� üũ

		while (!allFinish) {
			// userLotto ����
			for (int i = 0; i < userLottoArr.length; i++) {

				System.out.print((i + 1) + "��° ��ȣ �Է� : ");
				userLottoNum = sc.nextInt();

				if (userLottoNum >= 1 && userLottoNum <= 45) { // 1 ~ 45

					boolean bool = true; // �ߺ� üũ

					// �ߺ� �Ÿ���
					for (int j = 0; j < i; j++) {
						if (userLottoNum == userLottoArr[j]) {
							System.out.println("�ߺ��Դϴ�. �ٽ� �Է����ּ���.");
							i--;
							bool = false;
							break;
						}

					}
					if (bool) { // �ߺ� �ƴ� ��츸 �Է�
						userLottoArr[i] = userLottoNum;
					}

				} else {
					System.out.println("1 ~ 45 �� �ϳ��� �Է� �ϼ���");
					i--;
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
			System.out.println("User �ζ�!!!");
			for (int i = 0; i < userLottoArr.length; i++) {
				System.out.print(userLottoArr[i] + " ");
			}
			System.out.println();

			// comLotto �Է�
			for (int i = 0; i < comLottoArr.length; i++) {
				comLottoNum = r.nextInt(45) + 1;

				boolean bool = true; // �ߺ� üũ

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
			} // comLotto �Է� ��

			// comLotto ���� ����
			for (int i = 0; i < comLottoArr.length - 1; i++) {

				for (int j = 0; j < comLottoArr.length - i - 1; j++) {

					if (comLottoArr[j] > comLottoArr[j + 1]) {
						temp = comLottoArr[j];
						comLottoArr[j] = comLottoArr[j + 1];
						comLottoArr[j + 1] = temp;
					}
				}
			}

			// comLotto ���
			System.out.println("Com �ζ�!!!");
			for (int i = 0; i < comLottoArr.length; i++) {
				System.out.print(comLottoArr[i] + " ");
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
				break;
			case 4:
				System.out.println("3��!!");
				break;
			case 5:
				System.out.println("2��!!");
				break;
			case 6:
				System.out.println("1��!!");
				break;
			}

			// replay ����
			while (true) {
				System.out.print("�ѹ� �� �Ͻðڽ��ϱ�(1.yes 2.no)");
				int replay = sc.nextInt();

				if (replay == 1) {
					result = 0; // ���� ���� �ʱ�ȭ
					break;
				} else if (replay == 2) {
					allFinish = true; // ��ü ����
					break;
				} else {
					System.out.println("1 Ȥ�� 2�� �Է����ֻ���");
				}
			} // replay ��
		} // ��ü Lotto ���� ����
		sc.close();
	}

	public void arrayTest() {

		Scanner sc = new Scanner(System.in);
		boolean[] room = new boolean[10]; // �� 10��
		boolean isFinish = true;

		while (isFinish) {

			System.out.println("���� ���� ���α׷� v1.0");
			System.out.printf("1.�Խ�\t2.���\t3.�溸��\t4.����\n���� > ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				// �Խ� ����
				System.out.print("����濡 �Խ��Ͻðڽ��ϱ�?");
				int inRoomSel = sc.nextInt(); // �� ����

				if (inRoomSel >= 1 && inRoomSel <= 10) { // ���������� �����ϴ� ���

					if (room[inRoomSel - 1]) { // �̹� �Խ��� ���
						System.out.println(inRoomSel + "������ ���� �մ��� �ֽ��ϴ�.");
					} else { // �� ��
						System.out.println(inRoomSel + "���濡 �Խ��ϼ̽��ϴ�.");
						room[inRoomSel - 1] = true;
					}
				} else { // ������ ����
					System.out.println("1�� ~ 10���� ���� �ֽ��ϴ�.");
				} // �Խ� ��
				break;

			case 2:
				// ��� ����
				System.out.print("����濡�� ����Ͻðڽ��ϱ�?");
				int outRoomSel = sc.nextInt(); // �� ����

				if (outRoomSel >= 1 && outRoomSel <= 10) { // ���������� �����ϴ� ���

					if (room[outRoomSel - 1]) { // �̹� �Խ��� ���
						System.out.println(outRoomSel + "���濡�� ����ϼ̽��ϴ�.");
						room[outRoomSel - 1] = false;
					} else { // �� ��
						System.out.println(outRoomSel + "������ ���� �� ���Դϴ�.");
					}
				} else {
					System.out.println("1�� ~ 10���� ���� �ֽ��ϴ�.");
				} // ��ǳ�
				break;

			case 3:
				for (int i = 0; i < room.length; i++) {
					if (!room[i]) { // �� ��
						System.out.println((i + 1) + "������ ���� ����ֽ��ϴ�.");
					} else { // �մ��� �ִ� ��
						System.out.println((i + 1) + "���濡�� ���� �մ��� �ֽ��ϴ�.");
					}
				}
				break;

			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				isFinish = false;
				break;

			default:
				System.out.println("�߸� ���� �ϼ̽��ϴ�.");
				break;
			} // ���� ���� ����
		} // ��ü ���α׷� ����
		sc.close();
	}

	public void arrayCopy() {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		// ��������(�ּҰ��� �����ؼ� ���� �迭�� �����ϰ� �ִ� ����
		int[] arr2 = arr1;
		// ���� ����(�� �迭�� ����� arr1�� ���� �����ؿ��� ����
		int[] arr3 = arr1.clone();
		int[] arr4 = new int[5];
		System.arraycopy(arr1, 0, arr4, 0, 5);

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");

		}
		System.out.println();

		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");

		}
		System.out.println();
	}

	public void testArray() {
		int[][] arr = new int[2][3];
		int cnt = 1;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt;
				cnt += 2;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void exam11() {
		int[][] arr = new int[5][5];
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ++cnt;
				System.out.printf("%02d ", arr[i][j]);
			}
			System.out.println();
		}
	}
}