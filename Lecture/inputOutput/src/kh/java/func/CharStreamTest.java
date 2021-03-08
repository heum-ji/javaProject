package kh.java.func;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamTest {

	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일 명 입력 : ");
		String fileName = sc.next();
		sc.nextLine();

		FileWriter fw = null;
		try {
			fw = new FileWriter("C:\\Users\\heum\\Desktop\\" + fileName);
			System.out.print("'" + fileName + "' 파일에 저장될 내용 입력 : ");
			System.out.println("종료는 exit");
			int lineNum = 1;

			while (true) {
				System.out.print((lineNum++) + " : ");
				String str = sc.nextLine() + "\r\n";
				if (str.equals("exit\r\n")) {
					break;
				}
				fw.write(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void subStream() {
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 입력 : ");
		String fileName = sc.next();
		sc.nextLine();
		BufferedWriter bw = null;

		try {
			// 주 스트림 생성
			FileWriter fw = new FileWriter(fileName);
			// 생성된 주 스트림을 이용한 보조스트림 생성
			bw = new BufferedWriter(fw);
			System.out.println("[" + fileName + "] 파일에 저장될 내용 입력");
			System.out.println("종료는 exit");

			int lineNum = 1;

			while (true) {
				System.out.println((lineNum++) + " : ");
				String str = sc.nextLine();

				if (str.equals("exit")) {
					break;
				}
				bw.write(str);
				bw.newLine(); // 개행 - 보조 스트림에만 존재하는 추가적인 기능 - \r\n
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 보조 스트림을 닫는 경우 주 스트림은 같이 닫힘
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void charStreamReader() {
		Scanner sc = new Scanner(System.in);
		// 1. 스트림 생성(객체를 생성) 2. 메서드를 이용한 입력 or 출력 3. 자원 반환
		System.out.print("로드 할 파일명 입력 : ");
		String fileName = sc.next();
		sc.nextLine();
		// 데이터를 읽어올 예정이므로 Reader 사용
		BufferedReader br = null;

		try {
			// 주 스트림 생성
			FileReader fr = new FileReader(fileName);
			// 주 스트림을 이용하여 보조 스트림 생성
			br = new BufferedReader(fr);
			while (true) {
				// 파일에서 1줄을 읽어옴
				// 더이상 읽어올 값이 없으면 null을 리턴
				String str = br.readLine();

				if (str == null) {
					break;
				}
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}