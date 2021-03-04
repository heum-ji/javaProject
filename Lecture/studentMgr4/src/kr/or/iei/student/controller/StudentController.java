package kr.or.iei.student.controller;

import java.util.ArrayList;

import kr.or.iei.student.view.StudentView;
import kr.or.iei.student.vo.Student;

public class StudentController {
	ArrayList<Student> students;
	StudentView view;

	public StudentController() {
		super();
		students = new ArrayList<Student>();
		view = new StudentView();
	}

	public void main() {
		while (true) {
			switch (view.showMenu()) {
			case 0:
				view.printlnMsg("프로그램 종료");
				return;
			case 1:
				students.add(view.getStudent("등록"));
				break;
			case 2:
				view.printAllStudent(students);
				break;
			case 3:
				printOneStudent();
				break;
			case 4:
				modifyStudent();
				break;
			case 5:
				deleteStudent();
				break;
			default:
				view.printlnMsg("잘못 입력 했어요. 다시 선택 하세요.");
				break;
			}
		}
	}

	public void printOneStudent() {
		int searchIndex = searchStudent(view.getName("조회"));

		if (searchIndex == -1) {
			view.printlnMsg("해당하는 학생은 없습니다.");
		} else {
			view.printOneStudent(students.get(searchIndex));
		}
	}

	public void modifyStudent() {
		int searchIndex = searchStudent(view.getName("수정"));

		if (searchIndex == -1) {
			view.printlnMsg("해당하는 학생은 없습니다.");
		} else {
			students.set(searchIndex, view.getStudent("수정"));
			view.printlnMsg("수정 완료");
		}
	}

	public void deleteStudent() {
		int searchIndex = searchStudent(view.getName("삭제"));

		if (searchIndex == -1) {
			view.printlnMsg("해당하는 학생은 없습니다.");
		} else {
			students.remove(searchIndex);
			view.printlnMsg("삭제 완료");
		}
	}

	public int searchStudent(String name) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
}