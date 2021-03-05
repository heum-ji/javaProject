package kh.java.run;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// Scantest st = new Scantest();
		// st.exam2();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("문자열 입력 : ");
			String str = sc.next();
			System.out.println(str.toLowerCase());
		}

	}

}
