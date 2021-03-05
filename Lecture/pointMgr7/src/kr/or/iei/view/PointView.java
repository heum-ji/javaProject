package kr.or.iei.view;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import kr.or.iei.vo.Bronze;
import kr.or.iei.vo.Gold;
import kr.or.iei.vo.Grade;
import kr.or.iei.vo.Platinum;
import kr.or.iei.vo.Silver;

public class PointView {
	Scanner sc;

	public PointView() {
		super();
		sc = new Scanner(System.in);
	}

	public int showMenu() {
		System.out.println("\n===== 회원 관리 프로그램 v7 =====");
		System.out.println("1. 회원 등록");
		System.out.println("2. 전체 회원 출력");
		System.out.println("3. 회원 정보 출력(1명)");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 회원 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");

		return (sc.nextInt());
	}

	public Grade getMember(String str) {
		Grade member = null;
		String grade = "";
		System.out.println("\n===== 회원 " + str + " =====");

		while (true) { // 등급 거르기
			System.out.print(str + " 등급 [bronze/silver/gold/platinum] : ");
			grade = sc.next();

			if (grade.equals("bronze") || grade.equals("silver") || grade.equals("gold") || grade.equals("platinum")) {
				break;
			} else {
				System.out.println("잘못된 등급을 입력 하셨습니다. 다시 입력해주세요.");
			}
		}

		System.out.print(str + " 이름 : ");
		String name = sc.next();
		System.out.print(str + " 포인트 : ");
		int point = sc.nextInt();

		if (grade.equals("bronze")) {
			member = new Bronze(grade, name, point);
		} else if (grade.equals("silver")) {
			member = new Silver(grade, name, point);
		} else if (grade.equals("gold")) {
			member = new Gold(grade, name, point);
		} else { // platinum
			member = new Platinum(grade, name, point);
		}

		System.out.println(str + " 완료\n");
		return member;
	}

	public void printAllMember(HashMap<String, Grade> members) {
		System.out.println("\n===== 전체 멤버 출력 =====");
		System.out.println("등급\t이름\t포인트\t보너스");

		Set<String> keys = members.keySet(); // 전체 키 추출

		// 전체 키 출력
		for (String key : keys) {
			System.out.println(members.get(key));
		}
	}

	public void printOneMember(Grade member) {
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println(member);
	}

	public String getName(String str) {
		System.out.print(str + "할 멤버 이름 : ");
		return sc.next();
	}

	public void printMsg(String msg) {
		System.out.println(msg);
	}
}
