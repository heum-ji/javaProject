package kh.java.practice;

import java.util.Scanner;

public class Sample {
	// ���� 8
	public void sample1() {
		Scanner sc = new Scanner(System.in); // Ű���� �Է� �غ�

		System.out.print("���� �Է� : ");
		char ch = sc.next().charAt(0); // ���� 1�� �Է�

		System.out.printf("%c�� �����ڵ� �� : %d", ch, (int) ch); // �ش� ������ �����ڵ� �� ��� - char���� int������ ����ȯ
	}

	public void sample2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� �Է� : ");
		double kor = sc.nextDouble(); // �Ǽ��� ���� ���� �Է�
		System.out.print("���� ���� �Է� : ");
		double math = sc.nextDouble(); // �Ǽ��� ���� ���� �Է�
		System.out.print("���� ���� �Է� : ");
		double eng = sc.nextDouble(); // �Ǽ��� ���� ���� �Է�

		double sum = kor + math + eng; // ����, ����, ���� ���� ���ϱ�
		double avg = sum / 3.0; // ����, ����, ���� ��� ���ϱ�

		System.out.println("========== ��� ==========");
		System.out.printf("���� : %d\n", (int) sum); // �Ǽ��� ������ ������ ���
		System.out.printf("��� : %d\n", (int) avg); // �Ǽ��� ����� ������ ���
	}

	public void test1() {
		int num1 = 10, num2 = 0;
		String str = "hello";

		num1 += 20;
		num2 += 10;
		num1 /= num2;
		num2 *= num1;
		str += num2; // str : hello30
		num2 -= num1; // 27

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(str);

	}

	public void test2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° ���� �Է� : ");
		int iNum1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int iNum2 = sc.nextInt();

		String str = (iNum1 % 2) == 0 ? iNum2 % 2 == 0 ? "�� �� ��� ¦���̴�" : "�ϳ��� Ȧ���̰� �ϳ��� ¦���̴�." : "�� �� ��� Ȧ���̴�";
		System.out.println(str);
		sc.close();
	}

	public void test3() {
		int kor = 87;
		int math = 55;
		int eng = 68;

		int sum = kor + math + eng;
		double avg = sum / 3.0;

		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);

		// if
		if (avg >= 60) {
			System.out.println("�հ�");
		}
		// else
		else {
			System.out.println("���հ�");
		}

		// if - else if - else
		if (avg >= 60) {
			System.out.println("�հ�");
		} else if (avg >= 40) {
			System.out.println("���� ����");
		} else {
			System.out.println("���հ�");
		}
		// ��ø if��
		String grade = "";
		if (kor >= 80) {
			grade = "A";
			if (kor >= 95) {
				grade += "+";
			} else if (kor >= 85) {
				grade += "0";
			} else {
				grade += "-";
			}
		} else if (kor >= 60) {
			grade = "B";
			if (kor >= 75) {
				grade += "+";
			} else if (kor >= 65) {
				grade += "0";
			} else {
				grade += "-";
			}

		} else {
			grade = "C";
		}
		System.out.println("���� ������ " + grade + " �Դϴ�.");

	}
}
