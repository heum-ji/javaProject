package kh.java.run;

import java.util.Scanner;

import kh.java.func.TV;

public class Start {

	public static void main(String[] args) {
		TV tv = new TV();
		Scanner sc = new Scanner(System.in);
		tv.power(); // TV 전원 끄기

		while (true) {
			System.out.println("1. 볼륨 업");
			System.out.println("2. 볼륨 다운");
			System.out.println("3. 채널 업");
			System.out.println("4. 채널 다운");
			System.out.println("5. 채널 변경");
			System.out.println("0. 전원 끄기");
			System.out.print("선택 > ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				tv.volUp();
				break;
			case 2:
				tv.volDown();
				break;
			case 3:
				tv.chUp();
				break;
			case 4:
				tv.chDown();
				break;
			case 5:
				System.out.print("채널 입력 : ");
				int changeCh = sc.nextInt();
				tv.chChange(changeCh);
				break;
			case 0:
				tv.power();
				sc.close();
				return;
			}
		}
	}
}