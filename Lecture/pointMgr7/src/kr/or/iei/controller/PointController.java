package kr.or.iei.controller;

import java.util.HashMap;

import kr.or.iei.view.PointView;
import kr.or.iei.vo.Grade;

public class PointController {
	private HashMap<String, Grade> members;
	private PointView view;

	public PointController() {
		super();
		members = new HashMap<String, Grade>();
		view = new PointView();
	}

	public void main() {
		while (true) {
			switch (view.showMenu()) {
			case 1:
				addMember();
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
				view.printMsg("Bye~!");
				return;
			default:
				view.printMsg("잘못 입력하셨습니다.");
			}
		}
	}

	public void addMember() {
		Grade member = view.getMember("등록");
		members.put(member.getName(), member);
	}

	public void printAllMember() {
		view.printAllMember(members);
	}

	public void printOneMember() {
		String name = view.getName("조회");
		Grade member = members.get(name);
		if (member != null) {
			view.printOneMember(member);
		} else {
			view.printMsg("해당 멤버는 없습니다.");
		}
	}

	public void modifyMember() {
		String name = view.getName("수정");

		if (members.containsKey(name)) {
			members.remove(name);
			Grade member = view.getMember("수정");
			members.put(member.getName(), member);
			view.printMsg("수정 완료");
		} else {
			view.printMsg("해당 멤버는 없습니다.");
		}
	}

	public void deleteMember() {
		String name = view.getName("삭제");

		if (members.containsKey(name)) {
			members.remove(name);
			view.printMsg("삭제 완료");
		} else {
			view.printMsg("해당 멤버는 없습니다.");
		}
	}
}