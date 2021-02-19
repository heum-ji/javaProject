package kr.or.iei.controller;

import java.util.Scanner;

import kr.or.iei.vo.Silver;

public class PointMgr {
	Scanner sc = new Scanner(System.in);
	Silver[] s;
	int index;

	public PointMgr() {
		sc = new Scanner(System.in);
		s = new Silver[10];
		index = 0;
	}

	public void main() {
		while (true) {
			System.out.println("\n===== 포인트 관리 프로그램v1 =====\n");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 전체 회원 조회");
			System.out.println("3. 회원 1명 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");

			switch (sc.nextInt()) {
			case 1:
				insertMember();
				break;
			case 2:
				printAllMember();
				break;
			case 3:
				printOneMember();
				break;
			case 4:
				modifyMember();
				break;
			case 5:
				deleteMember();
				break;
			case 0:
				System.out.println("Bye~");
				return;
			default:
				System.out.println("잘못입력");
			}
		}
	}

	public void insertMember() {
		System.out.println("===== 회원 정보 입력 =====");
		System.out.print("등급 : ");
		String grade = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("포인트 : ");
		int point = sc.nextInt();

		s[index++] = new Silver(grade, name, point);
		System.out.println("등록완료!");
	}

	public void printAllMember() {
		System.out.println("===== 전체 회원 출력 =====");
		System.out.println("등급\t이름\t포인트\t보너스");
		for (int i = 0; i < index; i++) {
			System.out
					.println(s[i].getGrade() + "\t" + s[i].getName() + "\t" + s[i].getPoint() + "\t" + s[i].getBonus());
		}
	}

	public void printOneMember() {
		System.out.println("===== 회원 정보 출력 =====");
		System.out.print("찾을 회원 이름 : ");
		String searchName = sc.next();

		int searchIndex = searchMember(searchName);

		if (searchIndex == -1) {
			System.out.println("해당 회원은 없습니다.");
		} else {
			System.out.println("등급 : " + s[searchIndex].getGrade());
			System.out.println("이름 : " + s[searchIndex].getName());
			System.out.println("포인트 : " + s[searchIndex].getPoint());
			System.out.println("보너스 : " + s[searchIndex].getBonus());
		}
	}

	public void modifyMember() {
		System.out.println("===== 회원 정보 수정 =====");
		System.out.print("수정할 회원 이름 입력 : ");
		String searchName = sc.next();
		int searchIndex = searchMember(searchName);

		if (searchIndex == -1) {
			System.out.println("해당 회원은 없습니다.");
		} else {
			System.out.println("수정 등급 입력 : ");
			String mGrade = sc.next();
			System.out.println("수정 이름 입력 : ");
			String mName = sc.next();
			System.out.println("수정 포인트 입력 : ");
			int mPoint = sc.nextInt();

			// 새로운 Silver 객체를 생성해서 해당 객체로 배열의 값을 변경
			s[searchIndex] = new Silver(mGrade, mName, mPoint);

			/*
			 * 기존 Silver 객체의 내부 정보를 수정 s[searchIndex].setGrade(mGrade);
			 * s[searchIndex].setName(mName); s[searchIndex].setPoint(mPoint);
			 */
			System.out.println("수정 완료");
		}
	}

	public void deleteMember() {
		System.out.println("===== 회원 정보 삭제 =====");
		System.out.print("삭제할 회원 이름 입력 : ");
		String searchName = sc.next();
		int searchIndex = searchMember(searchName);

		if (searchIndex == -1) {
			System.out.println("해당 회원은 없습니다.");
		} else {
			for (int i = 0; i < index - 1; i++) {
				s[i] = s[i + 1];
			}
			s[--index] = null;
			System.out.println("삭제 완료");
		}
	}

	public int searchMember(String searchName) {

		for (int i = 0; i < index; i++) {
			if (s[i].getName().equals(searchName)) {
				return i;
			}
		}
		return -1;
	}
}