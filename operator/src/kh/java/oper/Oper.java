package kh.java.oper;

import java.util.Scanner;

public class Oper {
	public void test1() {
		int num1 = 10; // ������ ���� num1�� �����ϰ� 10����
		System.out.println("num1 : " + num1);
		num1 = 100; // num1 ������ 100 ����
		System.out.println("num1 : " + num1);
		// ���� num1���� +1�� �ؼ� �ٽ� num1�� ����
		num1 = num1 + 1;
		System.out.println("num1 : " + num1);
		num1 = num1 + 15;
		System.out.println("num1 : " + num1);
		num1 = num1 - 16;
		System.out.println("num1 : " + num1);

		num1 += 100;
		System.out.println("num1 : " + num1);
		num1 -= 100;
		System.out.println("num1 : " + num1);
		num1 *= 10;
		System.out.println("num1 : " + num1);
		num1 /= 3;
		System.out.println("num1 : " + num1);
		num1 %= 5;
		System.out.println("num1 : " + num1);
	}

	public void test2() {
		/*
		 * int num = 10; System.out.println("num : " + num); num++; // ���� ������ �ִ� ���� +1
		 * System.out.println("num : " + num); ++num; System.out.println("num : " +
		 * num); num--; System.out.println("num : " + num); --num;
		 * System.out.println("num : " + num);
		 * 
		 * int num1 = 10; int num2 = (num1++)+2; System.out.println(num1);
		 * System.out.println(num2);
		 */

		int a = 10;
		int b = 10;
		int c;
		c = (a++) + (++b) + a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public void test3() {
		int a = 15;
		int b = 20;
		int c = a & b;
		int d = a | b;
		int e = a ^ b;

		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �빮�� 1�� �Է� : ");
		char ch = sc.next().charAt(0);

		System.out.println("�ҹ��ڷ� ��ȯ : " + (char) (ch + 32));

		System.out.print("���� �ҹ��� 1�� �Է� : ");
		char ch1 = sc.next().charAt(0);

		System.out.println("�빮�ڷ� ��ȯ : " + (char) (ch1 - 32));
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		char ch = sc.next().charAt(0);
		System.out.println("��/�ҹ��� ��ȯ : " + (char) (ch ^ 32));

	}
}
