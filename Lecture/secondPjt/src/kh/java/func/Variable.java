package kh.java.func;

public class Variable {
	public void test1() {
		// 정수형 변수 선언
		int num;
		// System.out.println(num);
		// 정수형 변수 num 정수값 10 대입
		num = 10; // 첫번째로 변수에 값을 대입하는 것 -> 변수 초기화
		System.out.println(num);
		num = 100;// = : 대입연산자 -> 오른쪽의 값을 왼쪽에 대입한다.
		System.out.println(num);

		int num1 = 100; // 정수형 변수 num1을 선언하면서 100으로 초기화
		System.out.println(num1);
	}

	public void test2() {
		// 논리형 변수 선언 후 true 대입
		boolean bool = true;
		// 문자형 변수 선언 후 문자 A 대입
		char ch = 'A';
		// 정수형 변수 선언 후 값 대입 (총 4개)
		// byte형 변수 선언 후 값 대입
		byte bNum = 100;
		// short형 변수 선언 후 값 대입
		short sNum = 150;
		// int형 변수 선언 후 값 대입
		int iNum = 1000;
		// long형 변수 선업 후 값 대입
		long lNum = 100000000l;
		// 실수형 변수 선언 후 값 대입(총 2개)
		// float형 변수 선언 후 값 대입
		float fNum = 123.11f;
		// double형 변수 선언 후 값 대입
		double dNum = 3.14;
		// 문자열 변수 선언 후 값 대입
		String str = "Hello Java";
		// 상수형 변수 선언 후 값 대입
		final double PI = 3.14;

		System.out.println("논리형 변수의 값 : " + bool);
		System.out.println("문자형 변수의 값 : " + ch);
	}

	public void test3() {
		// byte 데이터 타입의 표현 범위 : -128 ~ 127
		byte bNum = 10;
		int iNum = bNum; // bNum변수의 값을 복사해서 자동으로 int로 형변환하여 대입

		int number1 = 128;
		byte number2 = (byte) number1;
		System.out.println(number1);
		System.out.println(number2);

		int num1 = 2147483647;
		long num2 = (long) num1 + 1;
		System.out.println(num2);
	}

	public void test4() {
		System.out.println("안녕하세요");
		System.out.println("저는");
		System.out.println("ab입니다.");
	}

	public void test5() {
		System.out.print("안녕하세요");
		System.out.print("저는");
		System.out.print("ab입니다.");
	}

	public void test6() {
		// 1. 문자열 변수 name 생성 후 본인이름 대입
		// 2. 정수형 변수 age 생성 후 본인 나이 대입
		// 3. 문자열 변수 addr 생성 후 주소 대입 (서울, 인천, 부산)
		// 4. 최종출력문
		// -> 안녕하세요 xxx입니다. 제 나이는 xx살이고 주소는 xx입니다.

		String name = "백지흠";
		int age = 28;
		String addr = "서울";

		System.out.println("안녕하세요 " + name + "입니다. 제 나이는 " + age + "살이고 주소는 " + addr + "입니다.");

		// System.out.printf("안녕하세요 %s입니다. 제 나이는 %d살이고 주소는 %s입니다.", name, age, addr);
		System.out.printf("실수 값 : %.2f", 3.11554455);
	}

	public void test7() {

		System.out.println("안녕하세요 네오입니다.\n제 나이는 20살이고\n주소는 서울입니다.");
		System.out.println("역슬래쉬를 출력하고 싶을 때는 \\\\ 두번쓰면 나옴");
		System.out.println("안\t녕\t하\t세\t요");
		System.out.println("자바에서 문자열을 표현하기 위해서는 쌍따옴표(\")를 사용합니다.");
	}
}
