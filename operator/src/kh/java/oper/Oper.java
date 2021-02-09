package kh.java.oper;

import java.util.Scanner;

public class Oper {
	public void test1() {
		int num1 = 10; // 정수형 변수 num1을 선언하고 10대입
		System.out.println("num1 : " + num1);
		num1 = 100; // num1 변수에 100 대입
		System.out.println("num1 : " + num1);
		// 현재 num1값에 +1을 해서 다시 num1에 대입
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
		 * int num = 10; System.out.println("num : " + num); num++; // 현재 변수에 있는 값에 +1
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
		System.out.print("영어 대문자 1개 입력 : ");
		char ch = sc.next().charAt(0);

		System.out.println("소문자로 변환 : " + (char) (ch + 32));

		System.out.print("영어 소문자 1개 입력 : ");
		char ch1 = sc.next().charAt(0);

		System.out.println("대문자로 변환 : " + (char) (ch1 - 32));
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어 문자 입력 : ");
		char ch = sc.next().charAt(0);
		System.out.println("대/소문자 변환 : " + (char) (ch ^ 32));

	}
}
