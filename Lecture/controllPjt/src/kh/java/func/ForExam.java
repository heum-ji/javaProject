package kh.java.func;

public class ForExam {

	// ������ ��� - ��
	public void exam1() {

		for (int i = 2; i <= 9; i++) { // 2 ~ 9��

			for (int j = 1; j <= 9; j++) { // ������ �ݺ�

				System.out.printf("%d*%d=%d\t", i, j, i * j); // ������ ���
			}

			System.out.println(); // ������ ������ ������
		}
	}

	// ������ ��� - ��
	public void exam2() {

		for (int i = 1; i <= 9; i++) { // ������ �ݺ�

			for (int j = 2; j <= 9; j++) { // 2 ~ 9 ��

				System.out.printf("%d*%d=%d\t", j, i, j * i); // ������ ���
			}

			System.out.println(); // ������ ���� ������
		}
	}

	
}
