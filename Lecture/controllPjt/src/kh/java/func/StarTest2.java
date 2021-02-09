package kh.java.func;

public class StarTest2 {

	public void star16() {

		int starCnt = 1; // 별 수
		int blank = 4; // 공백 수

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < blank; j++)
				System.out.print(" ");

			for (int j = 0; j < starCnt; j++)
				System.out.print("*");

			starCnt += 2; // 별 2개 증가
			blank--; // 공백 1 감소

			System.out.println();
		}
	}

	public void star17() {

		int starCnt = 9; // 별 수
		int blank = 0; // 공백 수

		for (int i = 0; i < 5; i++) {

			for (int k = 0; k < blank; k++)
				System.out.print(" ");

			for (int j = 0; j < starCnt; j++)
				System.out.print("*");

			starCnt -= 2; // 별 2개 감소
			blank++; // 공백 1 증가

			System.out.println();
		}
	}

	public void star18() {

		int starCnt = 1; // 별 수
		int blank = 4; // 공백 수
		boolean isFinish = false; // 중간 체크

		for (int i = 0; i < 9; i++) {

			for (int k = 0; k < blank; k++)
				System.out.print(" ");

			for (int j = 0; j < starCnt; j++)
				System.out.print("*");

			if (isFinish) {
				starCnt -= 2; // 별 2개씩 감소
				blank++; // 공백 1씩 증가
			} else if (starCnt == 9) {
				starCnt -= 2; // 별 2개 증가
				blank++; // 공백 1 감소
				isFinish = true;
			} else {
				starCnt += 2; // 별 2개 증가
				blank--; // 공백 1 감소
			}

			System.out.println();
		}
	}

	public void star19() {

		int starCnt = 5; // 별 수
		int blank = 1; // 공백 수
		boolean isFinish = false; // 중간 체크

		for (int i = 0; i < 9; i++) {

			for (int k = 0; k < starCnt; k++) {
				System.out.print("*");
			}

			for (int j = 0; j < blank; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < starCnt; k++) {
				System.out.print("*");
			}

			if (isFinish) {
				starCnt++; // 별 1개 증가
				blank -= 2; // 공백 2 감소
			} else if (blank == 9) {
				starCnt++; // 별 1개 증가
				blank -= 2; // 공백 2 감소
				isFinish = true;
			} else {
				starCnt--; // 별 1개 감소
				blank += 2; // 공백 2 증가
			}

			System.out.println();
		}
	}

	public void star20() {

		int starCnt = 1; // 별 수
		int blank = 9; // 공백 수
		boolean isFinish = false; // 중간 체크

		for (int i = 0; i < 9; i++) {

			for (int k = 0; k < starCnt; k++) {
				System.out.print("*");
			}

			for (int j = 0; j < blank; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < starCnt; k++) {
				System.out.print("*");
			}

			if (isFinish) {
				starCnt--; // 별 1개 감소
				blank += 2; // 공백 2 증가
			} else if (blank == 1) {
				starCnt--; // 별 1개 감소
				blank += 2; // 공백 2 증가
				isFinish = true;
			} else {
				starCnt++; // 별 1개 증가
				blank -= 2; // 공백 2 감소
			}

			System.out.println();
		}
	}

	public void star21() {

		int starCnt = 9; // 별 수
		int blank = 1; // 공백 수
		boolean isFinish = false; // 중간 체크

		for (int i = 0; i < 9; i++) {

			for (int k = 0; k < blank; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j < starCnt; j++) {
				System.out.print("*");
			}

			if (isFinish) {
				starCnt += 2; // 별 2개 증가
				blank--; // 공백 1 감소
			} else if (starCnt == 1) {
				starCnt += 2; // 별 2개 증가
				blank--; // 공백 1 증가
				isFinish = true;
			} else {
				starCnt -= 2; // 별 2개 감소
				blank++; // 공백 1 증가
			}

			System.out.println();

		}
	}
}