package kr.or.iei.controller;

import java.util.Scanner;

import kr.or.iei.vo.Gold;
import kr.or.iei.vo.Silver;
import kr.or.iei.vo.Vip;
import kr.or.iei.vo.Vvip;

public class PointMgr {

	Scanner sc;
	Silver[] s;
	Gold[] g;
	Vip[] v;
	Vvip[] vv;

	int index;
	int gIndex;
	int vIndex;
	int vvIndex;

	public PointMgr() {
		super();

		sc = new Scanner(System.in);
		s = new Silver[10];
		g = new Gold[10];
		v = new Vip[10];
		vv = new Vvip[10];

		index = 0;
		gIndex = 0;
		vIndex = 0;
		vvIndex = 0;
	}

	public void main() {
		while (true) {
			System.out.println("\n===== 포인트 관리 프로그램v3 =====\n");
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
		System.out.println("===== 회원 정보 등록 =====");
		System.out.println("회원 등급[silver, gold, vip, vvip] : ");
		String inputGrade = sc.next();
		System.out.print("회원 이름 : ");
		String inputName = sc.next();
		System.out.print("회원 포인트 : ");
		int inputPoint = sc.nextInt();

		switch (inputGrade) {
		case "silver":
			s[index++] = new Silver(inputGrade, inputName, inputPoint);
			break;
		case "gold":
			g[gIndex++] = new Gold(inputGrade, inputName, inputPoint);
			break;
		case "vip":
			v[vIndex++] = new Vip(inputGrade, inputName, inputPoint);
			break;
		case "vvip":
			vv[vvIndex++] = new Vvip(inputGrade, inputName, inputPoint);
			break;
		}
		System.out.println("회원 정보 등록 완료");
	}

	public void printAllMember() {
		System.out.println("===== 전체 회원 조회 =====");
		System.out.println("등급\t이름\t포인트\t보너스");

		// 아무런 값이 없는 경우
		if (index == 0 && gIndex == 0 && vIndex == 0 && vvIndex == 0) {
			System.out.println("등록된 회원이 없습니다.");
			return;
		}

		for (int i = 0; i < index; i++) {
			System.out
					.println(s[i].getGrade() + "\t" + s[i].getName() + "\t" + s[i].getPoint() + "\t" + s[i].getBonus());
		}

		for (int i = 0; i < gIndex; i++) {
			System.out
					.println(g[i].getGrade() + "\t" + g[i].getName() + "\t" + g[i].getPoint() + "\t" + g[i].getBonus());
		}

		for (int i = 0; i < vIndex; i++) {
			System.out
					.println(v[i].getGrade() + "\t" + v[i].getName() + "\t" + v[i].getPoint() + "\t" + v[i].getBonus());
		}

		for (int i = 0; i < vvIndex; i++) {
			System.out.println(
					vv[i].getGrade() + "\t" + vv[i].getName() + "\t" + vv[i].getPoint() + "\t" + vv[i].getBonus());
		}

		System.out.println("전체 회원 조회 완료");
	}

	public void printOneMember() {
		System.out.println("===== 회원 1명 조회 =====");
		System.out.print("조회할 회원 이름 : ");

		int searchIndex = searchMember(sc.next());

		if (searchIndex == -1) {
			System.out.println("찾는 이름이 없습니다.");
			return;
		} else if ((searchIndex / 1000) == 1) { // silver
			searchIndex -= 1000;
			System.out.println("등급 : " + s[searchIndex].getGrade());
			System.out.println("이름 : " + s[searchIndex].getName());
			System.out.println("포인트 : " + s[searchIndex].getPoint());
			System.out.println("보너스 : " + s[searchIndex].getBonus());
		} else if ((searchIndex / 100) == 1) { // gold
			searchIndex -= 100;
			System.out.println("등급 : " + g[searchIndex].getGrade());
			System.out.println("이름 : " + g[searchIndex].getName());
			System.out.println("포인트 : " + g[searchIndex].getPoint());
			System.out.println("보너스 : " + g[searchIndex].getBonus());
		} else if ((searchIndex / 10) == 1) { // vip
			searchIndex -= 10;
			System.out.println("등급 : " + v[searchIndex].getGrade());
			System.out.println("이름 : " + v[searchIndex].getName());
			System.out.println("포인트 : " + v[searchIndex].getPoint());
			System.out.println("보너스 : " + v[searchIndex].getBonus());
		} else { // vvip
			System.out.println("등급 : " + vv[searchIndex].getGrade());
			System.out.println("이름 : " + vv[searchIndex].getName());
			System.out.println("포인트 : " + vv[searchIndex].getPoint());
			System.out.println("보너스 : " + vv[searchIndex].getBonus());
		}
		System.out.println("조회 완료");
	}

	public void modifyMember() {
		System.out.println("===== 회원 정보 수정 =====");
		System.out.print("수정할 회원 이름 : ");

		int searchIndex = searchMember(sc.next());

		if (searchIndex == -1) {
			System.out.println("찾는 이름이 없습니다.");
		} else {
			System.out.print("수정 회원 등급 : ");
			String mGrade = sc.next();
			System.out.print("수정 회원 이름 : ");
			String mName = sc.next();
			System.out.print("수정 회원 포인트 : ");
			int mPoint = sc.nextInt();

			if (mGrade.equals("silver")) {
				if ((searchIndex / 1000) == 1) { // silver -> silver
					searchIndex -= 1000;
					s[searchIndex] = new Silver(mGrade, mName, mPoint);
				} else if ((searchIndex / 100 == 1)) { // gold - > silver
					searchIndex -= 100;
					// gold 삭제
					for (int i = searchIndex; i < gIndex - 1; i++) {
						g[i] = g[i + 1];
					}
					g[--gIndex] = null;
					// silver 추가
					s[index++] = new Silver(mGrade, mName, mPoint);
				} else if ((searchIndex / 10 == 1)) { // vip - > silver
					searchIndex -= 10;
					// vip 삭제
					for (int i = searchIndex; i < vIndex - 1; i++) {
						v[i] = v[i + 1];
					}
					v[--vIndex] = null;
					// silver 추가
					s[index++] = new Silver(mGrade, mName, mPoint);
				} else { // vvip - > silver
					// vvip 삭제
					for (int i = searchIndex; i < vvIndex - 1; i++) {
						vv[i] = vv[i + 1];
					}
					vv[--vvIndex] = null;
					// silver 추가
					s[index++] = new Silver(mGrade, mName, mPoint);
				}
			} // silver
			else if (mGrade.equals("gold")) {
				if ((searchIndex / 100) == 1) { // gold -> gold
					searchIndex -= 100;
					g[searchIndex] = new Gold(mGrade, mName, mPoint);
				} else if ((searchIndex / 1000 == 1)) { // silver - > gold
					searchIndex -= 1000;
					// silver 삭제
					for (int i = searchIndex; i < index - 1; i++) {
						s[i] = s[i + 1];
					}
					s[--index] = null;

					// gold 추가
					g[gIndex++] = new Gold(mGrade, mName, mPoint);
				} else if ((searchIndex / 10 == 1)) { // vip - > gold
					searchIndex -= 10;
					// vip 삭제
					for (int i = searchIndex; i < vIndex - 1; i++) {
						v[i] = v[i + 1];
					}
					v[--vIndex] = null;

					// gold 추가
					g[gIndex++] = new Gold(mGrade, mName, mPoint);
				} else { // vvip - > gold
					// vvip 삭제
					for (int i = searchIndex; i < vvIndex - 1; i++) {
						vv[i] = vv[i + 1];
					}
					vv[--vvIndex] = null;

					// gold 추가
					g[gIndex++] = new Gold(mGrade, mName, mPoint);
				}
			} // gold
			else if (mGrade.equals("vip")) {
				if ((searchIndex / 10) == 1) { // vip -> vip
					searchIndex -= 10;
					v[searchIndex] = new Vip(mGrade, mName, mPoint);
				} else if ((searchIndex / 1000 == 1)) { // silver - > vip
					searchIndex -= 1000;
					// silver 삭제
					for (int i = searchIndex; i < index - 1; i++) {
						s[i] = s[i + 1];
					}
					s[--index] = null;

					// vip 추가
					v[vIndex++] = new Vip(mGrade, mName, mPoint);
				} else if ((searchIndex / 100 == 1)) { // gold - > vip
					searchIndex -= 100;
					// gold 삭제
					for (int i = searchIndex; i < gIndex - 1; i++) {
						g[i] = g[i + 1];
					}
					g[--gIndex] = null;

					// vip 추가
					v[vIndex++] = new Vip(mGrade, mName, mPoint);
				} else { // vvip - > vip
					// vvip 삭제
					for (int i = searchIndex; i < vvIndex - 1; i++) {
						vv[i] = vv[i + 1];
					}
					vv[--vvIndex] = null;

					// vip 추가
					v[vIndex++] = new Vip(mGrade, mName, mPoint);
				}
			} // vip
			else {
				// vvip -> vvip
				if ((searchIndex / 1000) != 1 && (searchIndex / 100) != 1 && (searchIndex / 10) != 1) {
					vv[searchIndex] = new Vvip(mGrade, mName, mPoint);
				} else if ((searchIndex / 1000 == 1)) { // silver - > vvip
					searchIndex -= 1000;
					// silver 삭제
					for (int i = searchIndex; i < index - 1; i++) {
						s[i] = s[i + 1];
					}
					s[--index] = null;

					// vvip 추가
					vv[vvIndex++] = new Vvip(mGrade, mName, mPoint);
				} else if ((searchIndex / 100 == 1)) { // gold - > vvip
					searchIndex -= 100;
					// gold 삭제
					for (int i = searchIndex; i < gIndex - 1; i++) {
						g[i] = g[i + 1];
					}
					g[--gIndex] = null;

					// vvip 추가
					vv[vvIndex++] = new Vvip(mGrade, mName, mPoint);
				} else { // vip - > vvip
					// vip 삭제
					for (int i = searchIndex; i < vIndex - 1; i++) {
						v[i] = v[i + 1];
					}
					v[--vIndex] = null;

					// vvip 추가
					vv[vvIndex++] = new Vvip(mGrade, mName, mPoint);
				}
			} // vvip
			System.out.println("수정 완료");
		}
	}

	public void deleteMember() {
		System.out.println("===== 회원 삭제 =====");
		System.out.print("삭제할 회원 이름 : ");

		int searchIndex = searchMember(sc.next());

		if (searchIndex == -1) {
			System.out.println("찾는 이름이 없습니다.");
			return;
		} else if ((searchIndex / 1000) == 1) { // silver
			searchIndex -= 1000;

			for (int i = searchIndex; i < index - 1; i++) {
				s[i] = s[i + 1];
			}
			s[--index] = null;
		} else if ((searchIndex / 100) == 1) { // gold
			searchIndex -= 100;

			for (int i = searchIndex; i < gIndex - 1; i++) {
				g[i] = g[i + 1];
			}
			g[--gIndex] = null;
		} else if ((searchIndex / 10) == 1) { // vip
			searchIndex -= 10;

			for (int i = searchIndex; i < vIndex - 1; i++) {
				v[i] = v[i + 1];
			}
			v[--vIndex] = null;
		} else { // vvip
			for (int i = searchIndex; i < vvIndex - 1; i++) {
				vv[i] = vv[i + 1];
			}
			vv[--vvIndex] = null;
		}
		System.out.println("삭제 완료");
	}

	public int searchMember(String searchName) {
		for (int i = 0; i < index; i++) {
			if (s[i].getName().equals(searchName)) {
				return i + 1000;
			}
		}

		for (int i = 0; i < gIndex; i++) {
			if (g[i].getName().equals(searchName)) {
				return i + 100;
			}
		}

		for (int i = 0; i < vIndex; i++) {
			if (v[i].getName().equals(searchName)) {
				return i + 10;
			}
		}

		for (int i = 0; i < vvIndex; i++) {
			if (vv[i].getName().equals(searchName)) {
				return i;
			}
		}
		return -1;
	}
}