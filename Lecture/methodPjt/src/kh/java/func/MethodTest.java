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

	// �� ���� �Ű������� �޾Ƽ� ��ģ ���� �����ϴ� �޼���
	public int sum(int num1, int num2) {
		return (num1 + num2);
	}

	// �� ���� �Ű������� �޾Ƽ� ��ģ ���� �����ϴ� �޼���
	public int sum(int num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}

	// �� ���� �Ű������� �޾Ƽ� ��ģ ���� �����ϴ� �޼���
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

		System.out.println("���θ޼ҵ��Դϴ�!!");
		test1();
		String today = today();
		System.out.println(today);

		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();

		System.out.println("������ �� : " + sum(num1, num2));
		sc.close();
	}

	public void test1() {
		System.out.println("ù��° �׽�Ʈ �޼ҵ� �Դϴ�.");
		return; // void ���� method ������ ���� ��� return �� �� ����
	}

	public String today() {
		return "2021-02-17"; // return�� ���� �ǵ����ָ鼭 �ش� �޼��� ����
	}

	// ���� 1���� �Ű������� �޾Ƽ� Ȧ������ ¦������ �Ǵ����ִ� �޼ҵ�
	public int check1(int num1) {
		return num1 % 2;
	}

	// ���� ���� �Ű������� ¦���� true ���� / Ȧ���� false ����
	public boolean check2(int num1) {
		return num1 % 2 == 0 ? true : false;
	}

	public String check3(int num1) {
		return num1 % 2 == 0 ? "¦��" : "Ȧ��";
	}

	/*
	 * public int sum(int num1, int num2) { return num1 + num2; }
	 */
}