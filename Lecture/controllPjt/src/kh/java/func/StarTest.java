package kh.java.func;

public class StarTest {

	// 별그리기
	// System.out.print("*"), System.out.print("")만 사용
	public void star1() {

		for (int i = 0; i < 5; i++)

			System.out.print("*");

	}

	public void star2() {

		for (int i = 0; i < 5; i++)

			System.out.println("*");

	}

	public void star3() {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				System.out.print("*");
			}

			System.out.println();
		}
	}

	public void star4() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				System.out.print(i);
			}

			System.out.println();
		}
	}

	public void star5() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				System.out.print(j);
			}

			System.out.println();
		}
	}

	public void star6() {

		for (int i = 1; i <= 5; i++) {

			for (int j = i; j < i + 5; j++) {

				System.out.print(j);
			}

			System.out.println();
		}
	}

	public void star7() {

		for (int i = 5; i >= 1; i--) {

			for (int j = i; j < i + 5; j++) {

				System.out.print(j);
			}

			System.out.println();
		}
	}

	public void star8() {

		int starCnt = 1;

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < starCnt; j++) {

				System.out.print("*");
			}
			starCnt++;

			System.out.println();
		}
	}

	public void star9() {

		int starCnt = 5;

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < starCnt; j++) {

				System.out.print("*");
			}
			starCnt--;

			System.out.println();
		}
	}

	public void star10() {

		int starCnt = 0;

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				String str = starCnt > j ? " " : "*";

				System.out.print(str);
			}
			starCnt++;

			System.out.println();
		}
	}

	public void star11() {

		int starCnt = 4;

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				String str = starCnt > j ? " " : "*";

				System.out.print(str);
			}
			starCnt--;

			System.out.println();
		}
	}

	public void star12() {

		int starCnt = 1;
		boolean isFinish = false;

		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < starCnt; j++) {

				System.out.print("*");
			}

			if (isFinish)
				starCnt--;
			else if (starCnt == 5) {
				isFinish = true;
				starCnt--;
			} else
				starCnt++;

			System.out.println();
		}
	}

	public void star13() {

		int starCnt = 5;
		boolean isFinish = false;

		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < starCnt; j++) {

				System.out.print("*");
			}

			if (isFinish)
				starCnt++;
			else if (starCnt == 1) {
				isFinish = true;
				starCnt++;
			} else
				starCnt--;

			System.out.println();
		}
	}
}