package kh.hw.func;

public class Func {
	
	// 변수 출력 메서드
	public void printVar() {
	/*
	 * [ 문제 1 ]
	 * 아래 주어진 값에 해당하는 변수를 만들고 주어진 값으로 초기화 한 후
	 * 그 값을 출력하는 코드 작성
	 * 
	 * 정수형 100
	 * 정수형 9999억
	 * 실수형 486.520(float)
	 * 실수형 5697.890123
	 * 문자 A
	 * 문자열 Hello JAVA
	 * 논리 true
	 * 
	 * 모든 값은 변수에 저장하고 변수를 출력
	 * */

		int 	iNum = 100;
		long 	lNum = 999900000000L;
		float 	fNum = 486.520f;
		double	dNum = 5697.890123;
		char 	ch 	 = 'A';
		String 	str  = "Hello JAVA";
		boolean	bool = true;

		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.printf("fNum : %.3f\n", fNum); // 소숫점 3자리 출력
		System.out.println("dNum : " + dNum);
		System.out.println("ch   : " + ch);
		System.out.println("str  : " + str);
		System.out.println("bool : " + bool);
	}

	// 신상 정보 출력 메서드
	public void printMyInfo() {
		/*
		 * [ 문제 2 ] 
		 * 자신의 신상정보를 저장할 변수를 만들고 정보를 변수에 대입, 출력하는 프로그램 작성
		 * - 이름, 나이, 성별, 지역, 전화번호, 이메일	
		 * - 2명 이상 만들기
		 */
		// 내 신상정보
		String 	name 	= "백지흠";
		int 	age	 	= 28;
		char	gender	= '남';
		String 	addr	= "서울";
		String	telNum	= "01051414556";
		String	mail	= "dragon2009t@gmail.com";
		
		// 타인 신상정보
		String 	name2 	= "고길동";
		int 	age2	= 50;
		char	gender2	= '남';
		String 	addr2	= "경기도";
		String	telNum2	= "01098765432";
		String	mail2	= "mrgogo@email.com";
		
		System.out.println(); // 문제 1 다음 한 줄 비우기용
		System.out.printf("이름\t나이\t성별\t지역\t전화번호\t\t이메일\n"); // 열 구별용
		System.out.println("----------------------------------------------------------------------"); // 행 구별용
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s\n", name, age, gender, addr, telNum, mail);
		System.out.println("----------------------------------------------------------------------"); // 행 구별용
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s\n", name2, age2, gender2, addr2, telNum2, mail2);
		
	}
}