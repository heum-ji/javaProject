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
				break;
			case 1:
				students.add(view.getStudent("등록"));
				break;
			case 2:
				view.printAllStudent(students);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				break;
			}
		}
	}
}