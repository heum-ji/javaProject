package kr.or.iei.func;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ApiClass {

	public void math() {
		System.out.println(Math.abs(-1)); // 절대값 -> 부ㅗ를 모두 +로
		// 올림, 버림, 반올림
		System.out.println(Math.ceil(10.1)); // 올림 11.0
		System.out.println(Math.floor(10.9)); // 버림 10.0
		System.out.println(Math.round(10.5)); // 반올림 11

		// 134.56 -> 135 -> 1.35
		System.out.println(Math.round(1.3456 * 100) / (double) 100);
		// 123.45 -> 123 -> 12300
		System.out.println(Math.round(12345 / (double) 100) * 100);
		System.out.println(Math.random()); // 0.0 ~ 1.0 랜덤
	}

	public void calendar() {
		// GregorianCalendar 객체를 생성함 (Calendar는 추상클래스로 객체 생성 불가)
		// 한국 표준시간대 정보를 가져옴
		Calendar today = Calendar.getInstance();

		System.out.print(today.get(Calendar.YEAR) + "년 "); // 년도 출력
		System.out.print(today.get(Calendar.MONTH) + 1 + "월 "); // 월 출력 // 0 ~ 11 이므로 + 1처리
		System.out.print(today.get(Calendar.DATE) + "일 "); // 일 출력
		System.out.println(today.get(Calendar.DAY_OF_WEEK) + "요일 ");
		if (today.get(Calendar.AM_PM) == 0) { // AM == 0, PM == 1
			System.out.print("AM ");
			// today.get
		} else {
			System.out.print("PM ");
		}
		// today.set(Calendar.DATE, 27);
		System.out.print(today.get(Calendar.HOUR) + "시 "); // 시간
		System.out.print(today.get(Calendar.MINUTE) + "분 "); // 분
		System.out.println(today.get(Calendar.SECOND) + "초"); // 초
		System.out.println();
	}

	public void date() {
		// 현재 시스템으로부터 현재 날짜, 시간 정보를 가져옴
		Date today = new Date();

		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		String todayString = format.format(today);
		System.out.println(todayString);
	}

	/**
	 * 강사님 방법
	 */
	public void dDay() {
		Scanner sc = new Scanner(System.in);

		Calendar cal = Calendar.getInstance(); // 오늘 날짜
		long today = cal.getTimeInMillis(); // 1960 ~ 오늘 날짜까지 ms초 환산

		// 입력
		System.out.println("========== D-Day계산기 ==========");
		System.out.print("D-Day [년도] 입력 : ");
		int inputYear = sc.nextInt();
		System.out.print("D-Day [월] 입력 : ");
		int inputMonth = sc.nextInt();
		System.out.print("D-Day [일] 입력 : ");
		int inputDay = sc.nextInt();

		cal.set(Calendar.YEAR, inputYear);
		cal.set(Calendar.MONTH, inputMonth - 1);
		cal.set(Calendar.DATE, inputDay);
		long dday = cal.getTimeInMillis(); // 1960 ~ dday 날짜까지 ms초 환산
		long time = dday - today; // 두 날짜 사이의 차이값(ms)
		long d = time / 86400000; // ms -> day 변환
		
		if (d == 0) { // D-Day
			System.out.println("D-Day 입니다.");
		} else if (d > 0) { // d-day
			System.out.println(d + "일 남았습니다.");
		} else if (d < 0) { // d-day
			System.out.println(Math.abs(d) + "일 지났습니다.");
		}
		
		sc.close();
	}

	/**
	 * 먼저 내가 한 방법
	 */
	public void dDayCalc() {
		Calendar dDay = Calendar.getInstance();
		Date today = new Date(); // 현재 시스템으로부터 현재 날짜, 시간 정보를 가져옴
		// Date dDay = new Date();
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy년 M월 d일");
		String todayString = dayFormat.format(today);
		String dDayString = null;
		long dTime = 0l;

		// 입력
		System.out.println("========== D-Day계산기 ==========");
		System.out.print("D-Day [년도] 입력 : ");
		int inputYear = sc.nextInt();
		System.out.print("D-Day [월] 입력 : ");
		int inputMonth = sc.nextInt();
		System.out.print("D-Day [일] 입력 : ");
		int inputDay = sc.nextInt();

		// 처리
		dDay.set(Calendar.YEAR, inputYear);
		dDay.set(Calendar.MONTH, inputMonth - 1); // 컴퓨터 0 ~ 11 보정
		dDay.set(Calendar.DATE, inputDay);
		dDayString = dayFormat.format(dDay.getTime());
		dTime = today.getTime() / 1000 - dDay.getTimeInMillis() / 1000; // ms -> s 처리

		// 출력
		System.out.println("오늘 날짜 : " + todayString);
		System.out.println("D-Day 날짜  : " + dDayString);

		// 하루 처리
		dTime /= 86400L;

		// D-Day 처리
		if (dTime == 0) { // D-Day
			System.out.println("D-Day 입니다.");
		} else if (dTime > 0) { // d-day
			System.out.println(dTime + "일 지났습니다.");
		} else if (dTime < 0) { // d-day
			System.out.println(Math.abs(dTime) + "일 남았습니다.");
		}
		sc.close();
	}

}