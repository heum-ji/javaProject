package kr.or.iei.controller;

import java.util.ArrayList;

import kr.or.iei.view.PointView;
import kr.or.iei.vo.Grade;

public class PointController {
	ArrayList<Grade> members;
	PointView view;

	public PointController() {
		super();
		members = new ArrayList<Grade>();
		view = new PointView();
	}

	public void main() {
		while (true) {
			switch (view.showMenu()) {
			case 1:
				members.add(view.getMember("등록"));
				break;
			case 2:
				view.printAllMember(members);
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
				view.printMsg("Bye~!");
				return;
			default:
				view.printMsg("잘못 입력하셨습니다.");
			}
		}
	}

	public void printOneMember() {
		int searchIndex = searchMember(view.getName("조회"));

		if (searchIndex == -1) {
			view.printMsg("해당하는 회원은 없습니다.");
		} else {
			view.printOneMember(members.get(searchIndex));
		}
	}

	public void modifyMember() {
		int searchIndex = searchMember(view.getName("수정"));

		if (searchIndex == -1) {
			view.printMsg("해당하는 회원은 없습니다.");
		} else {
			members.set(searchIndex, view.getMember("수정"));
		}
	}

	public void deleteMember() {
		int searchIndex = searchMember(view.getName("삭제"));

		if (searchIndex == -1) {
			view.printMsg("해당하는 회원은 없습니다.");
		} else {
			members.remove(searchIndex);
			view.printMsg("삭제 완료");
		}
	}

	public int searchMember(String searchName) {
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getName().equals(searchName)) {
				return i;
			}
		}
		return -1;
	}

}
