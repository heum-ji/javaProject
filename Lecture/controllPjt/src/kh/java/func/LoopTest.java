package kh.java.func;

import java.util.Scanner;

public class LoopTest {

	public void loop() {
		Scanner sc = new Scanner(System.in);

		// while(true)
		for (;;) {
			System.out.print("�ѹ� �� ����ұ��(1.yes / 2.no)?");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("OK");
				continue;
			} else {
				break;
			}
		}
		System.out.println("��");
		sc.close();
	}

	public void loop1() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("i : " + i);
			System.out.println("1 / 2 �� �����ϼ���");

			int sel = sc.nextInt();
			if (sel == 1) {
				continue;
			} else if (sel == 2) {
				break;
			} else {
				System.out.println("������");
			}

			System.out.println("�ݺ��� ������ �ڵ�!");
		}

		sc.close();
	}
}
