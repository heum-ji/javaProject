package kh.controller;

import java.util.Scanner;
import kh.vo.Student;

public class StudentMgr {
	Scanner sc;
	Student[] students; // 학생 정보를 저장할 객체배열
	int index; // 배열을 관리하기 위한 변수

	public StudentMgr() {
		sc = new Scanner(System.in);
		students = new Student[10];
		index = 0;
	}

	public void main() {
		while (true) {
			System.out.println("\n----- 학생관리 프로그램 v2 ----\n");
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 정보 출력(전체)");
			System.out.println("3. 학생 정보 출력(1명 이름으로 검색)");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();

			switch (sel) {
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
				deleteStudent();
				break;
			case 0:
				System.out.println("Bye~");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}

	public void insertStudent() {
		System.out.println("\n----- 학생 정보 등록 -----\n");

		System.out.print("학생 이름 입력 : ");
		String name = sc.next();
		System.out.print("학생 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("학생 주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();

		// 매개변수 있는 생성자를 통해서 객체 생성하며 값을 대입
		Student s = new Student(name, age, addr); // 입력받은 값을 대입하며 Student 객체 생성
		// 내부 배열에 s객체 추가
		students[index] = s;
		index++;
	}

	public void printAllStudent() {
		System.out.println("\n----- 학생 정보 출력(전체) -----\n");
		System.out.println("이름\t나이\t주소");
		System.out.println("--------------------");

		for (int i = 0; i < index; i++) {
			System.out.println(students[i].getName() + "\t" + students[i].getAge() + "\t" + students[i].getAddr());
		}
	}

	public void printOneStudent() {
		System.out.println("\n ----- 학생 정보 출력 (1명) -----\n");
		System.out.print("조회할 학생 이름 입력 : ");
		String searchName = sc.next();
		int searchIndex = searchStudent(searchName);

		if (searchIndex == -1) {
			System.out.println("학생 정보가 없습니다.");
		} else {
			System.out.println("이름 : " + students[searchIndex].getName());
			System.out.println("나이 : " + students[searchIndex].getAge());
			System.out.println("주소 : " + students[searchIndex].getAddr());
		}
	}

	public void modifyStudent() {
		System.out.println("\n ----- 학생 정보 수정 -----\n");
		System.out.print("수정할 학생 이름 입력 : ");
		String searchName = sc.next();
		int searchIndex = searchStudent(searchName);

		if (searchIndex == -1) { // 학생 정보가 없는 경우
			System.out.println("학생 정보가 없습니다.");
		} else {
			System.out.print("이름 입력 : ");
			students[searchIndex].setName(sc.next());
			System.out.print("나이 입력 : ");
			students[searchIndex].setAge(sc.nextInt());
			System.out.print("주소 입력 : ");
			sc.nextLine(); // 버퍼 개행문자 제거
			students[searchIndex].setAddr(sc.nextLine());

			System.out.println("수정 완료");
		}
	}

	public void deleteStudent() {
		System.out.println("\n ----- 학생 정보 삭제 -----\n");
		System.out.print("삭제할 학생 이름 입력 : ");
		int searchIndex = searchStudent(sc.next());

		if (searchIndex == -1) { // 학생 정보가 없는 경우
			System.out.println("학생 정보가 없습니다.");
		} else {
			for (int i = searchIndex; i < index - 1; i++) {
				students[i] = students[i + 1];
			}
			// 삭제 처리
			students[--index] = null;
			System.out.println("삭제 완료");
		}
	}

	public int searchStudent(String searchName) {

		for (int i = 0; i < index; i++) {
			if (students[i].getName().equals(searchName)) {
				return i;
			}
		}
		return -1;
	}
}