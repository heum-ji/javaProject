package kh.java.func;

import java.util.Scanner;

public class ArrayTestPlus {

	// snail1
	public void snail1() {
		Scanner sc = new Scanner(System.in);

		int[][] arr; // �迭
		int cnt = 0; // ī��Ʈ
		int row = 0; // ��
		int col = -1; // �� - ���� ó���� ���� 1 ���ҽ�Ŵ
		int direction = 1; // ���� ����

		// col ���� - row ���� - col ���� - row ����
		System.out.print("2���� �迭 ũ�� �Է�(������) > ");
		int size = sc.nextInt(); // �迭 ������ �Է�

		arr = new int[size][size]; // �迭 ������ ����
		int cycle = size; // �ݺ� �� ����

		while (cycle > 0) { // ��/�Ʒ� ��ó��
			for (int i = 0; i < cycle; i++) {
				col += direction; // right / left
				arr[row][col] = ++cnt;
			}
			cycle--; // �ݺ� �� ����

			if (cycle == 0) { // ��/�� �� ��ó��
				break;
			}

			for (int j = 0; j < cycle; j++) {
				row += direction; // down / up
				arr[row][col] = ++cnt;
			}
			direction *= -1; // ���� ��ȯ
		} // snail ����

		// ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-2d\t", arr[i][j]); // �ڸ��� ���� - ���� ����
			}
			System.out.println();
		}
		sc.close();
	}

	public void snail2() {

		Scanner sc = new Scanner(System.in);

		int[][] arr; // �迭
		int cnt = 0; // ī��Ʈ
		int row = 0; // ��
		int col = 0; // ��
		int direction = -1; // ���� ����

		// col ���� - row ���� - col ���� - row ����
		System.out.print("2���� �迭 ũ�� �Է�(������) > ");
		int size = sc.nextInt(); // �迭 ������ �Է�

		arr = new int[size][size]; // �迭 ������ ����
		int cycle = size; // �ݺ� �� ����
		col = size; // ���� col ����

		while (cycle > 0) { // ��/�Ʒ� ��ó��
			for (int i = 0; i < cycle; i++) {
				col += direction; // right / left
				arr[row][col] = ++cnt;
			}
			cycle--; // �ݺ� �� ����
			direction *= -1; // ���� ��ȯ

			if (cycle == 0) { // ��/�� �� ��ó��
				break;
			}

			for (int j = 0; j < cycle; j++) {
				row += direction; // down / up
				arr[row][col] = ++cnt;
			}
		} // snail ����

		// ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-2d\t", arr[i][j]); // �ڸ��� ���� - ���� ����
			}
			System.out.println();
		}
		sc.close();
	}
}