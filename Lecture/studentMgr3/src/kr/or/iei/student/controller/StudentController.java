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
				view.printMsg("Bye~");
				return;
			case 1:
				s[index++] = view.insertMember();
				break;
			case 2:
				view.printAllMember(s, index);
				break;
			case 3:
				int searchIndex = searchStudent(view.inputName("조회"));

				if (searchIndex != -1) { // 배열에 존재
					view.printOneStudent(s[searchIndex]);
				} else { // 배열에 없음
					view.printMsg("해당 학생은 없습니다.");
				}
				break;
			case 4:
				modifyStudent();
				break;
			case 5:
				deleteStudent();
				break;
			}
		}
	}

	public void modifyStudent() {
		int searchIndex = searchStudent(view.inputName("수정"));

		if (searchIndex != -1) {
			s[searchIndex] = view.modifyStudent();
		} else {
			view.printMsg("해당 학생은 없습니다.");
		}
	}

	public void deleteStudent() {
		int searchIndex = searchStudent(view.inputName("삭제"));

		if (searchIndex != -1) {
			for (int i = searchIndex; i < index - 1; i++) {
				s[i] = s[i + 1];
			}
			s[--index] = null;
		} else {
			view.printMsg("해당 학생은 없습니다.");
		}
	}

	public int searchStudent(String searchName) {
		for (int i = 0; i < index; i++) {
			if (s[i].getName().equals(searchName)) {
				return i;
			}
		}
		return -1;
	}
}