package kh.java.func;

import java.util.Scanner;

public class WhileTest {
	public void test1() {
		int i = 0;
		while (i < 5) {
			System.out.println(i + "��° ���");
			i++;
		}
	}

	public void test2() {
		Scanner sc = new Scanner(System.in); // Scanner ��� �غ�

		System.out.print("����� ����Ͻðڽ��ϱ�? ");
		int dan = sc.nextInt(); // ����� ������ �Է� �ޱ�

		System.out.printf("%d�� �Դϴ�.\n", dan); // ����� ������ �ȳ� ����

		int i = 0;

		while (i < 9) { // 9�� �ݺ�
			System.out.printf("%d * %d = %d\n", dan, i + 1, dan * (i + 1)); // i�� 0���� �̹Ƿ� +1 ó��
			i++;
		}

		sc.close(); // Scanner ��� ����

	}
}
