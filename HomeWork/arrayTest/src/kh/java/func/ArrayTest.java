package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest {

	public void exam1_1() {
		int[][] arr = new int[5][5];
		int cnt = 0;

		// �Ųٷ� �� �ֱ�
		for (int i = 0; i < arr.length; i++) {

			for (int j = arr[i].length - 1; j > -1; j--) {
				arr[i][j] = ++cnt;
			}
		}

		// ���
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println("\n");
		}
	}

	public void exam1_2() {
		int[][] arr = new int[5][5];
		int cnt = 0;

		// ������ �� �ֱ�
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				arr[j][i] = ++cnt;
			}
		}

		// ���
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println("\n");
		}
	}

	public void exam1_3() {
		int[][] arr = new int[5][5];
		int cnt = 0;

		// ������ �� �ֱ�
		for (int i = 0; i < arr.length; i++) {

			for (int j = arr[i].length - 1; j > -1; j--) {
				arr[j][i] = ++cnt;
			}
		}

		// ���
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println("\n");
		}
	}

	public void exam1_4() {
		int[][] arr = new int[5][5];
		int cnt = 0;

		// �������
		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 1) {

				for (int j = arr[i].length - 1; j > -1; j--) {
					arr[i][j] = ++cnt;
				}
			} else {

				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = ++cnt;
				}
			}
		}

		// ���
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println("\n");
		}
	}

	public void exam2() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int[][] arr; // �迭
		int row = 0; // ��
		int col = 0; // ��

		// �� �Է�
		while (true) {
			System.out.print("�������� ������ �Է��ϼ���(1~10) ==> ");
			row = sc.nextInt();

			if (row >= 1 && row <= 10) { // ����
				break;
			} else { // ������
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
			}
		}

		// �� �Է�
		while (true) {
			System.out.print("���ο��� ������ �Է��ϼ���(1~10) ==> ");
			col = sc.nextInt();

			if (col >= 1 && col <= 10) { // ����
				arr = new int[row][col]; // �Է� ���� �࿭ �Է�
				break;
			} else { // ������
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int random = r.nextInt(26) + 97; // ���ĺ� �ҹ��� ����
				arr[i][j] = random; // ���� �� ����
				System.out.printf("%c ", arr[i][j]); // ���ĺ� �ҹ��ڷ� ��ȯ �� ���
			}
			System.out.println();
		}
		sc.close();
	}
}