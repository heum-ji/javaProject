package kh.java.func;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UserMgr {
	Scanner sc;
	User user;

	public UserMgr() {
		super();
		sc = new Scanner(System.in);
	}

	public void main() {
		while (true) {
			System.out.println("\n===== UserMgr =====");
			System.out.println("1. 유저 정보 등록");
			System.out.println("2. 유저 정보 출력");
			System.out.println("3. 유저 정보 불러오기");
			System.out.println("4. 유저 정보 내보내기");
			System.out.println("0. 종료");
			System.out.print("선택 > ");

			switch (sc.nextInt()) {
			case 1:
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				System.out.print("주소 입력 : ");
				sc.nextLine();
				String addr = sc.nextLine();
				user = new User(name, age, addr);
				System.out.println("회원 등록 완료");
				break;
			case 2:
				if (user != null) {
					System.out.println("회원 정보 출력");
					System.out.println("이름 : " + user.getName());
					System.out.println("나이 : " + user.getAge());
					System.out.println("주소 : " + user.getAddr());
				} else {
					System.out.println("회원 정보가 없습니다.");
				}
				break;
			case 3:
				objectInput();
				break;
			case 4:
				objectOutput();
				break;
			case 0:
				return;
			default:
				System.out.println("잘못 입력함");
				break;
			}
		}
	}

	public void objectInput() {
		ObjectInputStream ois = null;
		try {
			System.out.print("읽어올 파일 이름 : ");
			String fileName = sc.next();
			// byte 주 스트림 생성
			FileInputStream fis = new FileInputStream(fileName);
			// 객체를 읽어오기위한 보조 스트림 생성
			ois = new ObjectInputStream(fis);
			// 객체를 읽어 오는 코드
			user = (User) ois.readObject();
			System.out.println("불러오기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void objectOutput() {
		if (user != null) {
			ObjectOutputStream oos = null;
			try {
				// byte 주 스트림 생성
				FileOutputStream fos = new FileOutputStream("object.txt");
				// 객체를 내보내기 위한 보조 스트림 생성
				oos = new ObjectOutputStream(fos);
				// 객체를 내보내는 코드
				oos.writeObject(user);
				System.out.println("내보내기 완료");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("User가 없습니다.");
		}

	}
}