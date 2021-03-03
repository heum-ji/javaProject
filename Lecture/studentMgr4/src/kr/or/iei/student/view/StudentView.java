package kr.or.iei.student.view;

import java.util.ArrayList;
import java.util.Scanner;

import kr.or.iei.student.vo.Student;

public class StudentView {
	Scanner sc;

	public StudentView() {
		super();
		sc = new Scanner(System.in);
	}

	public int showMenu() {
		System.out.println("===== 학생 관리 프로그램 v4 =====");
		System.out.println("1. 학생정보등록");
		System.out.println("2. 학생전체출력");
		System.out.println("3. 학생1명출력");
		System.out.println("4. 학생정보수정");
		System.out.println("5. 학생정보삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");

		return sc.nextInt();
	}

	public Student getStudent(String str) {
		System.out.print(str + "할 학생 이름 : ");
		String name = sc.next();
		System.out.print(str + "할 학생 나이 : ");
		int age = sc.nextInt();
		System.out.print(str + "할 학생 주소 : ");
		sc.nextLine();
		String addr = sc.nextLine();

		return new Student(name, age, addr);
	}

	public void printlnMsg(String msg) {
		System.out.println(msg);
	}

	public void printMsg(String msg) {
		System.out.print(msg);
	}

	public void printAllStudent(ArrayList<Student> students) {
		System.out.println("===== 학생 전체 조회 =====");
		System.out.println("이름\t나이\t주소");

		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
	}
}
