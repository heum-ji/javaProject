package kh.java.scanner;

import java.util.Scanner;

public class Scantest {
	public void scan1() {
		Scanner sc = new Scanner(System.in); // Ű���尪�� �Է� �ޱ����� �غ�

		System.out.print("���� 1���� �Է����ּ��� : ");
		int number = sc.nextInt(); // Ű����� �������� �Է� ����
		System.out.println("����� �Է� �� : " + number);

		System.out.print("�Ǽ� 1���� �Է����ּ��� : ");
		double number2 = sc.nextDouble(); // Ű����� �Ǽ����� �Է¹���
		System.out.println("����� �Է� �� : " + number2);
	}

	public void scan2() {
		Scanner sc = new Scanner(System.in); // ��ĳ�� ��� �غ� �Ϸ�
		// ���ڿ� �Է� �޴� ��� 1 -> ���� �Ұ�(���⸦ ���� �� �� ����)
		System.out.print("���ڿ� �Է�(���� �Ұ���) : ");
		String str1 = sc.next(); // Ű����� �Է��� ���ڿ��� str1�� ����(���� �Ұ���)

		System.out.println(str1);

		System.out.print("���ڿ� �Է�(���� ����) : ");
		sc.nextLine(); // buffer�� �����ִ� ���� ���ſ� �ڵ�
		String str2 = sc.nextLine();

		System.out.println(str2);

		// ���� �Է� �ޱ�
		System.out.print("���� 1�� �Է� : ");
		char ch1 = sc.next().charAt(0); // ���ڿ��� �޾ƿ� �� �� �� ù��° ����
		System.out.println("�Է��� ���ڴ� : " + ch1);
		
		System.out.println("���ڿ��� �Է��غ����� : ");
		char ch2 = sc.next().charAt(1);
		System.out.println(ch2);
	}

	public void scan3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� �Է�: ");
		String str1 = sc.nextLine();

		System.out.println(str1);
	}
	
	public void exam1() {
		// �̸�(String), ����(int), �ּ�(String), Ű(double), ������(double), ����(Char)�� �Է� �ް� ���
		// Ű�� ����, �����Դ� �Ҽ��� 1��° �ڸ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("�ּ� : ");
		String addr = sc.nextLine();
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		System.out.print("������ : ");
		double weight = sc.nextDouble();
		System.out.print("���� : ");
		char gender = sc.next().charAt(0);
		
		System.out.println("�̸� :" + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + addr);
		System.out.println("Ű : " + (int) height);
		System.out.printf("������ : %.1f\n", weight);
		System.out.println("���� : " + gender);

	}
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� �Է� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int math = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = (double) sum / 3;

		System.out.printf("��� ������ �� ���� %d���̰� ����� %.2f �Դϴ�!\n", sum, avg);
	}
	
}
