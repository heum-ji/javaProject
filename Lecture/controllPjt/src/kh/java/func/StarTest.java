package kh.java.func;

public class StarTest {

	// ���׸���
	// System.out.print("*"), System.out.print("")�� ���
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
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.print(i + 1);
			}

			System.out.println();
		}
	}

	public void star5() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.print(j + 1);
			}

			System.out.println();
		}
	}

	public void star6() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.print(j + 1 + i);
			}

			System.out.println();
		}
	}

	public void star7() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.print(j + 5 - i);
			}

			System.out.println();
		}
	}

	public void star8() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {

				System.out.print("*");
			}

			System.out.println();
		}
	}

	public void star9() {
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5 - i; j++) {

				System.out.print("*");
			}

			System.out.println();
		}
	}

	public void star10() {
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				String str = i > j ? " " : "*";

				System.out.print(str);
			}

			System.out.println();
		}
	}

	public void star11() {
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				String str = (4 - i) > j ? " " : "*";

				System.out.print(str);
			}

			System.out.println();
		}
	}

	public void star12() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; (i < 5) ? j < i : j < 10 - i; j++) { // ���ǹ����� ���׿����� ó�� ����
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void star13() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; (i < 5) ? j < 5 - i : j < i - 3; j++) { // ���ǹ����� ���׿����� ó�� ����
				System.out.print("*");
			}
			System.out.println();
		}
	}
}