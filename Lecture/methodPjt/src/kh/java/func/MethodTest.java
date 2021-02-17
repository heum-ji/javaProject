package kh.java.func;

import java.util.Scanner;

public class MethodTest {

	public void test11() {
		int num1 = 10;
		int num2 = 10;
		int num3 = 10;
		int num4 = 10;
		int result = sum(num1, num2);
		int result2 = sum(num1, num2, num3);
		int result3 = sum(num1, num2, num3, num4);

		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}

	// 두 수를 매개변수로 받아서 합친 값을 리턴하는 메서드
	public int sum(int num1, int num2) {
		return (num1 + num2);
	}

	// 세 수를 매개변수로 받아서 합친 값을 리턴하는 메서드
	public int sum(int num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}

	// 네 수를 매개변수로 받아서 합친 값을 리턴하는 메서드
	public int sum(int num1, int num2, int num3, int num4) {
		return (num1 + num2 + num3 + num4);
	}

	public void test2() {
		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		test3(arr[2]);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		test4(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void test3(int num) {
		num += 100;
		System.out.println(num);
	}

	public void test4(int[] arr1) {
		arr1[2] += 100;
		System.out.println(arr1[2]);
	}

	public void main() {
		Scanner sc = new Scanner(System.in);

		System.out.println("메인메소드입니다!!");
		test1();
		String today = today();
		System.out.println(today);

		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();

		System.out.println("정수의 합 : " + sum(num1, num2));
		sc.close();
	}

	public void test1() {
		System.out.println("첫번째 테스트 메소드 입니다.");
		return; // void 여도 method 끝내고 싶은 경우 return 할 수 있음
	}

	public String today() {
		return "2021-02-17"; // return은 값을 되돌려주면서 해당 메서드 종료
	}

	// 정수 1개를 매개변수로 받아서 홀수인지 짝수인지 판단해주는 메소드
	public int check1(int num1) {
		return num1 % 2;
	}

	// 전달 받은 매개변수가 짝수면 true 리턴 / 홀수면 false 리턴
	public boolean check2(int num1) {
		return num1 % 2 == 0 ? true : false;
	}

	public String check3(int num1) {
		return num1 % 2 == 0 ? "짝수" : "홀수";
	}

	/*
	 * public int sum(int num1, int num2) { return num1 + num2; }
	 */
}