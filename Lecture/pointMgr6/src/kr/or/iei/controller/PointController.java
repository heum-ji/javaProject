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
				members.add(view.insertMember("등록")) ;
				break;
			case 2:
				view.printAllMember(members);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				view.printMsg("Bye~!");
				return;
			default:
				view.printMsg("잘못 입력하셨습니다.");
			}
		}
	}

}
