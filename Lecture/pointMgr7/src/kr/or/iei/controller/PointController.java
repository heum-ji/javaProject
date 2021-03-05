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
				// view.printAllMember(members);
				break;
			case 3:
				// printOneMember();
				break;
			case 4:
				// modifyMember();
				break;
			case 5:
				// deleteMember();
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
}