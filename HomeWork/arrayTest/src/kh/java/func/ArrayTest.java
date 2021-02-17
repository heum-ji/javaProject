package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest {

	public void exam1_1() {
		int[][] arr = new int[5][5];
		int cnt = 0;

		// 거꾸로 값 넣기
		for (int i = 0; i < arr.length; i++) {

			for (int j = arr[i].length - 1; j > -1; j--) {
				arr[i][j] = ++cnt;
			}
		}

		// 출력
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

		// 열마다 값 넣기
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				arr[j][i] = ++cnt;
			}
		}

		// 출력
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

		// 열마다 값 넣기
		for (int i = 0; i < arr.length; i++) {

			for (int j = arr[i].length - 1; j > -1; j--) {
				arr[j][i] = ++cnt;
			}
		}

		// 출력
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

		// 지그재그
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

		// 출력
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

		int[][] arr; // 배열
		int row = 0; // 행
		int col = 0; // 열

		// 행 입력
		while (true) {
			System.out.print("가로행의 개수를 입력하세요(1~10) ==> ");
			row = sc.nextInt();

			if (row >= 1 && row <= 10) { // 정상
				break;
			} else { // 비정상
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}

		// 열 입력
		while (true) {
			System.out.print("세로열의 개수를 입력하세요(1~10) ==> ");
			col = sc.nextInt();

			if (col >= 1 && col <= 10) { // 정상
				arr = new int[row][col]; // 입력 받은 행열 입력
				break;
			} else { // 비정상
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int random = r.nextInt(26) + 97; // 알파벳 소문자 랜덤
				arr[i][j] = random; // 랜덤 값 대입
				System.out.printf("%c ", arr[i][j]); // 알파벳 소문자로 변환 후 출력
			}
			System.out.println();
		}
		sc.close();
	}
}