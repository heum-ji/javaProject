package kr.or.iei.controller;

import java.util.Scanner;

import kr.or.iei.vo.Gold;
import kr.or.iei.vo.Silver;
import kr.or.iei.vo.Vip;

public class PointMgr {
	Scanner sc;
	Silver[] s;
	Gold[] g;
	Vip[] v;
	int index;
	int gIndex;
	int vIndex;

	public PointMgr() {
		sc = new Scanner(System.in);
		s = new Silver[10];
		g = new Gold[10];
		v = new Vip[10];
		index = 0;
		gIndex = 0;
		vIndex = 0;
	}

	public void main() {
		while (true) {
			System.out.println("\n===== 포인트 관리 프로그램v2 =====\n");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 전체 회원 조회");
			System.out.println("3. 회원 1명 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 삭제");
			System.out.println("6. 테스트");
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
		System.out.print("등급[silver/gold/vip] : ");
		String grade = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("포인트 : ");
		int point = sc.nextInt();

		switch (grade) {
		case "silver":
			s[index++] = new Silver(grade, name, point);
			break;
		case "gold":
			g[gIndex++] = new Gold(grade, name, point);
			break;
		case "vip":
			v[vIndex++] = new Vip(grade, name, point);
			break;
		}
		System.out.println("등록완료!");
	}

	public void printAllMember() {
		System.out.println("===== 전체 회원 출력 =====");
		System.out.println("등급\t이름\t포인트\t보너스");

		// Silver
		for (int i = 0; i < index; i++) {
			System.out
					.println(s[i].getGrade() + "\t" + s[i].getName() + "\t" + s[i].getPoint() + "\t" + s[i].getBonus());
		}

		// Gold
		for (int i = 0; i < gIndex; i++) {
			System.out
					.println(g[i].getGrade() + "\t" + g[i].getName() + "\t" + g[i].getPoint() + "\t" + g[i].getBonus());
		}

		// Vip
		for (int i = 0; i < vIndex; i++) {
			System.out
					.println(v[i].getGrade() + "\t" + v[i].getName() + "\t" + v[i].getPoint() + "\t" + v[i].getBonus());
		}
	}

	public void printOneMember() {
		System.out.println("===== 회원 정보 출력 =====");
		System.out.print("찾을 회원 이름 : ");
		String searchName = sc.next();

		int searchIndex = searchMember(searchName);

		if (searchIndex == -1) {
			System.out.println("해당 회원은 없습니다.");
		} else if (searchIndex / 100 == 1) { // silver
			searchIndex -= 100;
			System.out.println("등급 : " + s[searchIndex].getGrade());
			System.out.println("이름 : " + s[searchIndex].getName());
			System.out.println("포인트 : " + s[searchIndex].getPoint());
			System.out.println("보너스 : " + s[searchIndex].getBonus());
		} else if (searchIndex / 10 == 1) { // gold
			searchIndex -= 10;
			System.out.println("등급 : " + g[searchIndex].getGrade());
			System.out.println("이름 : " + g[searchIndex].getName());
			System.out.println("포인트 : " + g[searchIndex].getPoint());
			System.out.println("보너스 : " + g[searchIndex].getBonus());
		} else { // vip
			System.out.println("등급 : " + v[searchIndex].getGrade());
			System.out.println("이름 : " + v[searchIndex].getName());
			System.out.println("포인트 : " + v[searchIndex].getPoint());
			System.out.println("보너스 : " + v[searchIndex].getBonus());
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

			// 수정 등급 index 변환
			if (mGrade.equals("silver")) { // 수정 등급 : silver
				if (searchIndex / 100 == 1) { // silver -> silver
					searchIndex -= 100;
					s[searchIndex] = new Silver(mGrade, mName, mPoint);
				} else if (searchIndex / 10 == 1) { // gold -> silver
					searchIndex -= 10;
					for (int i = searchIndex; i < gIndex - 1; i++) {
						g[i] = g[i + 1];
					}
					g[--gIndex] = null;
					s[index++] = new Silver(mGrade, mName, mPoint);
				} else { // vip -> silver
					for (int i = searchIndex; i < vIndex - 1; i++) {
						v[i] = v[i + 1];
					}
					v[--vIndex] = null;
					s[index++] = new Silver(mGrade, mName, mPoint);
				}
			} else if (mGrade.equals("gold")) { // 수정 등급 : gold
				if (searchIndex / 10 == 1) { // gold -> gold
					searchIndex -= 10;
					g[searchIndex] = new Gold(mGrade, mName, mPoint);
				} else if (searchIndex / 100 == 1) { // silver -> gold
					searchIndex -= 100;
					for (int i = searchIndex; i < index - 1; i++) {
						s[i] = s[i + 1];
					}
					s[--index] = null;
					g[gIndex++] = new Gold(mGrade, mName, mPoint);
				} else { // vip -> gold
					for (int i = searchIndex; i < vIndex - 1; i++) {
						v[i] = v[i + 1];
					}
					v[--vIndex] = null;
					g[gIndex++] = new Gold(mGrade, mName, mPoint);
				}
			} else { // 수정 등급 : vip
				if (searchIndex / 100 != 1 && searchIndex / 10 != 1) { // vip -> vip
					v[searchIndex] = new Vip(mGrade, mName, mPoint);
				} else { // 다른 등급에서 바꾸는 경우
					if (searchIndex / 100 == 1) { // silver -> vip
						searchIndex -= 100;
						for (int i = searchIndex; i < index - 1; i++) {
							s[i] = s[i + 1];
						}
						s[--index] = null;
						v[vIndex++] = new Vip(mGrade, mName, mPoint);
					} else if (searchIndex / 10 == 1) { // gold -> vip
						searchIndex -= 10;
						for (int i = searchIndex; i < gIndex - 1; i++) {
							g[i] = g[i + 1];
						}
						g[--gIndex] = null;
						v[vIndex++] = new Vip(mGrade, mName, mPoint);
					}
				}
			}
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
			if (searchIndex / 100 == 1) {
				searchIndex -= 100;
				for (int i = searchIndex; i < index - 1; i++) {
					s[i] = s[i + 1];
				}
				s[--index] = null;
			} else if (searchIndex / 10 == 1) {
				searchIndex -= 10;
				for (int i = searchIndex; i < gIndex - 1; i++) {
					g[i] = g[i + 1];
				}
				g[--gIndex] = null;
			} else {
				for (int i = searchIndex; i < vIndex - 1; i++) {
					v[i] = v[i + 1];
				}
				v[--vIndex] = null;
			}

			System.out.println("삭제 완료");
		}
	}

	public int searchMember(String searchName) {
		// silver
		for (int i = 0; i < index; i++) {
			if (s[i].getName().equals(searchName)) {
				return 100 + i; // 100 ~ 109
			}
		}
		// gold
		for (int i = 0; i < gIndex; i++) {
			if (g[i].getName().equals(searchName)) {
				return 10 + i; // 10 ~ 19
			}
		}
		// vip
		for (int i = 0; i < vIndex; i++) {
			if (v[i].getName().equals(searchName)) {
				return i; // 0 ~ 9
			}
		}
		// 없는 경우
		return -1;
	}
}