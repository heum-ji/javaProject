package kh.java.func;

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

}