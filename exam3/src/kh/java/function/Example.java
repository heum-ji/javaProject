package kh.java.function;

import java.util.Scanner;

public class Example {

	// ���� 3
	public void exam1() {
		Scanner sc = new Scanner(System.in); // Ű���� �Է� �غ�

		System.out.print("ù�� ° ���� �Է� : ");
		int iNum1 = sc.nextInt(); // ù��° ������ �Է�
		System.out.print("�ι� ° ���� �Է� : ");
		int iNum2 = sc.nextInt(); // �ι�° ������ �Է�
		System.out.println("========== ��� ==========");

		System.out.println("���ϱ� ��� : " + (iNum1 + iNum2)); // �� ������ ���ϱ�(+) ��� ���
		System.out.println("���� ��� : " + (iNum1 - iNum2)); // �� ������ ����(-) ��� ���
		System.out.println("���ϱ� ��� : " + iNum1 * iNum2); // �� ������ ���ϱ�(*) ��� ���
		System.out.println("������ �� : " + iNum1 / iNum2); // �� ������ �������� ��(/) ���
		System.out.println("������ ������ : " + iNum1 % iNum2); // �� ������ ������(%)�� ������ ���
	}

	// ���� 4
	public void exam2() {
		Scanner sc = new Scanner(System.in); // Ű���� �Է� �غ�

		System.out.print("���� ���� �Է� : ");
		double width = sc.nextDouble(); // �Ǽ��� ���� ���� �Է�
		System.out.print("���� ���� �Է� : ");
		double height = sc.nextDouble(); // �Ǽ��� ���� ���� �Է�
		System.out.println("========== ��� ==========");

		System.out.println("���� : " + width * height); // ���� ��� (���� * ����)
		System.out.println("�ѷ� : " + 2 * (width + height)); // �ѷ� ��� (2 * (���� + ����))
	}

	// ���� 5
	public void exam3() {
		Scanner sc = new Scanner(System.in); // Ű���� �Է� �غ�

		System.out.print("����ܾ� �Է� : ");
		String engWord = sc.next(); // ���ڿ� �Է�

		System.out.println("ù��° ���� : " + engWord.charAt(0)); // ù��° ���� - ��ǻ�ʹ� Index 0���� ����
		System.out.println("�ι�° ���� : " + engWord.charAt(1)); // �ι�° ����
		System.out.println("����° ���� : " + engWord.charAt(2)); // ����° ����
	}
}