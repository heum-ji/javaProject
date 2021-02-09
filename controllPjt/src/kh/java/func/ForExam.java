package kh.java.func;

public class ForExam {

	// 구구단 출력 - 행
	public void exam1() {

		for (int i = 2; i <= 9; i++) { // 2 ~ 9단

			for (int j = 1; j <= 9; j++) { // 구구단 반복

				System.out.printf("%d*%d=%d\t", i, j, i * j); // 구구단 출력
			}

			System.out.println(); // 구구단 행으로 나누기
		}
	}

	// 구구단 출력 - 열
	public void exam2() {

		for (int i = 1; i <= 9; i++) { // 구구단 반복

			for (int j = 2; j <= 9; j++) { // 2 ~ 9 단

				System.out.printf("%d*%d=%d\t", j, i, j * i); // 구구단 출력
			}

			System.out.println(); // 구구단 열로 나누기
		}
	}

	
}
