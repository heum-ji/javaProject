package kr.or.iei.view;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import kr.or.iei.vo.Student;

public class StudentView {
	Scanner sc;

	public StudentView() {
		super();
		sc = new Scanner(System.in);
	}

	public int showMenu() {
		System.out.println("===== 학생 관리 프로그램 v5 =====");
		System.out.println("1. 학생 등록");
		System.out.println("2. 전체 학생 조회");
		System.out.println("3. 학생 1명 조회");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("0. 종료");
		System.out.print("선택 > ");

		return sc.nextInt();
	}

	public Student getStudent(String str) {
		System.out.print(str + "할 학생 이름 입력 : ");
		String name = sc.next();
		System.out.print(str + "할 학생 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print(str + "할 학생 주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();

		return new Student(name, age, addr);
	}

	public String getName(String str) {
		System.out.print(str + "할 이름 입력 : ");

		return sc.next();
	}

	public void printAllStudent(HashMap<String, Student> students) {
		System.out.println("===== 학생 전체 출력 =====");
		System.out.println("이름\t나이\t주소");

		Set<String> keys = students.keySet(); // 키 값 추출

		for (String key : keys) {
			System.out.println(students.get(key));
		}
	}

	public void printOneStudent(Student s) {
		System.out.println("\n이름\t나이\t주소");
		System.out.println(s);
	}

	public void printMsg(String msg) {
		System.out.println(msg);
	}
}
