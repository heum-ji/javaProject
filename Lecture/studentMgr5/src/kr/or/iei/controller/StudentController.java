package kr.or.iei.controller;

import java.util.HashMap;

import kr.or.iei.view.StudentView;
import kr.or.iei.vo.Student;

public class StudentController {
	// key : String, value : Student
	HashMap<String, Student> students;
	StudentView view;

	public StudentController() {
		super();
		students = new HashMap<String, Student>();
		view = new StudentView();
	}

	public void main() {
		while (true) {

			switch (view.showMenu()) {
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudent();
				break;
			case 3:
				printOneStudent();
				break;
			case 4:
				modifyStudent();
				break;
			case 5:
				break;
			case 0:
				view.printMsg("프로그램 종료!");
				return;
			default:
				view.printMsg("잘못 선택했어요! 메뉴를 다시 선택해 주세요.\n");
				break;
			}
		}
	}

	public void insertStudent() {
		Student s = view.getStudent("등록");
		students.put(s.getName(), s);
	}

	public void printAllStudent() {
		view.printAllStudent(students);
	}

	public void printOneStudent() {
		String name = view.getName("조회");
		Student s = students.get(name);

		// get 방법 - key가 없는 경우 null 리턴해주기 떄문
		if (s != null) {
			view.printOneStudent(s);
		} else {
			view.printMsg("해당 학생은 없습니다.\n");
		}
		// containsKey 방법
		// if (students.containsKey(name)) { // 매개 변수로 전달한 값이 keyValue가 있는지 확인 후 boolean
		// 리턴 / 있으면 true, 없으면 false
		// view.printOneStudent(students.get(name));
		// } else {
		// view.printMsg("해당 학생은 없습니다.\n");
		// }
	}

	public void modifyStudent() {
		String name = view.getName("수정");

		if (students.containsKey(name)) {
			students.remove(name);
			Student s = view.getStudent("수정");
			students.put(s.getName(), s);
		} else {
			view.printMsg("해당 학생은 없습니다.\n");
		}
	}

	public void deleteStudent() {
		String name = view.getName("삭제");

		if (students.containsKey(name)) {
			students.remove(name);
		} else {
			view.printMsg("해당 학생은 없습니다.\n");
		}
	}
}