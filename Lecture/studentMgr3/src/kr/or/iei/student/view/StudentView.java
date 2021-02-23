package kr.or.iei.student.view;

import java.util.Scanner;

import kr.or.iei.student.model.vo.Student;

public class StudentView {
	Scanner sc;

	public StudentView() {
		super();
		sc = new Scanner(System.in);
	}

	public int showMenu() {
		System.out.println("===== 학생 관리 프로그램v3 =====");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 전체 조회");
		System.out.println("3. 학생 1명 조회");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");
		int sel = sc.nextInt();
		return sel;
	}

	public Student insertMember() {
		System.out.println("===== 학생 정보 등록 =====");
		System.out.print("학생 이름 : ");
		String name = sc.next();
		System.out.print("학생 나이 : ");
		int age = sc.nextInt();
		System.out.print("학생 주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();

		Student s = new Student(name, age, addr);
		return s;
	}

	public void printAllMember(Student[] s, int index) {
		System.out.println("===== 학생 전체 조회 =====");
		System.out.println("이름\t나이\t주소");

		for (int i = 0; i < index; i++) {
			System.out.println(s[i].getName() + "\t" + s[i].getAge() + "\t" + s[i].getAddr());
		}
	}

	public void printOneMember(Student s) {
		System.out.println("===== 학생 1명 조회 =====");
		System.out.println("이름 : " + s.getName());
		System.out.println("나이 : " + s.getAge());
		System.out.println("주소 : " + s.getAddr());
		System.out.println("학생 조회 완료");
	}

	public String inputName() {
		System.out.print("찾을 학생 이름 : ");
		return sc.next();
	}

	public void printString(String printStr) {
		System.out.println(printStr);
	}

}