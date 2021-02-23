package kh.java.test;

import java.util.Scanner;

public class CalcMain {

	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 숫자 입력 : ");
		int num3 = sc.nextInt();

		CalcFuncTest cft = new CalcFuncTest();
		int result = cft.sum(num1, num2, num3);
		System.out.println(result);

		sc.close();
	}
}
