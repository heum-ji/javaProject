package kr.or.iei.view;

import java.util.Scanner;

import kr.or.iei.model.vo.Gold;
import kr.or.iei.model.vo.Grade;
import kr.or.iei.model.vo.Silver;
import kr.or.iei.model.vo.Vip;
import kr.or.iei.model.vo.Vvip;

public class PointView {
	Scanner sc;

	public PointView() {
		super();
		sc = new Scanner(System.in);
	}

	public int showMenu() {
		System.out.println("===== 회원 관리 프로그램 v5 =====");
		System.out.println("1. 회원 등록");
		System.out.println("2. 전체 회원 출력");
		System.out.println("3. 회원 정보 출력(1명)");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 회원 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");

		return (sc.nextInt());
	}

	public Grade insertMember() {
		Grade member = null;

		System.out.println("===== 회원 등록 =====");
		System.out.print("등급 [silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("포인트 : ");
		int point = sc.nextInt();

		switch (grade) {

		case "silver":
			member = new Silver(grade, name, point);
			break;
		case "gold":
			member = new Gold(grade, name, point);
			break;
		case "vip":
			member = new Vip(grade, name, point);
			break;
		case "vvip":
			member = new Vvip(grade, name, point);
			break;
		}
		System.out.println("회원 등록 완료");
		return member;
	}

	public void printAllMember(Grade[] g, int index) {
		System.out.println("===== 전체 회원 출력 =====");
		System.out.println("등급\t이름\t포인트\t보너스");
		for (int i = 0; i < index; i++) {
			System.out
					.println(g[i].getGrade() + "\t" + g[i].getName() + "\t" + g[i].getPoint() + "\t" + g[i].getBonus());
		}
	}

	public void printOneMember(Grade member) {
		System.out.println("===== 회원 정보 출력(1명) =====");
		System.out.println("등급 : " + member.getGrade());
		System.out.println("이름 : " + member.getName());
		System.out.println("포인트 : " + member.getPoint());
		System.out.println("보너스 : " + member.getBonus());
	}

	public Grade modifyMember() {
		Grade member = null;

		System.out.println("===== 회원 정보 수정 =====");
		System.out.print("수정할 등급 [silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.print("수정할 이름 : ");
		String name = sc.next();
		System.out.print("수정할 포인트 : ");
		int point = sc.nextInt();

		switch (grade) {

		case "silver":
			member = new Silver(grade, name, point);
			break;
		case "gold":
			member = new Gold(grade, name, point);
			break;
		case "vip":
			member = new Vip(grade, name, point);
			break;
		case "vvip":
			member = new Vvip(grade, name, point);
			break;
		}
		System.out.println("수정 완료");
		return member;
	}

	public String searchName(String str) {
		System.out.print(str + "할  이름 : ");
		return sc.next();
	}

	public void printMsg(String msg) {
		System.out.println(msg);
	}
}