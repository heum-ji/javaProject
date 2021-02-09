package kh.java.func;

import java.util.Scanner;

public class Controll {

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= ��/�ҹ��� ��ȯ ���α׷� =========");
		System.out.print("�����Է� : ");
		char ch = sc.next().charAt(0); // ���� �Է�
		System.out.println("===== �� �� =====");

		if (ch >= 'A' && ch <= 'Z') { // ������ (�빮��)�� ���
			ch ^= 32; // ��/�ҹ��� ��ȯ
			System.out.println("�빮�ڸ� �Է� �Ͽ����ϴ�.");
			System.out.print("�ҹ��ڷ� ��ȯ : " + ch);
		} else if (ch >= 'a' && ch <= 'z') { // ������ (�ҹ���)�� ���
			ch ^= 32; // ��/�ҹ��� ��ȯ
			System.out.println("�ҹ��ڸ� �Է� �Ͽ����ϴ�.");
			System.out.print("�빮�ڷ� ��ȯ : " + ch);
		} else { // �����ڰ� �ƴ� ���
			System.out.println("�߸��Է��ϼ̽��ϴ�. �����ڸ� �Է����ּ���");
		}

		sc.close();
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�����Է� : ");
		int iNum = sc.nextInt(); // ���� �Է�

		System.out.println("===== �� �� =====");

		if (iNum == 0 || (iNum % 3 != 0 && iNum % 4 != 0)) // 3�� �����, 4�� ����� �ƴ� ��� + 0üũ
			System.out.printf("[%d]��(��) 3�� �����, 4�� ����� �ƴմϴ�.", iNum);
		else if ((iNum % 3 == 0) && (iNum % 4 == 0)) // 3�� ����̸鼭 4�� ����� ���
			System.out.printf("[%d]��(��) 3�� ����鼭 4�� ����Դϴ�.", iNum);
		else if (iNum % 3 == 0) // 3�� ������� �ش��ϴ� ���
			System.out.printf("[%d]��(��) 3�� ����Դϴ�.", iNum);
		else // 4�� ������� �ش��ϴ� ���
			System.out.printf("[%d]��(��) 4�� ����Դϴ�.", iNum);

		sc.close();
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1~3������ ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt(); // ���� �Է�

		switch (num) {
		case 1:
			System.out.print("1�Է�");
			break;
		case 2:
			System.out.print("2�Է�");
			break;
		case 3:
			System.out.print("3�Է�");
			break;
		default:
			System.out.print("1~3���� ���ڰ� �ƴմϴ�.");
			break;
		}

		/*
		 * if (num == 1) System.out.print("1�Է�"); else if (num == 2)
		 * System.out.print("2�Է�"); else if (num == 3) System.out.print("3�Է�"); else
		 * System.out.print("1~3���� ���ڰ� �ƴմϴ�.");
		 */

		sc.close();
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);

		System.out.println("���б� ���� �ý����Դϴ�.");
		System.out.print("������ �Է��ϼ���(A, B, C, D, F) : ");
		char jumsu = sc.nextLine().charAt(0); // ���� �Է�

		switch (jumsu) {
		case 'A': // ������ A�� ���
			System.out.println("�����ϼ̽��ϴ�. ���б��� 100% �����ص帮�ڽ��ϴ�.");
			break;
		case 'B': // ������ B�� ���
			System.out.println("�ƽ�����. ���б��� 50%�����ص帮�ڽ��ϴ�.");
			break;
		case 'C': // ������ C�� ���
			System.out.println("���б��� �ٶ�ø� ���� ������ ���ּ���.");
			break;
		case 'D': // ������ D�� ���
			System.out.println("ũ��.......");
			break;
		case 'F': // ������ F�� ���
			System.out.println("�л����Դϴ�!!!!");
			break;
		default: // ������ �ƴ� ���
			System.out.println("A, B, C, D, F �� �ϳ��� �Է��ϼ���");
			break;
		}

		sc.close();
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ϼ��� �˰���� ���� �Է��ϼ��� : ");
		int month = sc.nextInt(); // �� �Է�

		switch (month) {
		case 1:
			System.out.printf("%d������ 31�ϱ��� �ֽ��ϴ�\n", month);
			break;
		case 2:
			System.out.printf("%d������ 28�ϱ��� �ֽ��ϴ�\n", month);
			break;
		case 3:
			System.out.printf("%d������ 31�ϱ��� �ֽ��ϴ�\n", month);
			break;
		case 4:
			System.out.printf("%d������ 30�ϱ��� �ֽ��ϴ�\n", month);
			break;
		case 5:
			System.out.printf("%d������ 31�ϱ��� �ֽ��ϴ�\n", month);
			break;
		case 6:
			System.out.printf("%d������ 30�ϱ��� �ֽ��ϴ�\n", month);
			break;
		case 7:
			System.out.printf("%d������ 31�ϱ��� �ֽ��ϴ�\n", month);
			break;
		case 8:
			System.out.printf("%d������ 31�ϱ��� �ֽ��ϴ�\n", month);
			break;
		case 9:
			System.out.printf("%d������ 30�ϱ��� �ֽ��ϴ�\n", month);
			break;
		case 10:
			System.out.printf("%d������ 31�ϱ��� �ֽ��ϴ�\n", month);
			break;
		case 11:
			System.out.printf("%d������ 30�ϱ��� �ֽ��ϴ�\n", month);
			break;
		case 12:
			System.out.printf("%d������ 31�ϱ��� �ֽ��ϴ�\n", month);
			break;
		default:
			System.out.println("1 ~ 12������ ���� �Է��ϼ���.");
			break;
		}

		/*
		 * // 31�� if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
		 * || month == 10 || month == 12) System.out.printf("%d������ 31�ϱ��� �ֽ��ϴ�\n",
		 * month); else if (month == 4 || month == 6 || month == 9 || month == 11)
		 * System.out.printf("%d������ 30�ϱ��� �ֽ��ϴ�\n", month); else if (month == 2)
		 * System.out.println("2������ 28�ϱ��� �ֽ��ϴ�"); else
		 * System.out.println("1 ~ 12������ ���� �Է��ϼ���.");
		 */
		sc.close();
	}
}
