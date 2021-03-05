package kr.or.iei.view;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import kr.or.iei.vo.User;

public class MemberView {
	private Scanner sc;

	public MemberView() {
		super();
		sc = new Scanner(System.in);
	}

	public int showMenu() {
		System.out.println("===== 회원 관리 프로그램 =====");
		System.out.println("1. 회원가입");
		System.out.println("2. 전체 회원 정보 조회");
		System.out.println("3. 회원 정보 조회(1명)");
		System.out.println("4. 정보수정(아이디는 변경 불가)");
		System.out.println("5. 회원 탈퇴");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");
		return sc.nextInt();
	}

	public String getId(String str) {
		System.out.print(str + "할 아이디 입력 : ");
		return sc.next();
	}

	public String getPw() {
		System.out.print("비밀번호 입력 : ");
		return sc.next();
	}

	public User getUser(String id, String str) {
		System.out.print(str + "할 비밀번호 입력 : ");
		String pw = sc.next();
		System.out.print(str + "할 이름 입력 : ");
		String name = sc.next();
		System.out.print(str + "할 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print(str + "할 전화번호 입력(ex.000-0000-0000) : ");
		String phoneNum = sc.next();

		return new User(id, pw, name, age, phoneNum);
	}

	public void printAllUser(HashMap<String, User> members) {
		System.out.println("====== 전체 회원 정보 출력 =====");
		System.out.println("아이디\t이름\t나이\t전화번호");

		if (!members.isEmpty()) { // 멤버 유무 체크
			Set<String> keys = members.keySet(); // 전체 키 추출

			// 전체 멤버 출력
			for (String key : keys) {
				System.out.println(members.get(key));
			}
		}
	}

	public void printOneUser(User user) {
		System.out.println("아이디 : " + user.getId());
		System.out.println("비밀번호 : " + user.getPw());
		System.out.println("이름 : " + user.getName());
		System.out.println("나이 : " + user.getAge());
		System.out.println("전화번호 : " + user.getPhoneNum());
	}

	public void printMsg(String msg) {
		System.out.println(msg);
	}

}