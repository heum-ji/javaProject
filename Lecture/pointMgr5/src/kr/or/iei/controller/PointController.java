package kr.or.iei.controller;

import kr.or.iei.model.vo.Grade;
import kr.or.iei.view.PointView;

public class PointController {
	Grade[] members;
	int index;
	PointView view;

	public PointController() {
		super();

		members = new Grade[30];
		index = 0;
		view = new PointView();
	}

	public void main() {
		while (true) {

			switch (view.showMenu()) {
			case 1:
				insertMember();
				break;
			case 2:
				view.printAllMember(members, index);
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

	public void insertMember() {
		Grade member = view.insertMember();

		if (member != null) {
			members[index++] = member;
		}
	}

	public void printOneMember() {
		int searchIndex = searchMember(view.searchName("조회"));

		if (searchIndex != -1) {
			view.printOneMember(members[searchIndex]);
		} else {
			view.printMsg("해당 회원은 없습니다.");
		}
	}

	public void modifyMember() {
		int searchIndex = searchMember(view.searchName("수정"));

		if (searchIndex != -1) {
			members[searchIndex] = view.modifyMember();
		} else {
			view.printMsg("해당 회원은 없습니다.");
		}
	}

	public void deleteMember() {
		int searchIndex = searchMember(view.searchName("삭제"));

		if (searchIndex != -1) {
			for (int i = searchIndex; i < index - 1; i++) {
				members[i] = members[i + 1];
			}
			members[--index] = null;
			view.printMsg("삭제 완료");
		} else {
			view.printMsg("해당 회원은 없습니다.");
		}
	}

	public int searchMember(String searchName) {
		for (int i = 0; i < index; i++) {
			if (members[i].getName().equals(searchName)) {
				return i;
			}
		}
		return -1;
	}
}