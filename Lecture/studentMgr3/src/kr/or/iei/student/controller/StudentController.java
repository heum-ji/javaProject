package kr.or.iei.student.controller;

import kr.or.iei.student.model.vo.Student;
import kr.or.iei.student.view.StudentView;

public class StudentController {
	Student[] s;
	int index;
	StudentView view;

	public StudentController() {
		super();
		s = new Student[10];
		index = 0;
		view = new StudentView();
	}

	public void main() {
		while (true) {
			int sel = view.showMenu(); // 메인 메뉴를 보여주는 메서드

			switch (sel) {
			case 0:
				System.out.println("Bye~!");
				return;
			case 1:
				s[index++] = view.insertMember();
				break;
			case 2:
				view.printAllMember(s, index);
				break;
			case 3:
				int searchIndex = searchIndex(view.inputName());

				if (searchIndex != -1) { // 배열에 존재
					view.printOneMember(s[searchIndex]);
				} else { // 배열에 없음
					view.printString("해당 학생은 없습니다.");
				}
				break;
			case 4:
				break;
			case 5:
				break;
			}
		}
	}

	public int searchIndex(String searchName) {
		for (int i = 0; i < index; i++) {
			if (s[i].getName().equals(searchName)) {
				return i;
			}
		}
		return -1;
	}
}