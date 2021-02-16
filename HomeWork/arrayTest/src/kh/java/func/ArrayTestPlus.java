package kh.java.func;

import java.util.Scanner;

public class ArrayTestPlus {

	// snail1
	public void snail1() {
		Scanner sc = new Scanner(System.in);

		int[][] arr; // 배열
		int cnt = 0; // 카운트
		int row = 0; // 행
		int col = -1; // 열 - 가장 처음을 위해 1 감소시킴
		int direction = 1; // 방향 제어

		// col 증가 - row 증가 - col 감소 - row 감소
		System.out.print("2차원 배열 크기 입력(정방형) > ");
		int size = sc.nextInt(); // 배열 사이즈 입력

		arr = new int[size][size]; // 배열 사이즈 설정
		int cycle = size; // 반복 수 설정

		while (cycle > 0) { // 위/아래 끝처리
			for (int i = 0; i < cycle; i++) {
				col += direction; // right / left
				arr[row][col] = ++cnt;
			}
			cycle--; // 반복 수 감소

			if (cycle == 0) { // 좌/우 후 끝처리
				break;
			}

			for (int j = 0; j < cycle; j++) {
				row += direction; // down / up
				arr[row][col] = ++cnt;
			}
			direction *= -1; // 방향 전환
		} // snail 종료

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-2d\t", arr[i][j]); // 자리수 맞춤 - 왼쪽 정렬
			}
			System.out.println();
		}
		sc.close();
	}

	public void snail2() {

		Scanner sc = new Scanner(System.in);

		int[][] arr; // 배열
		int cnt = 0; // 카운트
		int row = 0; // 행
		int col = 0; // 열
		int direction = -1; // 방향 제어

		// col 감소 - row 증가 - col 증가 - row 감소
		System.out.print("2차원 배열 크기 입력(정방형) > ");
		int size = sc.nextInt(); // 배열 사이즈 입력

		arr = new int[size][size]; // 배열 사이즈 설정
		int cycle = size; // 반복 수 설정
		col = size; // 시작 col 설정

		while (cycle > 0) { // 위/아래 끝처리
			for (int i = 0; i < cycle; i++) {
				col += direction; // right / left
				arr[row][col] = ++cnt;
			}
			cycle--; // 반복 수 감소
			direction *= -1; // 방향 전환

			if (cycle == 0) { // 좌/우 후 끝처리
				break;
			}

			for (int j = 0; j < cycle; j++) {
				row += direction; // down / up
				arr[row][col] = ++cnt;
			}
		} // snail 종료

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-2d\t", arr[i][j]); // 자리수 맞춤 - 왼쪽 정렬
			}
			System.out.println();
		}
		sc.close();
	}
}