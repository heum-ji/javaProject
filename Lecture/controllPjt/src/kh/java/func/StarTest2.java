package kh.java.func;

public class StarTest2 {

	public void star16() {

		int starCnt = 1; // �� ��
		int blank = 4; // ���� ��

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < blank; j++)
				System.out.print(" ");

			for (int j = 0; j < starCnt; j++)
				System.out.print("*");

			starCnt += 2; // �� 2�� ����
			blank--; // ���� 1 ����

			System.out.println();
		}
	}

	public void star17() {

		int starCnt = 9; // �� ��
		int blank = 0; // ���� ��

		for (int i = 0; i < 5; i++) {

			for (int k = 0; k < blank; k++)
				System.out.print(" ");

			for (int j = 0; j < starCnt; j++)
				System.out.print("*");

			starCnt -= 2; // �� 2�� ����
			blank++; // ���� 1 ����

			System.out.println();
		}
	}

	public void star18() {

		int starCnt = 1; // �� ��
		int blank = 4; // ���� ��
		boolean isFinish = false; // �߰� üũ

		for (int i = 0; i < 9; i++) {

			for (int k = 0; k < blank; k++)
				System.out.print(" ");

			for (int j = 0; j < starCnt; j++)
				System.out.print("*");

			if (isFinish) {
				starCnt -= 2; // �� 2���� ����
				blank++; // ���� 1�� ����
			} else if (starCnt == 9) {
				starCnt -= 2; // �� 2�� ����
				blank++; // ���� 1 ����
				isFinish = true;
			} else {
				starCnt += 2; // �� 2�� ����
				blank--; // ���� 1 ����
			}

			System.out.println();
		}
	}

	public void star19() {

		int starCnt = 5; // �� ��
		int blank = 1; // ���� ��
		boolean isFinish = false; // �߰� üũ

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
				starCnt++; // �� 1�� ����
				blank -= 2; // ���� 2 ����
			} else if (blank == 9) {
				starCnt++; // �� 1�� ����
				blank -= 2; // ���� 2 ����
				isFinish = true;
			} else {
				starCnt--; // �� 1�� ����
				blank += 2; // ���� 2 ����
			}

			System.out.println();
		}
	}

	public void star20() {

		int starCnt = 1; // �� ��
		int blank = 9; // ���� ��
		boolean isFinish = false; // �߰� üũ

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
				starCnt--; // �� 1�� ����
				blank += 2; // ���� 2 ����
			} else if (blank == 1) {
				starCnt--; // �� 1�� ����
				blank += 2; // ���� 2 ����
				isFinish = true;
			} else {
				starCnt++; // �� 1�� ����
				blank -= 2; // ���� 2 ����
			}

			System.out.println();
		}
	}

	public void star21() {

		int starCnt = 9; // �� ��
		int blank = 1; // ���� ��
		boolean isFinish = false; // �߰� üũ

		for (int i = 0; i < 9; i++) {

			for (int k = 0; k < blank; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j < starCnt; j++) {
				System.out.print("*");
			}

			if (isFinish) {
				starCnt += 2; // �� 2�� ����
				blank--; // ���� 1 ����
			} else if (starCnt == 1) {
				starCnt += 2; // �� 2�� ����
				blank--; // ���� 1 ����
				isFinish = true;
			} else {
				starCnt -= 2; // �� 2�� ����
				blank++; // ���� 1 ����
			}

			System.out.println();

		}
	}
}