package kh.java.func;

import java.util.Scanner;

public class ForTest {

	// �ȳ��ϼ��� 5�� ����ϱ�
	public void test1() {
		for (int i = 0; i < 5; i++) // i�� 0 ~ 4 ���� 5�� �ݺ�
			System.out.println("�ȳ��ϼ���");
	}

	// ��� ����� �� ��� �� �Է¹��� Ƚ����ŭ �ȳ��ϼ��� ���
	// ex) �� �� ����Ͻðڽ��ϱ�? 3 �Է� �� �ȳ��ϼ��� 3�� ���
	public void test2() {

		Scanner sc = new Scanner(System.in); // Scanner ��� �غ�

		System.out.print("�� �� ����Ͻðڽ��ϱ�?");
		int limitNum = sc.nextInt(); // limit Ƚ�� �Է�

		for (int i = 0; i < limitNum; i++) // �Է� ���� limitNum Ƚ�� ��ŭ �ݺ�
			System.out.println("�ȳ��ϼ���");

		sc.close(); // Scanner ��� ����
	}

	// ������ 2�� ����ϱ�
	public void test3() {
		System.out.println("2���Դϴ�.");

		for (int i = 0; i < 9; i++) { // i�� 0 ~ 8 ���� 9�� �ݺ�
			System.out.printf("2 * %d = %d\n", i + 1, 2 * (i + 1)); // i�� 0���� �̹Ƿ� +1 ó��
		}
	}

	// �Է� ���� ������ ����ϱ�
	public void test4() {
		Scanner sc = new Scanner(System.in); // Scanner ��� �غ�

		System.out.print("����� ����Ͻðڽ��ϱ�? ");
		int dan = sc.nextInt(); // ����� ������ �Է� �ޱ�

		System.out.printf("%d�� �Դϴ�.\n", dan); // ����� ������ �ȳ� ����

		for (int i = 0; i < 9; i++) { // i�� 0 ~ 8 ���� 9�� �ݺ�
			System.out.printf("%d * %d = %d\n", dan, i + 1, dan * (i + 1)); // i�� 0���� �̹Ƿ� +1 ó��
		}
		sc.close(); // Scanner ��� ����
	}

	// �Է��� 5���� ������ �� ���ϱ�
	public void test5() {
		Scanner sc = new Scanner(System.in); // Scanner ��� �غ�

		int sum = 0; // // �Է��� 5���� ������ �� ����� ���� sum�� �����ϰ� 0���� �ʱ�ȭ

		for (int i = 0; i < 5; i++) { // i�� 0 ~ 4���� 5�� �ݺ�
			System.out.print("���� ���� �Է��Ͻÿ� : ");
			sum += sc.nextInt(); // �Է¹��� ���� ���� sum�� ���ϱ�

		}
		System.out.println("�Է��� 5���� ������ �� : " + sum); // ���� �Է� ���� 5���� ������ �� sum ���
		sc.close(); // Scanner ��� ����
	}

	// �� ���� ������ �������� �� ����ϱ�
	public void test6() {
		Scanner sc = new Scanner(System.in); // Scanner ��� �غ�

		int sum = 0; // �� ������ ������ ���� �� ����� ���� sum�� �����ϰ� 0���� �ʱ�ȭ

		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt(); // ù��° ���� �Է�
		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt(); // �ι�° ���� �Է�

		if (num2 > num1) { // �ι�° ���� �� ū ���
			for (int i = num1; i < num2 + 1; i++) { // ù��° �� ~ �ι�° �� ���� �ݺ�
				sum += i;
			}
		} else { // ù��° ���� �� ū ���
			for (int i = num2; i < num1 + 1; i++) { // �ι�° �� ~ ù��° �� ���� �ݺ�
				sum += i;
			}
		}

		if (num2 > num1) // �ι�° ���� �� ū ��� ���
			System.out.printf("%d ~ %d�� ������ �� : %d\n", num1, num2, sum);
		else // ù��° ���� �� ū ��� ���
			System.out.printf("%d ~ %d�� ������ �� : %d\n", num2, num1, sum);

		sc.close(); // Scanner ��� ����
	}

	// 1 ~ �Է��� ���������� ¦������ �� ���ϱ�
	public void test7() {
		Scanner sc = new Scanner(System.in); // Scanner ��� �غ�

		int sum = 0; // ¦�� ����� sum ������ �����ϰ� 0���� �ʱ�ȭ

		System.out.print("���� �Է� : ");
		int num = sc.nextInt(); // ���� �Է� ����

		for (int i = 1; i < num + 1; i++) { // 1 ~ �Է¹��� num ���� �ݺ�
			if (i % 2 == 0) { // ¦���� ��츸 sum ����
				sum += i;
			}

		}
		System.out.printf("¦������ ���� : %d\n", sum); // ���� ¦������ �� sum ���

		sc.close(); // Scanner ��� ����
	}
}
