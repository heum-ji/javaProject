package kr.or.iei.func;

import java.util.Random;
import java.util.StringTokenizer;

public class StringClass {

	public void test1() {
		StringBuffer sb = new StringBuffer();
		sb.append("hi"); // 현재 문자열 끝에 매개변수로 전달된 값 추가
		System.out.println(sb);
		sb.append(" 안녕");
		System.out.println(sb);
		sb.append(" test");
		System.out.println(sb);
		sb.insert(3, "삽입구문"); // offset 위치 insert
		System.out.println(sb);
		sb.insert(7, " 여기 ");
		System.out.println(sb);
		sb.replace(0, 5, "수정"); // start ~ end 수정
		System.out.println(sb);
		sb.delete(5, 8);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

		StringBuffer joinCode = new StringBuffer();
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			joinCode.append(r.nextInt(10));
		}
		System.out.println(joinCode);
	}

	public void test2() {
		// 문자열을 분석해서 토큰으로 분리시킴
		String str = "백지흠/서울/학생";
		StringTokenizer st = new StringTokenizer(str, "/"); // "/"기준으로 str 자르기
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		// st.hasMoreTokens(); // 현재 토큰이 남아있는지 확인하여 boolean 리턴 해줌
		//
		// System.out.println(st.countTokens());
		// System.out.println(st.hasMoreTokens());
		// System.out.println(st.nextToken());
		// System.out.println(st.nextToken());
		// System.out.println(st.nextToken());
		// System.out.println(st.countTokens());
		// System.out.println(st.hasMoreTokens());

	}

	// StringTokenizer를 이용해서 공백을 통해 토큰으로 분리
	// 1. 분리된 토큰을 char[]에 저장
	// 2. char[]에 저장된 값을 모두 대문자로 변환하여 문자열로 저장하여 출력 (StringBuffer)
	public void exam1() {
		String str = "J a v a P r o g r a m";
		StringTokenizer sT = new StringTokenizer(str, " ");
		StringBuffer sB = new StringBuffer();
		char[] chArr = new char[sT.countTokens()];

		for (int i = 0; i < chArr.length; i++) {
			chArr[i] = sT.nextToken().charAt(0);

			if ('a' <= chArr[i] && chArr[i] <= 'z') {
				chArr[i] -= 32;
			}
			sB.append(chArr[i]);
		}
		System.out.println(sB);
	}
}