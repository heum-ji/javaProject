package kh.controller;

import java.util.Scanner;

public class StudentMgr {
    // 10명 학생정보를 입력/출력/수정/삭제 하는 프로그램
    // 학생정보 이름/나이/주소
    String[] name; // 이름 저장할 배열
    int[] age; // 나이 저장할 배열
    String[] addr; // 주소 저장할 배열
    int index; // 배열 관리번호
    Scanner sc;

    public StudentMgr() {
	name = new String[10];
	age = new int[10];
	addr = new String[10];
	index = 0;
	sc = new Scanner(System.in);
	System.out.println("프로그램 구동 준비 완료");
    }

    // 전체 진행 메뉴
    public void main() {

	while (true) {
	    System.out.println("\n----- 학생관리 프로그램 v1 ----\n");
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
		System.out.println("Bye~!");
		return;
	    default:
		System.out.println("잘못입력하셨습니다.");
		break;
	    }
	}
    }

    /**
     * 학생정보를 입력받아 배열에 넣어주는 메서드
     */
    public void insertStudent() {
	System.out.println("\n----- 학생 정보 등록 -----\n");
	System.out.print("이름 입력 : ");
	String inputName = sc.next();
	System.out.print("나이 입력 : ");
	int inputAge = sc.nextInt();
	System.out.print("주소 입력 : ");
	sc.nextLine(); // 버퍼 개행문자 제거
	String inputAddr = sc.nextLine();

	name[index] = inputName;
	age[index] = inputAge;
	addr[index] = inputAddr;
	index++;
	System.out.println("정보 등록 완료");
    }

    /**
     * 배열에 저장되어있는 모든 학생 정보를 출력하는 메서드
     */
    public void printAllStudent() {

	System.out.println("\n----- 전체 학생 정보 출력 -----\n");
	System.out.println("이름\t나이\t주소");
	System.out.println("---------------------------");
	for (int i = 0; i < index; i++) {
	    System.out.println(name[i] + "\t" + age[i] + "\t" + addr[i]);
	}
    }

    /**
     * 학생 이름을 입력 받아 해당 학생의 정보를 출력하는 메서드
     */
    public void printOneStudent() {
	System.out.println("\n ----- 학생 정보 출력 (1명) -----\n");
	System.out.print("조회할 학생 이름 입력 : ");
	String searchName = sc.next();
	int searchIndex = searchStudent(searchName);

	if (searchIndex == -1) {
	    System.out.println("학생 정보가 없습니다.");
	} else {
	    System.out.println("이름 : " + name[searchIndex]);
	    System.out.println("나이 : " + age[searchIndex]);
	    System.out.println("주소 : " + addr[searchIndex]);
	}
    }

    /**
     * 학생 이름을 입력 받아 학생의 정보를 수정하는 메서드
     */
    public void modifyStudent() {
	System.out.println("\n ----- 학생 정보 수정 -----\n");
	System.out.print("수정할 학생 이름 입력 : ");
	String searchName = sc.next();
	int searchIndex = searchStudent(searchName);

	if (searchIndex == -1) { // 학생 정보가 없는 경우
	    System.out.println("학생 정보가 없습니다.");
	} else {
	    System.out.print("이름 입력 : ");
	    String inputName = sc.next();
	    System.out.print("나이 입력 : ");
	    int inputAge = sc.nextInt();
	    System.out.print("주소 입력 : ");
	    sc.nextLine(); // 버퍼 개행문자 제거
	    String inputAddr = sc.nextLine();

	    name[searchIndex] = inputName;
	    age[searchIndex] = inputAge;
	    addr[searchIndex] = inputAddr;

	    System.out.println("수정 완료");
	}
    }

    public void deleteStudent() {
	System.out.println("\n ----- 학생 정보 삭제 -----\n");
	System.out.print("삭제할 학생 이름 입력 : ");
	String searchName = sc.next();
	int searchIndex = searchStudent(searchName);

	if (searchIndex == -1) { // 학생 정보가 없는 경우
	    System.out.println("학생 정보가 없습니다.");
	} else {
	    System.out.println(searchIndex + "번쨰 지워");
	    for (int i = searchIndex; i < index - 1; i++) {
		name[i] = name[i + 1];
		age[i] = age[i + 1];
		addr[i] = addr[i + 1];
	    }
	    index--;
	}
    }

    public int searchStudent(String searchName) {

	for (int i = 0; i < index; i++) {
	    if (name[i].equals(searchName)) {
		return i;
	    }
	}
	return -1;
    }
}
