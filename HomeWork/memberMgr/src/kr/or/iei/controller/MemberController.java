package kr.or.iei.controller;

import java.util.HashMap;

import kr.or.iei.view.MemberView;
import kr.or.iei.vo.User;

public class MemberController {
	private MemberView view;
	private HashMap<String, User> members;

	public MemberController() {
		super();
		view = new MemberView();
		members = new HashMap<String, User>();
	}

	public void main() {
		while (true) {
			switch (view.showMenu()) {
			case 1:
				addUser();
				break;
			case 2:
				printAllUser();
				break;
			case 3:
				printOneUser();
				break;
			case 4:
				modifyUser();
				break;
			case 5:
				deleteUser();
				break;
			case 0:
				view.printMsg("Bye~");
				return;
			}
		}
	}

	public void addUser() {
		String id = "";
		// id 중복 체크
		while (true) {
			id = view.getId("가입");

			if (members.containsKey(id)) {
				System.out.println("이미 사용중인 아이디 입니다.");
			} else {
				break;
			}
		}
		// addUser
		User user = view.getUser(id, "가입");
		members.put(user.getId(), user);
	}

	public void printAllUser() {
		view.printAllUser(members);
	}

	public void printOneUser() {
		String id = view.getId("조회");
		User user = null;
		// id 체크
		if (members.containsKey(id)) {
			user = members.get(id);
			// pw 체크
			if (user.getPw().equals(view.getPw())) { // id/pw 다 맞는 경우
				view.printOneUser(user);
			} else { // pw 틀림
				view.printMsg("비밀번호를 확인해주세요");
				return;
			}
		} else { // id 틀림
			view.printMsg("아이디가 존재하지 않습니다.");
			return;
		}
	}

	public void modifyUser() {
		String id = view.getId("수정");
		// id 체크
		if (members.containsKey(id)) {
			members.put(id, view.getUser(id, "수정")); // 수정
		} else { // id 틀림
			view.printMsg("존재하지 않는 회원입니다.");
			return;
		}
	}

	public void deleteUser() {
		String id = view.getId("삭제");
		// id 체크
		if (members.containsKey(id)) {
			members.remove(id);
		} else { // id 틀림
			view.printMsg("존재하지 않는 회원입니다.");
			return;
		}
	}
}