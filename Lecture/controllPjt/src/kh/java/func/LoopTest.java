package kh.java.func;

import java.util.Scanner;

public class LoopTest {

	public void loop() {
		Scanner sc = new Scanner(System.in);

		// while(true)
		for (;;) {
			System.out.print("한번 더 출력할까요(1.yes / 2.no)?");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("OK");
				continue;
			} else {
				break;
			}
		}
		System.out.println("끝");
		sc.close();
	}

	public void loop1() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("i : " + i);
			System.out.println("1 / 2 중 선택하세요");

			int sel = sc.nextInt();
			if (sel == 1) {
				continue;
			} else if (sel == 2) {
				break;
			} else {
				System.out.println("나머지");
			}

			System.out.println("반복문 마지막 코드!");
		}

		sc.close();
	}
}
